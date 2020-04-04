package com.example.projectuts.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectuts.DetailActivity;
import com.example.projectuts.models.AlbumLogo;
import com.example.projectuts.models.Song;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import com.example.projectuts.R;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.ViewHolder>{

    private Context context;
    private List<AlbumLogo> items;
    private ArrayList<Song> listLagu;

    public AlbumAdapter(Context context, List<AlbumLogo> items) {
        this.context = context;
        this.items = items;
    }
    public ArrayList<Song> getListLagu(){
        return listLagu;
    }

    public void setListLagu(ArrayList<Song> listLagu) {
        this.listLagu = listLagu;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_logo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        AlbumLogo item = items.get(position);

        Picasso.get().load(item.getLogo()).into(holder.logoImage);
        holder.nameText.setText(item.getName());

//        
        //intent parcelable to detail
        holder.layout_Album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,getListLagu().get(position).getJudulAlbum()+" clicked",Toast.LENGTH_SHORT).show();
                Intent detailActivity = new Intent(context, DetailActivity.class);
                detailActivity.putExtra(DetailActivity.EXTRA_ALBUM, listLagu.get(position));
                context.startActivity(detailActivity);
            }
        });

       // Picasso.get().load(item.getLogo()).into(holder.logoImage);
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
        //return getListLagu().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nameText;
        CardView layout_Album;
        //Button button;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
            layout_Album = itemView.findViewById(R.id.LayoutAlbum);
            //button = itemView.findViewById(R.id.button10);
        }

    }

}
