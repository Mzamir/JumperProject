package com.example.mahmoud.jumperupdate.viewcontroler;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.mahmoud.jumperupdate.R;

/**
 * Created by Mahmoud on 12/5/2015.
 */
public class Aboutus extends ActionBarActivity {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    private ListView leftDrawerList;
    private DrawerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle("About us");
            toolbar.setTitleTextColor(Color.WHITE);
            toolbar.setLogo(R.drawable.logoicon_navbar);
            //setSupportActionBar(toolbar);
        }
        init();
    }

    private void init() {
        ImageView facebookIcon = (ImageView) findViewById(R.id.facebookIcon);
        ImageView instagramIcon = (ImageView) findViewById(R.id.instagramIcon);
        ImageView websiteIcon = (ImageView) findViewById(R.id.websiteIcon);
        facebookIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FacebookListener();
            }
        });
        facebookIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InstagramListener();
            }
        });
        websiteIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebsiteListern();
            }
        });
    }

    void FacebookListener() {

    }

    void InstagramListener() {

    }

    void WebsiteListern() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        //inflater.inflate(R.menu.notification_actionbar, menu);
        return super.onCreateOptionsMenu(menu);
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