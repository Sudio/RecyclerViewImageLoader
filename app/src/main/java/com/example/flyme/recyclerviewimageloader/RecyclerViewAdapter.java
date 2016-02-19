package com.example.flyme.recyclerviewimageloader;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Flyme on 2016/2/19.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ImageHolder> {
    private static List<String> img_url;
    private Context context;
    public RecyclerViewAdapter(List<String> img_url, Context context) {
        this.img_url = img_url;
        this.context = context;
    }

    @Override
    public ImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater
                    .from(context)
                    .inflate(R.layout.image_item,parent,false);
            return new ImageHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ImageHolder holder, int position) {
        String url = img_url.get(position);
        Picasso.with(context).load(url).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return img_url.size();
    }
    public static class ImageHolder extends RecyclerView.ViewHolder{
        protected ImageView imageView;
        public ImageHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.img);
        }
    }
}
