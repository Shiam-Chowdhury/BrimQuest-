package com.example.shiam.brimquest;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashFirstScreen extends Activity {


    Button b,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_splash_screen);
        b = (Button)findViewById(R.id.selectcity);
        b2 = (Button)findViewById(R.id.aboutapp);

    }

    public void selectYourCity(View v){
        Intent intentSelectCity = new Intent(this,AfterSplashScreen.class);
        startActivity(intentSelectCity);
    }

    public void clickAboutApp(View v){
        Intent intentAboutApp = new Intent(this,AboutApp.class);
        startActivity(intentAboutApp);
    }

    @Override
    protected void onPause() {

        super.onPause();
    }
}
