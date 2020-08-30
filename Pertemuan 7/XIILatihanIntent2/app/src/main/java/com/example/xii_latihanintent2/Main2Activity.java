package com.example.xii_latihanintent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t = findViewById(R.id.viewname);
        Bundle bundle = getIntent().getExtras();
        String s = bundle.getString("name");
        t.setText(s);

        Button dial = findViewById(R.id.buttondial);
        dial.setOnClickListener(this);
        Button visit = findViewById(R.id.buttonvisit);
        visit.setOnClickListener(this);
        Button check = findViewById(R.id.buttonintent);
        check.setOnClickListener(this);
        Button back = findViewById(R.id.buttonback);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttondial :
                String phoneNumber = "082112274364";
                Intent intentDialNumber = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(intentDialNumber);
                break;
            case R.id.buttonvisit :
                String website = "https://sekolahqueque.blogspot.com/";
                Intent visitIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
                startActivity(visitIntent);
                break;
            case R.id.buttonintent :
                Intent movew = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(movew);
                break;
            case R.id.buttonback :
                Intent back = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(back);
                break;
            default :
                break;
        }
    }
}
