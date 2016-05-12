package com.example.mahmoud.jumperupdate.viewcontroler;

import android.annotation.TargetApi;
import android.app.DialogFragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.example.mahmoud.jumperupdate.R;

/**
 * Created by Mahmoud on 12/5/2015.
 */
public class Settings extends Fragment {

    LinearLayout button, button1, button2;
    private Toolbar toolbar;

    public static Settings newInstance() {
        Settings fragment = new Settings();
        Bundle args = new Bundle();

        return fragment;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.settings, null);
        final Switch notificationSwitch = (Switch) v.findViewById(R.id.notification_switch);
        final Switch facebookSwitch = (Switch) v.findViewById(R.id.facebook_switch);
        final Switch googleSwitch = (Switch) v.findViewById(R.id.googlePlusswitch);

        //Notification Switch
        notificationSwitch.setChecked(true);
        notificationSwitch.setBackground(getActivity().getResources().getDrawable(R.drawable.switchbtn_open));
        notificationSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    notificationSwitch.setBackground(getActivity().getResources().getDrawable(R.drawable.switchbtn_open));
                } else {
                    notificationSwitch.setBackground(getActivity().getResources().getDrawable(R.drawable.switchbtn_closed));
                }
            }
        });

        //FaceBook Switch
        facebookSwitch.setChecked(false);
        facebookSwitch.setBackground(getActivity().getResources().getDrawable(R.drawable.switchbtn_closed));
        facebookSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    facebookSwitch.setBackground(getActivity().getResources().getDrawable(R.drawable.switchbtn_closed));
                } else {
                    facebookSwitch.setBackground(getActivity().getResources().getDrawable(R.drawable.switchbtn_open));
                }
            }
        });
        // GOOGLE SWITCH
        googleSwitch.setChecked(false);
        googleSwitch.setBackground(getActivity().getResources().getDrawable(R.drawable.switchbtn_closed));
        googleSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    googleSwitch.setBackground(getActivity().getResources().getDrawable(R.drawable.switchbtn_open));
                } else {
                    googleSwitch.setBackground(getActivity().getResources().getDrawable(R.drawable.switchbtn_closed));
                }
            }
        });
        TextView aboutus = (TextView) v.findViewById(R.id.setting_aboutus);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Aboutus.class);
                startActivity(intent);
            }
        });
        TextView feedback = (TextView) v.findViewById(R.id.setting_feedback);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment feedback = new Help();
                feedback.show(getActivity().getFragmentManager(), "Feedback");
            }
        });
        toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle("Setting");
            toolbar.setTitleTextColor(Color.WHITE);
            toolbar.setLogo(R.drawable.logoicon_navbar);
//            ((ActionBarActivity) getActivity()).setSupportActionBar(toolbar);
        }
        addListenerOnButton(v);
        return v;
    }

    public void addListenerOnButton(View v) {
    }

    private void loadSavedPreferences() {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        boolean checkBoxValue = sharedPreferences.getBoolean("CheckBox_Value", false);

    }

    private void savePreferences(String key, String value) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    private void savePreferences(String key, boolean value) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }
}