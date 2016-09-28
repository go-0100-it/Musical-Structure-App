package com.example.android.music_player_project4.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Player extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        TextView showAlbumBtn = (TextView)findViewById(R.id.album_btn);
        showAlbumBtn.setOnClickListener(this);

        TextView showTracksBtn = (TextView)findViewById(R.id.track_btn);
        showTracksBtn.setOnClickListener(this);

        TextView showGetMusicBtn = (TextView)findViewById(R.id.get_music_btn);
        showGetMusicBtn.setOnClickListener(this);

        TextView showPlaylistsBtn = (TextView)findViewById(R.id.playlist_btn);
        showPlaylistsBtn.setOnClickListener(this);

        TextView playBtn = (TextView)findViewById(R.id.play_btn);
        playBtn.setOnClickListener(this);

        TextView nextBtn = (TextView)findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(this);

        TextView prevBtn = (TextView)findViewById(R.id.previous_btn);
        prevBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.album_btn:
                startActivity(new Intent(Player.this,AlbumActivity.class));
                break;
            case R.id.track_btn:
                startActivity(new Intent(Player.this,TrackActivity.class));
                break;
            case R.id.get_music_btn:
                startActivity(new Intent(Player.this,GetMusicActivity.class));
                break;
            case R.id.playlist_btn:
                startActivity(new Intent(Player.this,PlayListActivity.class));
                break;
            case R.id.play_btn:
                toaster("Start background service to play track or pause track already playing.");
                break;
            case R.id.previous_btn:
                toaster("Will play previous track in already running service.");
                break;
            case R.id.next_btn:
                toaster("Will play next track in already running service.");
                break;
            default:
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.player_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_item_1:
                toaster("Show audio settings");
                break;
            case R.id.menu_item_2:
                toaster("Show help dialog");
                break;
            case R.id.menu_item_3:
                break;
            case R.id.menu_item_4:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void toaster(String toast){
        Toast.makeText(getApplicationContext(), toast, Toast.LENGTH_LONG).show();
    }
}