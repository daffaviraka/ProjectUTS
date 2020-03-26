package com.example.projectuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectuts.R;
import com.example.projectuts.adapters.AlbumAdapter;
import com.example.projectuts.models.AlbumLogo;

import java.util.ArrayList;
import java.util.List;

public class BurgerkillActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burgerkill);

        RecyclerView albumView = findViewById(R.id.rv_album);

        List<AlbumLogo> albums = new ArrayList<>();
        albums.add(new AlbumLogo("https://1.bp.blogspot.com/-D4aJmdrBcY4/XYU8CsVuwmI/AAAAAAAAA88/dpYyvqF7KAodOCuWOaiZ1LH7XIv6kmGXgCLcBGAsYHQ/s400/Dua%2BSisi.jpg", "Dua Sisi"));
        albums.add(new AlbumLogo("https://upload.wikimedia.org/wikipedia/en/2/29/Berkarat_%28album%29.jpg", "Berkarat"));
        albums.add(new AlbumLogo("https://upload.wikimedia.org/wikipedia/id/c/c5/Beyond_Coma_and_Despair.jpg", "Beyond Coma And Despair"));
        albums.add(new AlbumLogo("https://upload.wikimedia.org/wikipedia/en/b/be/Burgerkill_Venomous.png","Venomous"));
        albums.add(new AlbumLogo("https://m.media-amazon.com/images/I/61goDCC7zAL._AA256_.jpg","Adamantine"));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        albumView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        albumView.setLayoutManager(layoutManager);
    }
}
