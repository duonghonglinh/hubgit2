package com.example.admin.listviewnangcao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // class nay dung de do du lieu tu adapter vao


    //dung de hien thi
    ListView lvView;

    //moi dong la 1 doi tuong trai cay
    ArrayList<TraiCay> traiCayArrayList;

    //khai bao doi tuong adapter
    TraiCayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();

        //khoi tao doi tuong adapter
        adapter = new TraiCayAdapter(MainActivity.this, R.layout.dong_trai_cay,traiCayArrayList);

        lvView.setAdapter(adapter);


    }


    public void anhxa(){

        lvView = findViewById(R.id.lv);
        traiCayArrayList = new ArrayList<>();

        traiCayArrayList.add(new TraiCay("dau tay", "dau tay da lat", R.drawable.ic_launcher_background));
        traiCayArrayList.add(new TraiCay(" cafe","cafe da lat", R.drawable.ic_launcher_foreground));


    }
}
