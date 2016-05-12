package com.example.mahmoud.jumperupdate.viewcontroler;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.mahmoud.jumperupdate.R;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class WalkThrough extends Activity {

    private static final int REQUEST_IMAGE_CAPTURE = 1;
    private static final int SELECT_FILE = 1;
    String Email, Password, name, phone;
    ImageView ivImage = null;
    //RequestQueue requestQueue = Volley.newRequestQueue(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.walkthrough);
        init();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == REQUEST_IMAGE_CAPTURE) {

                // Get Data into the intent
                Bundle extras = data.getExtras();
                Bitmap thumbnail = (Bitmap) extras.get("data");
                //Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
                //Compress El-Data
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                //format , Quality ,
                thumbnail.compress(Bitmap.CompressFormat.JPEG, 90, bytes);
                File destination = new File(Environment.getExternalStorageDirectory(),
                        System.currentTimeMillis() + ".jpg");
                FileOutputStream fo;
                try {
                    destination.createNewFile();
                    fo = new FileOutputStream(destination);
                    fo.write(bytes.toByteArray());
                    fo.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ivImage.setImageBitmap(thumbnail);
            }
           /* else if (requestCode == SELECT_FILE) {
                Uri selectedImageUri = data.getData();
                String[] projection = { MediaStore.MediaColumns.DATA };
                Cursor cursor = managedQuery(selectedImageUri, projection, null, null,
                        null);
                int column_index = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DATA);
                cursor.moveToFirst();
                String selectedImagePath = cursor.getString(column_index);
                Bitmap bm;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(selectedImagePath, options);
                final int REQUIRED_SIZE = 200;
                int scale = 1;
                while (options.outWidth / scale / 2 >= REQUIRED_SIZE
                        && options.outHeight / scale / 2 >= REQUIRED_SIZE)
                    scale *= 2;
                options.inSampleSize = scale;
                options.inJustDecodeBounds = false;
                bm = BitmapFactory.decodeFile(selectedImagePath, options);
                ivImage.setImageBitmap(bm);
            }*/
        }
    }

    private void init() {
        TextView signUp = (TextView) findViewById(R.id.signup);
        TextView continueText = (TextView) findViewById(R.id.continueasaGuest);
        Button alreadyJumper = (Button) findViewById(R.id.alreadyjumper);

        /*LISTENERS*/
        continueText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContinueTextListener();
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createSignUpPopUp();
            }
        });
        alreadyJumper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createLoginPopUp();
            }
        });
    }

    ;

    private void ContinueTextListener() {
        Intent intent = new Intent(WalkThrough.this, MainActivity.class);
        startActivity(intent);
    }

    private void createSignUpPopUp() {
        final Dialog signUpDialog = new Dialog(this);
        signUpDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        signUpDialog.setContentView(R.layout.signup_dialog);

        ImageView profilePicture = (ImageView) signUpDialog.findViewById(R.id.profilePicture);
        profilePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectImage();
            }
        });
        Button signUp = (Button) signUpDialog.findViewById(R.id.signup);
        final EditText name = (EditText) signUpDialog.findViewById(R.id.signupname);
        final EditText password = (EditText) signUpDialog.findViewById(R.id.signupPassword);
        final EditText email = (EditText) signUpDialog.findViewById(R.id.signupemail);
        final EditText phone = (EditText) signUpDialog.findViewById(R.id.signupphone);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password.getText().toString().isEmpty()) {
                    password.setError("Fill Password");
                } else if (name.getText().toString().isEmpty()) {
                    name.setError("Fill name");
                } else if (email.getText().toString().isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()) {
                    email.setError("Invalid Email address");
                } else {
                    signup(name.getText().toString() , email.getText().toString() , password.getText().toString(),phone.getText().toString());
                }
            }
        });
        signUpDialog.show();
    }

    private void selectImage() {
        final Dialog selectPhotoDialog = new Dialog(this);
        selectPhotoDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        selectPhotoDialog.setContentView(R.layout.select_photo_dialog);

        TextView takePhoto = (TextView) selectPhotoDialog.findViewById(R.id.takePhoto);
        TextView chooseFromGallery = (TextView) selectPhotoDialog.findViewById(R.id.chooseFromGallery);
        Button cancel = (Button) selectPhotoDialog.findViewById(R.id.cancelSelectPhoto);

        takePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takePic();
            }
        });
        chooseFromGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*");
                startActivityForResult(
                        Intent.createChooser(intent, "Select File"), SELECT_FILE);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectPhotoDialog.hide();
            }
        });
        selectPhotoDialog.show();
    }

    private void takePic() {
        final int REQUEST_TAKE_PHOTO = 1;
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (intent.resolveActivity(getPackageManager()) != null) {
            // Create the File where the photo should go
            File photoFile = null;
            try {
                photoFile = createImageFile();
            } catch (IOException ex) {
                // Error occurred while creating the File
            }
            // Continue only if the File was successfully created
            if (photoFile != null) {
                intent.putExtra(MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(photoFile));
                startActivityForResult(intent, REQUEST_TAKE_PHOTO);
            }
        }
    }

    private File createImageFile() throws IOException {
        String mCurrentPhotoPath;
        // Create an image file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";
        File storageDir = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(
                imageFileName,  /* prefix */
                ".jpg",         /* suffix */
                storageDir      /* directory */
        );
        // Save a file: path for use with ACTION_VIEW intents
        mCurrentPhotoPath = "file:" + image.getAbsolutePath();
        return image;
    }

    private void createLoginPopUp() {
        Dialog logInDialog = new Dialog(this);
        logInDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        logInDialog.setContentView(R.layout.login_dialog);

        final EditText email = (EditText) logInDialog.findViewById(R.id.emailLoginDialog);
        final EditText password = (EditText) logInDialog.findViewById(R.id.PasswordLoginDialog);
        Button Login = (Button) logInDialog.findViewById(R.id.loginBuuton);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().isEmpty() || password.getText().toString().isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()) {
                    email.setError("invalid Email address");
                } else {
                    login(email.getText().toString(),password.getText().toString());
                }
            }
        });
        logInDialog.show();
    }
    public void login(final String email, final String password) {
        final String URL = "https://127.0.0.1/phpmyadmin/index.php?db=jumper&token=3d93a218d0d455245247b58819d16836";
        final String KEY_EMIAL = "email";
        final String KEY_PASSWORD = "password";
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if (response.trim().equals("success")) {
                    startActivity(new Intent(WalkThrough.this, MainActivity.class));
                } else {
                    Toast.makeText(WalkThrough.this, response, Toast.LENGTH_LONG).show();
                }
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(WalkThrough.this, error.toString(), Toast.LENGTH_LONG).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap<String, String>();
                map.put(KEY_EMIAL, email);
                map.put(KEY_PASSWORD, password);
                return map;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    public void signup(final String name , final String email , final String password , final String phone){
        final String URL = "http://simplifiedcoding.16mb.com/UserRegistration/volleyLogin.php";
        final String KEY_EMIAL = "email";
        final String KEY_PASSWORD = "password";
        final String KEY_NAME = "name";
        final String KEY_PHONE = "phone";

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if (response.trim().equals("success")) {
                    startActivity(new Intent(WalkThrough.this, MainActivity.class));
                } else {
                    Toast.makeText(WalkThrough.this, response, Toast.LENGTH_LONG).show();
                }
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(WalkThrough.this, error.toString(), Toast.LENGTH_LONG).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap<String, String>();
                map.put(KEY_EMIAL, email);
                map.put(KEY_PASSWORD, password);
                map.put(KEY_PHONE , phone   ) ;
                map.put(KEY_NAME , name) ;
                return map;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}





