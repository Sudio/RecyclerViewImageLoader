package com.example.flyme.recyclerviewimageloader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> imgUrls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgUrls = Arrays.asList(ImageUrls.IMAGES);
        RecyclerView recList = (RecyclerView) findViewById(R.id.recyclerList);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);
        RecyclerViewAdapter rvAdpater = new RecyclerViewAdapter(imgUrls,this);
        recList.setAdapter(rvAdpater);
    }
}
