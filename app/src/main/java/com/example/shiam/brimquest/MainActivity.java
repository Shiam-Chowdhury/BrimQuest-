package com.example.shiam.brimquest;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_first_screen);
        Thread firstScreenTimer = new Thread(){
            public void run(){
                try {
                    sleep(5000);
                    Intent splashfirst = new Intent("com.example.shiam.SPLASHFIRSTSCREEN");
                    startActivity(splashfirst);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    finish();
                }
            }
        };
        firstScreenTimer.start();

    }


}
