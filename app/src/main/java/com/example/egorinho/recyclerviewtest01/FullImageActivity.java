package com.example.egorinho.recyclerviewtest01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by egorinho on 02.05.2018.
 */

public class FullImageActivity extends Activity {
    String url;
    ImageView mImageView;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //убираем строку состояния
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.full_image);
        mImageView = (ImageView)findViewById(R.id.fullImageView);

        //принимаем intent с ссылкой на изображение
        Intent intent = getIntent();
        url = intent.getStringExtra("id");

        //загружаем изображение с помощью Glide
        Glide.with(this).load(url).into(mImageView);

    }
}
