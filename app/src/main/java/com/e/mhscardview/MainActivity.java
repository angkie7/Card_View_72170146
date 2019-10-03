package com.e.mhscardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.e.mhscardview.Adapter.MahasiswaAdapter;
import com.e.mhscardview.Model.Mahasiswa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter mahasiswaAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener tambahButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TambahActivity.class);
                startActivity(intent);
            }
        };
        Button tambahBtn = (Button)findViewById(R.id.btnTambah);
        tambahBtn.setOnClickListener(tambahButtonListener);

        View.OnClickListener updateButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,UpdateActivity.class);
                startActivity(intent);
            }
        };
        Button updateBtn = (Button)findViewById(R.id.btnUpdate);
        updateBtn.setOnClickListener(updateButtonListener);





        /*ListView lv = (ListView)findViewById(R.id.list);
        lv.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,items));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Anda memilih " + items[position], Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.agung,
                "Aristyo R. Agung N.",
                "72170168",
                "Laki-Laki",
                "Main Gim",
                "Hidup Makmur",
                "Ngga Mau Ribet"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.dorra,
                "Christian Dorra",
                "72170148",
                "Tidak Diketahui",
                "Foto",
                "Makmur Sentosa",
                "Ganggu Hidup Angkie"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.abdi,
                "Putu Abdi Setiawan",
                "72170172",
                "Laki-Laki",
                "Coding",
                "Pro Player",
                "Hedonisme Is Lyfe"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.desta,
                "Desta Siwi Prabawan",
                "72170126",
                "Laki-Laki",
                "Makan",
                "Ingin Bersama Dia",
                "Sing Penting Yaquenn"));
    }
}
