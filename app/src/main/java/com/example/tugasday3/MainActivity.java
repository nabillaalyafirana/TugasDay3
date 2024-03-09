package com.example.tugasday3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mendapatkan referensi ke ImageButton dari layout
        ImageButton btn1 = findViewById(R.id.btn1);
        ImageButton btn2 = findViewById(R.id.btn2);
        ImageButton btn3 = findViewById(R.id.btn3);

        // Menambahkan onClickListener untuk setiap tombol
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implementasi aksi ketika tombol btn1 ditekan
                Toast.makeText(MainActivity.this, "SK-II", Toast.LENGTH_SHORT).show();

                // Contoh: Pindah ke halaman baru (gantilah dengan Intent yang sesuai)
                Intent intent = new Intent(MainActivity.this, Halaman2.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implementasi aksi ketika tombol btn2 ditekan
                Toast.makeText(MainActivity.this, "SKINTIFIC", Toast.LENGTH_SHORT).show();

                // Contoh: Pindah ke halaman baru (gantilah dengan Intent yang sesuai)
                Intent intent = new Intent(MainActivity.this, Halaman3.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implementasi aksi ketika tombol btn3 ditekan
                Toast.makeText(MainActivity.this, "WHITELAB", Toast.LENGTH_SHORT).show();

                // Contoh: Pindah ke halaman baru (gantilah dengan Intent yang sesuai)
                Intent intent = new Intent(MainActivity.this, Halaman4.class);
                startActivity(intent);
            }
        });
    }
}

