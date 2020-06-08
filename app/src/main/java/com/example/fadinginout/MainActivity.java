package com.example.fadinginout;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartImageIsShowing = true;

    public void fade(View view)
    {
        Log.i("Info","Image Tapped!!");

        ImageView bart = (ImageView) findViewById(R.id.bartImageView);

        ImageView homer = (ImageView) findViewById(R.id.homerImageView);

        if(bartImageIsShowing) {
            bart.animate().alpha(0).setDuration(1500);
            homer.animate().alpha(1).setDuration(1500);
            bartImageIsShowing = false;
        }
        else {
            homer.animate().alpha(0).setDuration(1500);
            bart.animate().alpha(1).setDuration(1500);
            bartImageIsShowing = true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bart = (ImageView) findViewById(R.id.bartImageView);
        bart.setX(-1500);

        bart.animate().translationXBy(1500).rotation(1800).setDuration(2000);

    }
}
