package com.example.assignment4;

import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView customListView;
    private ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customListView = findViewById(R.id.customListView);
        expandableListView = findViewById(R.id.expandableListView);

        // Setting up Custom ListView
        List<String> listViewData = new ArrayList<>();
        listViewData.add("Item 1");
        listViewData.add("Item 2");
        listViewData.add("Item 3");
        CustomListAdapter listAdapter = new CustomListAdapter(this, listViewData);
        customListView.setAdapter(listAdapter);

        // Setting up Expandable ListView
        List<String> groupList = new ArrayList<>();
        groupList.add("Group 1");
        groupList.add("Group 2");

        HashMap<String, List<String>> childMap = new HashMap<>();
        List<String> child1 = new ArrayList<>();
        child1.add("Child 1-1");
        child1.add("Child 1-2");

        List<String> child2 = new ArrayList<>();
        child2.add("Child 2-1");
        child2.add("Child 2-2");

        childMap.put(groupList.get(0), child1);
        childMap.put(groupList.get(1), child2);

        CustomExpandableListAdapter expandableListAdapter = new CustomExpandableListAdapter(this, groupList, childMap);
        expandableListView.setAdapter(expandableListAdapter);
    }
}
