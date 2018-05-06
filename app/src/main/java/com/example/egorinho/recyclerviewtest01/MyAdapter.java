package com.example.egorinho.recyclerviewtest01;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by egorinho on 02.05.2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ImageViewHolder> {
    private static Context mContext;
    private static List<String> mLinks;


    //конструктор
    public MyAdapter(Context context,List<String> links){
        mLinks = links;
        mContext = context;
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder{
        ImageView mImageView;
        public ImageViewHolder(View itemView){
            super(itemView);
            mImageView = (ImageView)itemView.findViewById(R.id.imageView);
        }
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }


    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        ImageViewHolder ivh = new ImageViewHolder(v);
        return ivh;
    }

    @Override
    public void onBindViewHolder(final ImageViewHolder imageViewHolder, int i){
        Glide.with(imageViewHolder.mImageView.getContext()).load(mLinks.get(i)).into(imageViewHolder.mImageView);

        //обработчик нажатия на картинку
        imageViewHolder.mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //создаем intent и передаем ссылку изображения в активность для отображения в полном экране
                int position = imageViewHolder.getAdapterPosition();
                Intent intent = new Intent(mContext, FullImageActivity.class);
                intent.putExtra("id", mLinks.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount(){
        return mLinks.size();
    }


}
