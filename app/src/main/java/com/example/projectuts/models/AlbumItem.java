package com.example.projectuts.models;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.items.AbstractItem;
import com.squareup.picasso.Picasso;

import java.util.List;

import com.example.projectuts.R;

public class AlbumItem extends AbstractItem<AlbumItem, AlbumItem.ViewHolder> {

    private String logo;
    private String name;

    public AlbumItem(String logo, String name) {
        this.logo = logo;
        this.name = name;
    }

    @NonNull
    @Override
    public ViewHolder getViewHolder(View v) {
        return new ViewHolder(v);
    }

    @Override
    public int getType() {
        return R.id.rv_album;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item_logo;
    }

    public class ViewHolder extends FastAdapter.ViewHolder<AlbumItem> {

        ImageView logoImage;
        TextView nameText;

        public ViewHolder(View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
        }

        @Override
        public void bindView(AlbumItem item, List<Object> payloads) {
            Picasso.get().load(item.logo).into(logoImage);
            nameText.setText(item.name);
        }

        @Override
        public void unbindView(AlbumItem item) {
            logoImage.setImageBitmap(null);
            nameText.setText(null);
        }
    }

}