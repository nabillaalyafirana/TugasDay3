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

public class Halaman4 extends AppCompatActivity {

        private Button btnTonerWL, btnMoisWL, btnSabunWL, btnEyecareWL, btnSerumWL;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_halaman4);

            // Inisialisasi tombol
            btnTonerWL = findViewById(R.id.btntonerwl);
            btnMoisWL = findViewById(R.id.btnmoiswl);
            btnSabunWL = findViewById(R.id.btnsabunwl);
            btnEyecareWL = findViewById(R.id.btneyecarewl);
            btnSerumWL = findViewById(R.id.btnserumwl);

            // Menambahkan listener ke tombol Toner Whitelab
            btnTonerWL.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    navigateToDetailActivity("TonerWL", R.drawable.tonerwl, "Whitelab Essence Toner",
                            "Dapat membantu mengembalikan pH alami kulit wajah, membersihkan sisa debu dan kotoran.",
                            "Rp 58,000.");
                }
            });

            // Menambahkan listener ke tombol Moisturizing Whitelab
            btnMoisWL.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    navigateToDetailActivity("MoisWL", R.drawable.moiswl, "Whitelab Barrier Moisturizing Gel",
                            "Dapat mempertahankan fungsi skin barrier, meningkatkan level hidrasi, dan menenangkan kulit yang iritasi.",
                            "Rp 95,400.");
                }
            });

            // Menambahkan listener ke tombol Sabun Whitelab
            btnSabunWL.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    navigateToDetailActivity("SabunWL", R.drawable.sabunwl, "Whitelab pH-Balanced Facial Cleanser",
                            "Dapat membersihkan wajah dari debu, kotoran, dan sebum berlebih hingga ke pori-pori.",
                            "Rp 62,100.");
                }
            });

            // Menambahkan listener ke tombol Eyecare Whitelab
            btnEyecareWL.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    navigateToDetailActivity("EyecareWL", R.drawable.eyecarewl, "Whitelab Eye Cream",
                            "Merawat elastisitas kulit, menyamarkan kerutan, dan mencerahkan area sekitar mata sehingga tampak lebih segar.",
                            "Rp 84,600.");
                }
            });

            // Menambahkan listener ke tombol Serum Whitelab
            btnSerumWL.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    navigateToDetailActivity("SerumWL", R.drawable.serumwl, "Whitelab A-Dose+ Glowing Serum",
                            "Membantu menyamarkan noda hitam dan bekas jerawat, sehingga warna kulit tampak lebih merata, cerah, dan lembap.",
                            "Rp 84,300.");
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
