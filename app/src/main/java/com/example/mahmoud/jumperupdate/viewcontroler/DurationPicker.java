package com.example.mahmoud.jumperupdate.viewcontroler;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.NumberPicker;

import com.example.mahmoud.jumperupdate.R;

/**
 * Created by Mahmoud on 12/4/2015.
 */
@SuppressLint("InflateParams")
public class DurationPicker extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View multiPickerLayout = LayoutInflater.from(getActivity()).inflate(R.layout.timeduration_item, null);
        NumberPicker numberPicker = (NumberPicker) multiPickerLayout.findViewById(R.id.numberPicker);
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(100);
        numberPicker.setWrapSelectorWheel(false);

        NumberPicker TypeNumberPicker = (NumberPicker) multiPickerLayout.findViewById(R.id.typeNumberPicker);
        TypeNumberPicker.setMinValue(0);
        TypeNumberPicker.setMaxValue(2);
        TypeNumberPicker.setWrapSelectorWheel(false);
        TypeNumberPicker.setDisplayedValues(new String[]{"Day", "Week", "Month"});

        /*DialogInterface.OnClickListener dialogButtonListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch(which) {
                    case DialogInterface.BUTTON_NEGATIVE: {
                        // user tapped "cancel"
                        dialog.dismiss();
                        break;
                    }
                    case DialogInterface.BUTTON_POSITIVE: {
                        // user tapped "set"
                        // here, use the "multiPickerDate" and "multiPickerTime" objects to retreive the date/time the user selected
                        break;
                    }
                    default: {
                        dialog.dismiss();
                        break;
                    }
                }
            }
        };
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(multiPickerLayout);
        builder.setPositiveButton("Done", dialogButtonListener);
        builder.setNegativeButton("Cancel", dialogButtonListener);
        builder.show();*/

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();
        //builder.setTitle("Activities") ;

        builder.setView(multiPickerLayout)
                // Add action buttons
                .setPositiveButton(R.string.Done, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // sign in the user ...
                    }
                })
                .setNegativeButton(R.string.Cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        DurationPicker.this.getDialog().cancel();
                    }
                });
        return builder.create();
    }
}