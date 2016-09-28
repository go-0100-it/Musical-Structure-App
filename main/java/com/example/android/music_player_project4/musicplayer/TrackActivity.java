package com.example.android.music_player_project4.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TrackActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        TextView showPlaylistBtn = (TextView)findViewById(R.id.playlist_btn);
        showPlaylistBtn.setOnClickListener(this);

        TextView showAlbumBtn = (TextView)findViewById(R.id.album_btn);
        showAlbumBtn.setOnClickListener(this);

        TextView showGetMusicBtn = (TextView)findViewById(R.id.get_music_btn);
        showGetMusicBtn.setOnClickListener(this);

        TextView showPlayerBtn = (TextView)findViewById(R.id.player_btn);
        showPlayerBtn.setOnClickListener(this);

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
            case R.id.playlist_btn:
                startActivity(new Intent(TrackActivity.this,PlayListActivity.class));
                finish();
                break;
            case R.id.album_btn:
                startActivity(new Intent(TrackActivity.this,AlbumActivity.class));
                finish();
                break;
            case R.id.get_music_btn:
                startActivity(new Intent(TrackActivity.this,GetMusicActivity.class));
                finish();
                break;
            case R.id.player_btn:
                finish();
                break;
            case R.id.play_btn:
                toaster("Play selected track in this activity and/or end previous service.");
                break;
            case R.id.previous_btn:
                toaster("Will play previous track in already running service(Not this activity) or nothing.");
                break;
            case R.id.next_btn:
                toaster("Will play next track in already running service(Not this activity) or nothing.");
                break;
            default:
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_item_1:
                toaster("Show dialog to enter search keyword, search list items for keyword.");
                break;
            case R.id.menu_item_2:
                toaster("Show audio settings");
                break;
            case R.id.menu_item_3:
                toaster("Show help dialog");
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
