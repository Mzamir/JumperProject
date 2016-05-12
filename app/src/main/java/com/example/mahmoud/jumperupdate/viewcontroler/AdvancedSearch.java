package com.example.mahmoud.jumperupdate.viewcontroler;

import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.mahmoud.jumperupdate.R;

/**
 * Created by Mahmoud on 12/4/2015.
 */
public class AdvancedSearch extends ActionBarActivity {
    private Toolbar toolbar;
    private DurationPicker duration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advanced_search);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle("Advanced Search");
            toolbar.setTitleTextColor(Color.WHITE);
            toolbar.setLogo(R.drawable.advsearch_icon_navbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        init();
    }

    private void init() {
        final LinearLayout startDateListener = (LinearLayout) findViewById(R.id.start_data_adv_search);
        LinearLayout endDateListener = (LinearLayout) findViewById(R.id.end_data_adv_search);
        LinearLayout freeTimeListener = (LinearLayout) findViewById(R.id.free_time_adv_search);
        LinearLayout budgetListener = (LinearLayout) findViewById(R.id.budget_adv_search);
        LinearLayout placeListener = (LinearLayout) findViewById(R.id.place_adv_search);
        LinearLayout activitiesListener = (LinearLayout) findViewById(R.id.activties_adv_search);
        LinearLayout transportationListener = (LinearLayout) findViewById(R.id.transportation_adv_search);
        //LinearLayout companyListener = (LinearLayout) findViewById(R.id.company_adv_search);

        startDateListener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*startDatePopUp();*/
                DialogFragment dialogFragment = new StartDateFragment();
                dialogFragment.show(getFragmentManager(), "DatePicker");
            }
        });
        endDateListener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment dialogFragment = new EndDateFragment();
                dialogFragment.show(getFragmentManager(), "DatePicker");
            }
        });
        freeTimeListener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment durationPicker = new DurationPicker();
                durationPicker.show(getFragmentManager(), "DatePicker");
            }
        });
        budgetListener.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(AdvancedSearch.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.budget);

                TextView set = (TextView) dialog.findViewById(R.id.budgetSet);
                TextView cancel = (TextView) dialog.findViewById(R.id.budgetCancel);
                final TextView startText = (TextView) dialog.findViewById(R.id.Starttext);
                final TextView endText = (TextView) dialog.findViewById(R.id.endText);
                SeekBar startBar = (SeekBar) dialog.findViewById(R.id.startSeekBar);
                SeekBar endBar = (SeekBar) dialog.findViewById(R.id.EndSeekBar);

                startBar.setProgress(10);
                startBar.setMax(10000);

                endBar.setProgress(100);
                endBar.setMax(10000);
                startBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        startText.setText(String.valueOf(progress));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                });
                endBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        endText.setText(String.valueOf(progress));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                });

                set.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.hide();
                    }
                });
                dialog.show();
            }
        });

        activitiesListener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(AdvancedSearch.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.activities_dialog);
                TextView set = (TextView) dialog.findViewById(R.id.activitesSet);
                TextView cancel = (TextView) dialog.findViewById(R.id.activitesCancel);
                final RadioButton beach = (RadioButton) dialog.findViewById(R.id.beachradioButton);
                final RadioButton diving = (RadioButton) dialog.findViewById(R.id.divingradioButton);
                final RadioButton museums = (RadioButton) dialog.findViewById(R.id.museumsradioButton);
                final RadioButton parasailing = (RadioButton) dialog.findViewById(R.id.parasailingradioButton);
                beach.setChecked(false);
                diving.setChecked(false);
                museums.setChecked(false);
                parasailing.setChecked(false);

                set.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.hide();
                    }
                });
                dialog.show();
            }
        });

        transportationListener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransportationPopUp();

            }
        });

    }

    private void startDatePopUp() {
        /*final Dialog startDate = new Dialog(this);
        startDate.requestWindowFeature(Window.FEATURE_NO_TITLE);
        startDate.setContentView(R.layout.start_date_dialog);

        TextView done = (TextView) startDate.findViewById(R.id.dialogDone);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDate.hide();
            }
        });
        startDate.show();*/
    }

    private void endDataPopUp() {
        final Dialog startDate = new Dialog(this);
        startDate.requestWindowFeature(Window.FEATURE_NO_TITLE);
        startDate.setContentView(R.layout.end_date_dialog);

        TextView done = (TextView) startDate.findViewById(R.id.dialogDone);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDate.hide();
            }
        });
        startDate.show();
    }

    private void budgetDatePopUp() {
        final Dialog startDate = new Dialog(this);
        startDate.requestWindowFeature(Window.FEATURE_NO_TITLE);
        startDate.setContentView(R.layout.budget);

       /* TextView done = (TextView) startDate.findViewById(R.id.dialogDone);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDate.hide();
            }
        });*/
        startDate.show();
    }

    private void TransportationPopUp() {
        final Dialog startDate = new Dialog(this);
        startDate.requestWindowFeature(Window.FEATURE_NO_TITLE);
        startDate.setContentView(R.layout.transportation_dilog);

        /*DialogFragment transportationDialog= new TransportationDialog() ;
        transportationDialog.show(getFragmentManager(), "DatePicker");*/

        GridView gridview = (GridView) startDate.findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

            }
        });
        TextView done = (TextView) startDate.findViewById(R.id.dialogDone);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDate.hide();
            }
        });
        startDate.show();
    }

    private void ActivitiesPopUp() {
        final Dialog startDate = new Dialog(this);
        startDate.requestWindowFeature(Window.FEATURE_NO_TITLE);
        startDate.setContentView(R.layout.activities_dialog);

        TextView done = (TextView) startDate.findViewById(R.id.dialogDone);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDate.hide();
            }
        });
        startDate.show();
    }

    private void DurationPopUp() {
        final Dialog startDate = new Dialog(this);
        startDate.requestWindowFeature(Window.FEATURE_NO_TITLE);
        startDate.setContentView(R.layout.timeduration_item);

        TextView done = (TextView) startDate.findViewById(R.id.dialogDone);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDate.hide();
            }
        });
        startDate.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
