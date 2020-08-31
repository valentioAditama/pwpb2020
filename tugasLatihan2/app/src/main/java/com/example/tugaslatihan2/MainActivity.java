package com.example.tugaslatihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button youtubeButton;
    Button instagramButton;
    Button helloworld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        youtubeButton = (Button)findViewById(R.id.youtube);
        youtubeButton.setOnClickListener(this);
        instagramButton = (Button)findViewById(R.id.instagram);
        instagramButton.setOnClickListener(this);
        helloworld = (Button)findViewById(R.id.helloworld);
        helloworld.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.youtube:
                Intent youtube = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com"));
                startActivity(youtube);
                break;

            case R.id.instagram:
                Intent instagram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com"));
                startActivity(instagram);
                break;

            case R.id.helloworld:
                Intent helloworld = new Intent(MainActivity.this, com.example.tugaslatihan2.helloworld.class);
                startActivity(helloworld);
                break;

        }
    }
}