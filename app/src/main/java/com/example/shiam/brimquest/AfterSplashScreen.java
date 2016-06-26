package com.example.shiam.brimquest;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AfterSplashScreen extends Activity {

    Button bbogra,bsylhet,bdhaka,bchittagong,brajshahi,bkhulna,brangpur,bjoypurhat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bbogra = (Button)findViewById(R.id.bogra);
        bsylhet = (Button)findViewById(R.id.sylhet);
        bdhaka = (Button)findViewById(R.id.dhaka);
        bchittagong = (Button)findViewById(R.id.chittagong);
        brajshahi = (Button)findViewById(R.id.rajshahi);
        bkhulna = (Button)findViewById(R.id.khulna);
        brangpur = (Button)findViewById(R.id.rangpur);
        bjoypurhat = (Button)findViewById(R.id.joypurhat);
    }

    public void clickCity(View v){
        Intent findwhatintent = new Intent(this,FindWhat.class);
        startActivity(findwhatintent);

    }

    @Override
    protected void onPause() {

        super.onPause();
    }
}
