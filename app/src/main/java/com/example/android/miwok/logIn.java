package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

/**
 * Created by Gregorio on 04/05/2017.
 *
 * We'll need to import a Spotify Library for the user Authentication
 *
 * https://spotify.github.io/android-sdk/player/overview-summary.html
 *
 */

public class logIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Sets the Activity Window to the Log In Page
        setContentView(R.layout.activity_log_in);


    }

}