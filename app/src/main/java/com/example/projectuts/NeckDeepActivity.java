package com.example.projectuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectuts.adapters.AlbumAdapter;
import com.example.projectuts.models.AlbumLogo;
import com.example.projectuts.models.SongList;

import java.util.ArrayList;
import java.util.List;

public class NeckDeepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neck_deep);

        RecyclerView albumView = findViewById(R.id.rv_album);

        List<AlbumLogo> albums = new ArrayList<>();
        albums.add(new AlbumLogo("https://upload.wikimedia.org/wikipedia/en/b/b1/Rain_In_July_Neck_Deep.jpg", "Rain In July"));
        albums.add(new AlbumLogo("https://upload.wikimedia.org/wikipedia/en/e/ea/Wishful_Thinking_Neck_Deep.jpg", "Wishful Thinking"));
        albums.add(new AlbumLogo("https://images-na.ssl-images-amazon.com/images/I/61Mm-uMd4xL._SY355_.jpg", "Rain In July / A History Of A Bad Decisions"));
        albums.add(new AlbumLogo("https://upload.wikimedia.org/wikipedia/en/e/e7/Life%27s_Not_Out_to_Get_You.jpg","Life's Not Out To Get You"));
        albums.add(new AlbumLogo("https://upload.wikimedia.org/wikipedia/en/f/f6/Peace_and_the_Panic.jpg","The Peace And The Panic"));
        
        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        adapter.setListLagu(SongList.getListData3());
        albumView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        albumView.setLayoutManager(layoutManager);
    }
}
