package com.example.belajar_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button explicitintent;
    Button implicitintent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = (Button)findViewById(R.id.explicitent);
        explicitintent.setOnClickListener(this);
        implicitintent = (Button)findViewById(R.id.implicitintent);
        implicitintent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.explicitent:
                Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(explicit);
                break;

            case  R.id.implicitintent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://w3school.com"));
                startActivity(implicit);
                break;
            default:
                break;
        }
    }
}