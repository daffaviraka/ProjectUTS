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

public class BringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bring);

        RecyclerView albumView = findViewById(R.id.rv_album);

        List<AlbumLogo> albums = new ArrayList<>();
        albums.add(new AlbumLogo("https://upload.wikimedia.org/wikipedia/en/f/fa/BMTH_Count_Your_Blessings.png", "Count Your Blessings"));
        albums.add(new AlbumLogo("https://upload.wikimedia.org/wikipedia/en/5/5d/BMTH_Suicide_Season.png", "Suicide Season"));
        albums.add(new AlbumLogo("https://upload.wikimedia.org/wikipedia/en/8/82/BMTH_There_Is_a_Hell.png", "There Is a Hell Believe Me I've Seen It"));
        albums.add(new AlbumLogo("https://upload.wikimedia.org/wikipedia/en/b/bb/BMTH_Sempiternal.png","Sempiternal"));
        albums.add(new AlbumLogo("https://1.bp.blogspot.com/-sNlY7C0GKp8/XF_sgDTM9kI/AAAAAAAAATc/uGRpkgoGMNYBBZc7gx4D9cjew5M_cfZ8ACLcBGAs/s1600/100000x100000-999.jpg","That's The Spirit"));
        albums.add(new AlbumLogo("https://upload.wikimedia.org/wikipedia/en/thumb/9/97/AmoBringMetheHorizon.png/220px-AmoBringMetheHorizon.png","amo"));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        adapter.setListLagu(SongList.getListData());
        albumView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        albumView.setLayoutManager(layoutManager);
    }
}
