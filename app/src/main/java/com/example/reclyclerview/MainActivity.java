package com.example.reclyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private keluargaAdapter adapter;
    private ArrayList<keluarga>keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = findViewById(R.id.recylerview);
        adapter = new keluargaAdapter(keluargaArrayList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
     private void addData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new keluarga("Sefri M. T. Nalle","ayah", R.drawable.bapa));
        keluargaArrayList.add(new keluarga("Esterfhina Banik", "Ibu",R.drawable.mama));
        keluargaArrayList.add(new keluarga("Merpati V. A. Nalle","Anak ke-1", R.drawable.merta));
        keluargaArrayList.add(new keluarga("Bintang E. M. Nalle","Anak ke-2", R.drawable.bintang1));
        keluargaArrayList.add(new keluarga("Gema N. S. Nalle","Anak ke-3", R.drawable.gema));
        keluargaArrayList.add(new keluarga("Surya G. A. Nalle","Anak ke-4", R.drawable.surya));
    }
}
