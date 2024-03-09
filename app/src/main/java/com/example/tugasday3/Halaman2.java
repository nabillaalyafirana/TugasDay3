package com.example.tugasday3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Halaman2 extends AppCompatActivity {

    private Button btnTonerSkii, btnMoisSkii, btnSabunSkii, btnEyecareSkii, btnSerumSkii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        // Inisialisasi tombol
        btnTonerSkii = findViewById(R.id.btntonerskii);
        btnMoisSkii = findViewById(R.id.btnmoiskii);
        btnSabunSkii = findViewById(R.id.btnsabunskii);
        btnEyecareSkii = findViewById(R.id.btneyecarekii);
        btnSerumSkii = findViewById(R.id.btnserumskii);

        // Menambahkan listener ke tombol Toner SKII
        btnTonerSkii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetailActivity("TonerSkii", R.drawable.tonerskiin, "PITERA™ Facial Treatment",
                        "Toner yang menghidrasi dengan kandungan AHA untuk mengelupas dan mengkondisikan kulit",
                        "Rp 1,249,155.");
            }
        });

        // Menambahkan listener ke tombol Moisturizing SKII
        btnMoisSkii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetailActivity("MoisSkii", R.drawable.moisskii, "SKINPOWER Advanced Cream",
                        "Untuk mengurangi munculnya garis-garis halus dan membuat kulit terasa kenyal dan kenyal.",
                        "Rp 3,981,777.");
            }
        });

        // Menambahkan listener ke tombol Sabun SKII
        btnSabunSkii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetailActivity("SabunSkii", R.drawable.sabunskii, "PITERA™ Facial Treatment Cleanse",
                        "Tampilkan kulit yang bersih dan halus dengan pembersih berbusa kami",
                        "Rp 1,172,095.");
            }
        });

        // Menambahkan listener ke tombol Eyecare SKII
        btnEyecareSkii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetailActivity("EyecareSkii", R.drawable.eyecareskii, "LXP Ultimate Revival Eye Cream",
                        "PITERA™ Konsentrat Tertinggi kami dalam krim mata yang sangat kaya",
                        "Rp 3,125,513.");
            }
        });

        // Menambahkan listener ke tombol Serum SKII
        btnSerumSkii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetailActivity("SerumSkii", R.drawable.serumskii, "GenOptics Ultraura Essence Serum",
                        "Kurangi kulit kusam, cerahkan warna kulit Anda, dan targetkan bintik matahari yang terlihat secara holistik.",
                        "Rp 4,134,074.");
            }
        });
    }

    private void navigateToDetailActivity(String productId, int imageResId, String productName, String productDescription, String productPrice) {
        // Membuat Intent untuk DetailActivity
        Intent intent = new Intent(this, detail.class);

        // Mengirim data tambahan ke DetailActivity
        intent.putExtra("PRODUCT_ID", productId);
        intent.putExtra("IMAGE_RES_ID", imageResId);
        intent.putExtra("PRODUCT_NAME", productName);
        intent.putExtra("PRODUCT_DESCRIPTION", productDescription);
        intent.putExtra("PRODUCT_PRICE", productPrice);

        // Memulai aktivitas DetailActivity
        startActivity(intent);
    }
}



