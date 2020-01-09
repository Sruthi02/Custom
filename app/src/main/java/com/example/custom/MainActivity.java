package com.example.custom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Hero> objects;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objects = new ArrayList<>();


        objects.add(new Hero(R.drawable.asdf, "Hulk", "Avengers"));
        objects.add(new Hero(R.drawable.customm, "Thor", "Avengers"));
        objects.add(new Hero(R.drawable.qwe, "Hulk&Thor", "Avengers"));
        objects.add(new Hero(R.drawable.zxcv, "H&T", "Avengers"));

        listView = (ListView) findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, R.layout.list_item, objects);

        listView.setAdapter(adapter);
    }
}
