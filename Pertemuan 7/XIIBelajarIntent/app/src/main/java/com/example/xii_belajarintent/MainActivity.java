package com.example.xii_belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button explicitIntent;
    Button implicitIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitIntent = findViewById(R.id.explicitIntent);
        explicitIntent.setOnClickListener(this);
        implicitIntent = findViewById(R.id.implicitIntent);
        implicitIntent.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.explicitIntent :
                Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(explicit);
                break;
            case R.id.implicitIntent :
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sekolahqueque.blogspot.com/"));
                startActivity(implicit);
                break;
                default:
                    break;
        }
    }
}
