package com.example.administrator.bai4_listview_gridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    private Button btnGirdView;
    private ListView listView;
    private String[] arrData;
    private ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = (ListView) findViewById(R.id.lv_listView);
        btnGirdView = (Button) findViewById(R.id.btn_gridView);
        arrData = new String[]{"C/C++","Java","Androi","IOS","PHP","Ruby"};
        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrData);
        listView.setAdapter(arrayAdapter);
        arrayAdapter.notifyDataSetChanged();
        btnGirdView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}