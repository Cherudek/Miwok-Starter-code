package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MyFavourites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //set the view to my Favourites
        setContentView(R.layout.activity_my_favourites);


        //find view ID Home
        ImageView myFavouritesHome = (ImageView) findViewById(R.id.FavouritesHome);


// Set a click listener on the  Home Icon Image View
        myFavouritesHome.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home Icon ImageView in the My Library page Category is clicked on.
            @Override
            public void onClick(View view) {
                Intent favouritesHomeIntent = new Intent(MyFavourites.this, MainActivity.class);
                startActivity(favouritesHomeIntent);
            }
        });



        //find view ID Search
        ImageView favouritesSearch = (ImageView) findViewById(R.id.favouritesSearch);


// Set a click listener on the  Search Icon Image View
        favouritesSearch.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home Icon ImageView in the My Library page Category is clicked on.
            @Override
            public void onClick(View view) {
                Intent favouritesSearchIntent = new Intent(MyFavourites.this, SearchMusic.class);
                startActivity(favouritesSearchIntent);
            }
        });


        //find view Playing
        ImageView favouritesPlaying = (ImageView) findViewById(R.id.favouritesPlaying);


// Set a click listener on the  Playing Icon Image View
        favouritesPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home Icon ImageView in the My Library page Category is clicked on.
            @Override
            public void onClick(View view) {
                Intent favouritesPlayingIntent = new Intent(MyFavourites.this, NowPlaying.class);
                startActivity(favouritesPlayingIntent);
            }
        });

        //find view Library
        ImageView favouritesLibrary = (ImageView) findViewById(R.id.favouritesLibrary);


// Set a click listener on the  Library Icon Image View
        favouritesLibrary.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home Icon ImageView in the My Library page Category is clicked on.
            @Override
            public void onClick(View view) {
                Intent favouritesLibraryIntent = new Intent(MyFavourites.this, MyLibrary.class);
                startActivity(favouritesLibraryIntent);
            }
        });


    }
}
