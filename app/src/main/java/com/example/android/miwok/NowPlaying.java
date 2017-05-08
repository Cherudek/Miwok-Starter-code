package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

// We will need to import the Spotify Library for the Music Player

// https://spotify.github.io/android-sdk/player/

/*import com.spotify.sdk.android.player.Config;
import com.spotify.sdk.android.player.ConnectionStateCallback;
import com.spotify.sdk.android.player.Connectivity;
import com.spotify.sdk.android.player.Error;
import com.spotify.sdk.android.player.Metadata;
import com.spotify.sdk.android.player.PlaybackBitrate;
import com.spotify.sdk.android.player.PlaybackState;
import com.spotify.sdk.android.player.Player;
import com.spotify.sdk.android.player.PlayerEvent;
import com.spotify.sdk.android.player.Spotify;
import com.spotify.sdk.android.player.SpotifyPlayer;*/




public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the view to the activity now playing.xml
        setContentView(R.layout.activity_now_playing);

        //find the view ID for the home icon

        ImageView nowPlayingHome = (ImageView) findViewById(R.id.playingHomeIcon);

        //set an OnClick Listener on the Home Icon
        nowPlayingHome.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home Icon ImageView in the Now Playing Window is clicked on.
            @Override
            public void onClick(View view)  {
                Intent nowPlayingHomeIntent = new Intent (NowPlaying.this, MainActivity.class);
                startActivity(nowPlayingHomeIntent);
            }
        });


        //find the view ID for the favourite icon

        ImageView nowPlayingFavourites = (ImageView) findViewById(R.id.playingFavouritesIcon);

        //set an OnClick Listener on the Favourites Icon
        nowPlayingFavourites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Search Icon ImageView in the Now Playing Window is clicked on.
            @Override
            public void onClick(View view)  {
                Intent nowPlayingFavouritesIntent = new Intent (NowPlaying.this, MyFavourites.class);
                startActivity(nowPlayingFavouritesIntent);
            }
        });

        //find the view ID for the Search icon

        ImageView nowPlayingSearch = (ImageView) findViewById(R.id.playingSearchIcon);

        //set an OnClick Listener on the Search Icon
        nowPlayingSearch.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Search Icon ImageView in the Now Playing Window is clicked on.
            @Override
            public void onClick(View view)  {
                Intent nowPlayingSearchIntent = new Intent (NowPlaying.this, SearchMusic.class);
                startActivity(nowPlayingSearchIntent);
            }
        });


        //find the view ID for the Library icon

        ImageView nowPlayingLibrary = (ImageView) findViewById(R.id.playinLibraryIcon);

        //set an OnClick Listener on the Library Icon
        nowPlayingLibrary.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Library Icon ImageView in the Now Playing Window is clicked on.
            @Override
            public void onClick(View view)  {
                Intent nowPlayingLibraryIntent = new Intent (NowPlaying.this, MyLibrary.class);
                startActivity(nowPlayingLibraryIntent);
            }
        });





    }



}
