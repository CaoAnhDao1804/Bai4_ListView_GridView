package com.example.administrator.bai4_listview_gridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private Button btnListView;
    private GridView gridView;
    private String[] arrData;
    private ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnListView = (Button) findViewById(R.id.btn_listView);
        gridView = (GridView) findViewById(R.id.gv_gridView);
        arrData = new String[]{"C/C++","Java","Androi","IOS","PHP","Ruby"};
        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrData);
        gridView.setAdapter(arrayAdapter);
        arrayAdapter.notifyDataSetChanged();
        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });
    }
}