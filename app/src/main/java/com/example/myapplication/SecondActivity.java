package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private List<Item> itemList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initItems();
        HeroAdapter heroAdapter = new HeroAdapter(SecondActivity.this, R.layout.list_item, itemList);
        ListView listView = (ListView) findViewById(R.id.list_item);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }
        listView.setAdapter(heroAdapter);
        listView.setFocusable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Item item = itemList.get(i);
                Toast.makeText(SecondActivity.this, item.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void initItems() {
        for(int i=0; i<2; i++) {
            Item aolafu = new Item(   "奥拉夫");
            itemList.add(aolafu);
            Item galun = new Item("盖伦");
            itemList.add(galun);
            Item vn = new Item("VN");
            itemList.add(vn);
            Item ali = new Item("阿狸");
            itemList.add(galun);
            Item jie = new Item("影流之主");
            itemList.add(jie);
            Item mumu = new Item("阿木木");
            itemList.add(mumu);
            Item delaiwen = new Item("德莱文");
            itemList.add(delaiwen);
        }
    }
}