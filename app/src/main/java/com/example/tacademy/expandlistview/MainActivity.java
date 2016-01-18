package com.example.tacademy.expandlistview;

import android.app.ExpandableListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ExpandableListView listView;
    MyAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ExpandableListView)findViewById(R.id.expandableListView);
        mAdapter = new MyAdapter();

       listView.setAdapter(mAdapter);

        initData();
    }

    private void initData(){
        Random r = new Random();
                 for (int i = 0; i < 4; i++) {
                         int childCount = 2 + r.nextInt(4);
                         for (int j = 0; j < childCount; j++) {
                                 mAdapter.put("group"+i, "group"+i+":child"+j);
                         }
                 }

    }
}
