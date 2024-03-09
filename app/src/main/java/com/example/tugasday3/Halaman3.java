package com.example.tugasday3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class Halaman3 extends AppCompatActivity {

    private Button btnTonerSkin, btnMoisSkin, btnSabunSkin, btnEyecareKin, btnSerumSkin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman3);

        // Inisialisasi tombol
        btnTonerSkin = findViewById(R.id.btntonerskin);
        btnMoisSkin = findViewById(R.id.btnmoiskin);
        btnSabunSkin = findViewById(R.id.btnsabunskin);
        btnEyecareKin = findViewById(R.id.btneyecarekin);
        btnSerumSkin = findViewById(R.id.btnserumskin);

        // Menambahkan listener ke tombol Toner Skin
        btnTonerSkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetailActivity("TonerSkin", R.drawable.tonerskin, "Facial Toner Hydrating",
                        "Membantu melembabkan hingga lapisan kulit terdalam, sehingga kulit lebih terhidrasi, lembap, segar, dan memperkuat skin barier.",
                        "Rp 296,317.");
            }
        });

        // Menambahkan listener ke tombol Moisturizing Skin
        btnMoisSkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetailActivity("MoisSkin", R.drawable.moisskin, "Repair Moisture Gel",
                        "Bersihkan dengan lembut dengan perlindungan penghalang lembab.",
                        "Rp 139,000.");
            }
        });

        // Menambahkan listener ke tombol Sabun Skin
        btnSabunSkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetailActivity("SabunSkin", R.drawable.sabunskin, "Ceramide Low pH Cleanser",
                        "Bersihkan dengan lembut dengan perlindungan penghalang lembab.",
                        "Rp 169,000.");
            }
        });

        // Menambahkan listener ke tombol Eyecare Kin
        btnEyecareKin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetailActivity("EyecareKin", R.drawable.eyecareskin, "Crystal Massager Lifting",
                        "Untuk memudarkan lingkaran hitam nakal di area bawah mata dan mengurangi munculnya mata bengkak.",
                        "Rp 229,000.");
            }
        });

        // Menambahkan listener ke tombol Serum Skin
        btnSerumSkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetailActivity("SerumSkin", R.drawable.serumskin, "Ceramide Barrier Repair Serum",
                        "Serum diformulasikan untuk mengoptimalkan perbaikan pelindung kulit yang rusak.",
                        "Rp 199,000.");
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

