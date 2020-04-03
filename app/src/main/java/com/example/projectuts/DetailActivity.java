package com.example.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projectuts.models.Song;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_ALBUM = "extra_album";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.imageDetail);
        TextView judul = findViewById(R.id.textAlbum);
        TextView lagu = findViewById(R.id.textSong1);

        Song song = getIntent().getParcelableExtra(EXTRA_ALBUM);

        //Glide.with(this).load(song.getGambarAlbum()).into(imageView);
        Picasso.get().load(song.getGambarAlbum()).into(imageView);
        judul.setText(song.getJudulAlbum());
        lagu.setText(song.getDaftarLagu());
    }
}
