package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Model> movies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);

        RecyclerView recyclerView=findViewById(R.id.recycleView);
        RecycleViewAdapter adapter=new RecycleViewAdapter(this, movies);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(layoutManager);
    }

    private void setData(){
        movies.add(new Model(R.drawable.figth, "Бойцовский клуб"));
        movies.add(new Model(R.drawable.el, "Эль Камино"));
        movies.add(new Model(R.drawable.figth, "Бойцовский клуб"));
        movies.add(new Model(R.drawable.figth, "Бойцовский клуб"));
        movies.add(new Model(R.drawable.figth, "Бойцовский клуб"));
        movies.add(new Model(R.drawable.el, "Эль Камино"));
        movies.add(new Model(R.drawable.el, "Эль Камино"));
        movies.add(new Model(R.drawable.figth, "Бойцовский клуб"));
        movies.add(new Model(R.drawable.figth, "Бойцовский клуб"));
        movies.add(new Model(R.drawable.figth, "Бойцовский клуб"));
        //movies.add(new Model(R.drawable.gg, "Главный герой"));
    }
}