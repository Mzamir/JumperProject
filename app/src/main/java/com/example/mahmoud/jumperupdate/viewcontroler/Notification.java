package com.example.mahmoud.jumperupdate.viewcontroler;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.mahmoud.jumperupdate.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahmoud on 12/4/2015.
 */
public class Notification extends ActionBarActivity {
    private List<NotificationItem> notificationList;
    private NotificationAdapter notificationAdapter;
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    private ListView leftDrawerList;
    private DrawerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_listview);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle("Notifications");
            toolbar.setTitleTextColor(Color.WHITE);
            toolbar.setLogo(R.drawable.logoicon_navbar);

            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        //createActionbar();
        init();
    }
    private void init() {
        ListView notification_LV = (ListView) findViewById(R.id.notification_listview);
        notificationList = new ArrayList<NotificationItem>();
        notificationAdapter = new NotificationAdapter(this, notificationList);
        notification_LV.setAdapter(notificationAdapter);
        fillListView();
    }

    /*private void createActionbar(){
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.logoicon_navbar);
        actionBar.setTitle(getString(R.string.notificationtitle));
        actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.redpink));
        actionBar.setStackedBackgroundDrawable(getResources().getDrawable(R.drawable.lighgrey));
    }*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        //inflater.inflate(R.menu.notification_actionbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void fillListView() {
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));
        notificationList.add(new NotificationItem("", "Sharm El-Shekh", "Traveling Agancy"));

        notificationAdapter.notifyDataSetChanged();

    }

}
