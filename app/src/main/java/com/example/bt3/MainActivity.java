package com.example.bt3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView listdannhsach;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listdannhsach=findViewById(R.id.list_danh_sach);
        ArrayList<Danhsach> danhsach =new ArrayList<>();
        Danhsach danhsach1 = new Danhsach(R.drawable.logo,"CĐ ĐTTT 20A","CA 1",R.drawable.ic_baseline_navigate_next_24);
        danhsach.add(danhsach1);
        Danhsach danhsach2 = new Danhsach(R.drawable.logo,"CĐ ĐTTT 20B","CA 1",R.drawable.ic_baseline_navigate_next_24);
        danhsach.add(danhsach2);
        Danhsach danhsach3 = new Danhsach(R.drawable.logo,"CĐ ĐTTT 21A","CA 1",R.drawable.ic_baseline_navigate_next_24);
        danhsach.add(danhsach3);
        Danhsach danhsach4 = new Danhsach(R.drawable.logo,"CĐ ĐTTT 21B","CA 1",R.drawable.ic_baseline_navigate_next_24);
        danhsach.add(danhsach4);
        AdapterDanhSach adapterDanhSach=new AdapterDanhSach(MainActivity.this,R.layout.item_danhsach,danhsach);
        listdannhsach.setAdapter(adapterDanhSach);
    }
}