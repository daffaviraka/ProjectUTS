package com.example.projectuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectuts.adapters.AlbumAdapter;
import com.example.projectuts.models.AlbumLogo;

import java.util.ArrayList;
import java.util.List;

public class SlipknotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slipknot);

        RecyclerView albumView = findViewById(R.id.rv_album);

        List<AlbumLogo> albums = new ArrayList<>();
        albums.add(new AlbumLogo("https://upload.wikimedia.org/wikipedia/en/thumb/9/95/Iowa_10th_Anniversary_Cover.jpg/220px-Iowa_10th_Anniversary_Cover.jpg", "Iowa"));
        albums.add(new AlbumLogo("https://images.genius.com/4c681384b081bb68d290a165df651de7.1000x1000x1.png", "Vol. 3: The Subliminal Verses"));
        albums.add(new AlbumLogo("https://upload.wikimedia.org/wikipedia/en/thumb/f/fa/Slipknot-9.0_Live_Cover.jpg/220px-Slipknot-9.0_Live_Cover.jpg", "9.0 Live"));
        albums.add(new AlbumLogo("https://images-na.ssl-images-amazon.com/images/I/81g13wCTKkL._SL1425_.jpg","All Hope Is Gone"));
        albums.add(new AlbumLogo("https://lh3.googleusercontent.com/proxy/VuhcS7WS4tN-bdWKbh47qbzQOUOM8-jqE3Nna-jiEH8uNfn2DuRfnhIhI7j5xEMVJnYXHhPC_sHdBSvLyHZLePN9N7zP-An60B4FCZw","Slipknot (10th Anniversary Edition"));
        albums.add(new AlbumLogo("https://images-na.ssl-images-amazon.com/images/I/91H9BB2CgrL._SY355_.jpg",".5 The Gray Chapter"));
        albums.add(new AlbumLogo("https://img.discogs.com/x0z9sx2H-_WonhuKvmNlUl0G-0Y=/fit-in/600x558/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-11021905-1508499303-4308.jpeg.jpg","Day Of The Gusano Live"));
        albums.add(new AlbumLogo("https://is5-ssl.mzstatic.com/image/thumb/Music123/v4/2b/4d/97/2b4d97a1-d445-c0f9-6f95-f602392ec362/016861741006.jpg/400x400bb.jpeg","We Are Not Your Kind"));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        albumView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        albumView.setLayoutManager(layoutManager);
    }
}
