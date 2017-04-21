package com.example.tarikul.androidlistviewexample;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String[]description;
    TypedArray profilePics;
    List<RowItem> rowItems;
    ListView mlistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlistView= (ListView)findViewById(R.id.my_list);
        rowItems = new ArrayList<RowItem>();
        profilePics= getResources().obtainTypedArray(R.array.profile_pics);
        description = getResources().getStringArray(R.array.member_names);

        for(int i=0;i<description.length;i++){
            RowItem item = new RowItem(profilePics.getResourceId(i,-1),description[i]);
            rowItems.add(item);
        }

        CustomAdapter customAdapter = new CustomAdapter(this,rowItems);
        mlistView.setAdapter(customAdapter);
    }

}
