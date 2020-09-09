package com.example.xii_latihaninputuser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText bilangan1;
    private EditText bilangan2;
    private Button hasil;
    private EditText jumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private void initUI(){
        bilangan1 = findViewById(R.id.txt1);
        bilangan2 = findViewById(R.id.txt2);
        jumlah = findViewById(R.id.jumlah);
        hasil = findViewById(R.id.btnHasil);
    }

    private void initEvent(){
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah(){
        int angka1 = Integer.parseInt(bilangan1.getText().toString());
        int angka2 = Integer.parseInt(bilangan2.getText().toString());
        int total = angka1 + angka2;
        jumlah.setText(total + "");
    }

}
