package com.example.xii_latihanintent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button tap = findViewById(R.id.buttontap);
        tap.setOnClickListener(this);
        Button backac3 = findViewById(R.id.buttonbackac3);
        backac3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttontap :
                String url = "https://developer.android.com/";
                Intent visiturl = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(visiturl);
                break;
            case R.id.buttonbackac3 :
                Intent back = new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(back);
                break;
            default :
                break;
        }
    }
}
