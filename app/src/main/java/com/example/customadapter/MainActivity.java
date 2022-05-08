package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    String arr[]={"Button1","Button2","Button3","Button4","Button5","Button6","Button7","Button8","Button9","Button10","Button11"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyAdapter ad=new MyAdapter(this,R.layout.my_adapter_layout,arr);
        listview=findViewById(R.id.listview);
        listview.setAdapter(ad);
    }
}