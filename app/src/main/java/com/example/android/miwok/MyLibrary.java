package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MyLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Set the content of the activity to use the activity_my_Library.xml layout file
        setContentView(R.layout.activity_my_library);


        // Find the View that shows the Home Icon
        ImageView myLibraryIconHome = (ImageView) findViewById(R.id.myLibraryHome);

// Set a click listener on the Search Home Icon Image View
        myLibraryIconHome.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home Icon ImageView in the My Library page Category is clicked on.
            @Override
            public void onClick(View view) {
                Intent myLibraryHomeIntent = new Intent(MyLibrary.this, MainActivity.class);
                startActivity(myLibraryHomeIntent);
                finish();
            }
        });


        // Find the View that shows the Favourites Icon
        ImageView myLibraryIconFavourites = (ImageView) findViewById(R.id.myLibraryFavourites);

// Set a click listener on the Favourite Icon Image View
        myLibraryIconFavourites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Favourites Icon ImageView in the My Library Category is clicked on.
            @Override
            public void onClick(View view) {
                Intent myLibraryFavouritesIntent = new Intent(MyLibrary.this, MyFavourites.class);
                startActivity(myLibraryFavouritesIntent);
                finish();
            }
        });

        //Find The View tha contains my Now Playing Icon in the My Library Window
        ImageView myLibraryIconNowPlaying = (ImageView) findViewById(R.id.myLibraryPlaying);

        //Set a click Listener on the Now Playing view
        myLibraryIconNowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing Icon ImageView in the My Library Category is clicked on.
            @Override
            public void onClick(View view) {
                Intent myLibraryNowPlayingIntent = new Intent(MyLibrary.this, NowPlaying.class);
                startActivity(myLibraryNowPlayingIntent);
                finish();
            }
        });

        //Find The View tha contains my Library Icon in the Search Window
        ImageView searchIconMyLibrary = (ImageView) findViewById(R.id.myLibrarySearch);

        //Set a click Listener on the My Library view
        searchIconMyLibrary.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when My Library Icon ImageView in the Search Category is clicked on.
            @Override
            public void onClick(View view) {
                Intent myLibrarySearchIntent = new Intent(MyLibrary.this, SearchMusic.class);
                startActivity(myLibrarySearchIntent);
                finish();
            }
        });


    }
}
