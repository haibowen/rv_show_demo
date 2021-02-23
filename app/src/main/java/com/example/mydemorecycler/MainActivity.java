package com.example.mydemorecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RvlistAdapter rvlistAdapter;
    private List<NewsBean> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //模拟数据
        getData();
        recyclerView = findViewById(R.id.rv_show_list);

        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);//第二个参数为网格的列数
        recyclerView.setLayoutManager(layoutManager);

        rvlistAdapter = new RvlistAdapter(dataList,this );
        recyclerView.setAdapter(rvlistAdapter);


    }

    /**
     * 模拟数据
     */

    public void getData() {

        for (int i = 0; i < 10; i++) {
            dataList.add(new NewsBean("车市" + i, ""));
        }
    }
}