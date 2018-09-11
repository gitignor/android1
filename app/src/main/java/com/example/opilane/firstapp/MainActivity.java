package com.example.opilane.firstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button nupp;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nupp = findViewById(R.id.Loomad);

        nupp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String url= "http://tallinnzoo.ee/en/";
                Intent zoo = new Intent(Intent.ACTION_VIEW);
                zoo.setData(Uri.parse(url));
                startActivity(zoo);
            }
        });
        //TODO: 1 Kirjuta koodi

    }

    public void vajutus(View view) {
        Intent pildid = new Intent( MainActivity.this, PildiActivity.class);
        startActivity(pildid);
        message ("Change view");
        Log.i(TAG,  "Change main view for another");

    }

    //using Toast to show message to user
    public void message (String message){
        //standart text structure
        Toast.makeText( this, message, Toast.LENGTH_SHORT).show();
    }
}
