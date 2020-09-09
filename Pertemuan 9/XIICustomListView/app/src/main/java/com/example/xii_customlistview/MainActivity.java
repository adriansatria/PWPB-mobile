package com.example.xii_customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Superhero> superheroList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        superheroList = new ArrayList<>();
        listView = findViewById(R.id.listview);

        superheroList.add(new Superhero(R.drawable.elsword, "Elsword", "Light"));
        superheroList.add(new Superhero(R.drawable.raven, "Raven", "Dark"));
        superheroList.add(new Superhero(R.drawable.chung, "Chung", "Light"));
        superheroList.add(new Superhero(R.drawable.add, "Add", "Dark"));
        superheroList.add(new Superhero(R.drawable.eve, "Eve", "Light"));
        superheroList.add(new Superhero(R.drawable.elesis, "Elesis", "Dark "));

        MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list, superheroList);
        listView.setAdapter(adapter);

    }
}
