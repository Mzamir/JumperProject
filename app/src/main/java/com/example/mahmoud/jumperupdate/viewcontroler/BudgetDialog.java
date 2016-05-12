package com.example.mahmoud.jumperupdate.viewcontroler;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.mahmoud.jumperupdate.R;

/**
 * Created by Mahmoud on 12/4/2015.
 */
public class BudgetDialog extends DialogFragment {
//    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        getActivity().getLayoutInflater().inflate(R.layout.budget, null);
//
//        final TextView startText = (TextView) getActivity().findViewById(R.id.Starttext);
//        TextView endtText = (TextView) getActivity().findViewById(R.id.endText);
//        final SeekBar startSeekBar = (SeekBar) getActivity().findViewById(R.id.startSeekBar);
//        SeekBar endSeekBar = (SeekBar) getActivity().findViewById(R.id.EndSeekBar);
//
//        startSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                startText.setText(progress);
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
//    }

    //@Nullable
    //@Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        inflater.inflate(R.layout.budget,container) ;
//        final TextView startText = (TextView) getActivity().findViewById(R.id.Starttext);
//        TextView endtText = (TextView) getActivity().findViewById(R.id.endText);
//        final SeekBar startSeekBar = (SeekBar) getActivity().findViewById(R.id.startSeekBar);
//        SeekBar endSeekBar = (SeekBar) getActivity().findViewById(R.id.EndSeekBar);
//
//        startSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                startText.setText(progress);
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
//        return super.onCreateView(inflater, container, savedInstanceState);
//    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();
        //builder.setTitle("Activities") ;
        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.budget, null))
                // Add action buttons
                .setPositiveButton(R.string.Done, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // sign in the user ...
                    }
                })
                .setNegativeButton(R.string.Cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        BudgetDialog.this.getDialog().cancel();
                    }
                });
        return builder.create();
    }
}


