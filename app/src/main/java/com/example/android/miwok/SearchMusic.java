package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SearchMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_search_music.xml layout file
        setContentView(R.layout.activity_search_music);


        // Find the View that shows the Search Home Icon
        ImageView searchIconHome = (ImageView) findViewById(R.id.searchHome);

// Set a click listener on the Search Home Icon Image View
        searchIconHome.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home Icon ImageView in the Search Category is clicked on.
            @Override
            public void onClick(View view) {
                Intent myHomeIntent = new Intent(SearchMusic.this, MainActivity.class);
                startActivity(myHomeIntent);
            }
        });


        // Find the View that shows the Favourites Icon
        ImageView searchIconFavourites = (ImageView) findViewById(R.id.searchFavourites);

// Set a click listener on the Favourite Icon Image View
        searchIconFavourites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Favourites Icon ImageView in the Search Category is clicked on.
            @Override
            public void onClick(View view) {
                Intent myFavouritesIntent = new Intent(SearchMusic.this, MyFavourites.class);
                startActivity(myFavouritesIntent);
            }
        });

        //Find The View tha contains my Now Playing Icon in the Search Window
        ImageView searchIconNowPlaying = (ImageView) findViewById(R.id.searchNowPlaying);

        //Set a click Listener on the Now Playing view
        searchIconNowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing Icon ImageView in the Search Category is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(SearchMusic.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });


        //Find The View tha contains my Library Icon in the Search Window
        ImageView searchIconMyLibrary = (ImageView) findViewById(R.id.searchMyLibrary);

        //Set a click Listener on the My Library view
        searchIconMyLibrary.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when My Library Icon ImageView in the Search Category is clicked on.
            @Override
            public void onClick(View view) {
                Intent myLibraryIntent = new Intent(SearchMusic.this, MyLibrary.class);
                startActivity(myLibraryIntent);
            }
        });



    }
}
