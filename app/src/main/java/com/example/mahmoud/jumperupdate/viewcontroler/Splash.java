package com.example.mahmoud.jumperupdate.viewcontroler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.mahmoud.jumperupdate.R;

/**
 * Created by Mahmoud on 12/4/2015.
 */
public class Splash extends Activity {

    private static final int WAITTIME = 2000;
    private static final int SLEEPTIME = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);


        Thread splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // sleep(WAITTIME) ;
                    while (waited < WAITTIME) {
                        sleep(SLEEPTIME);
                        waited += SLEEPTIME;
                    }
                } catch (InterruptedException e) {
                } finally {
                    finish();
                    Intent i = new Intent(Splash.this, WalkThrough.class);
                    startActivity(i);

                }
            }
        };
        splashThread.start();

    }
}
