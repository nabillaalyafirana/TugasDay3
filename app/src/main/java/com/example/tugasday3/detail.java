package com.example.tugasday3;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Mengambil data dari Intent
        Intent intent = getIntent();
        int imageResId = intent.getIntExtra("IMAGE_RES_ID", 0);
        String productName = intent.getStringExtra("PRODUCT_NAME");
        String productDescription = intent.getStringExtra("PRODUCT_DESCRIPTION");
        String productPrice = intent.getStringExtra("PRODUCT_PRICE");

        // Menampilkan data di DetailActivity
        ImageView imageView = findViewById(R.id.ivDetailProduct);
        imageView.setImageResource(imageResId);

        TextView tvProductName = findViewById(R.id.tvDetailProductName);
        tvProductName.setText(productName);

        TextView tvProductDescription = findViewById(R.id.tvDetailProductDescription);
        tvProductDescription.setText(productDescription);

        TextView tvProductPrice = findViewById(R.id.tvDetailProductPrice);
        tvProductPrice.setText(productPrice);

        // Menambahkan Button Bagikan
        Button btnBagikan = findViewById(R.id.btnBagikan);
        btnBagikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bagikanInformasiProduk(imageResId, productName, productDescription, productPrice);
            }
        });
    }

    private void bagikanInformasiProduk(int imageResId, String productName, String productDescription, String productPrice) {
        // Buat pesan yang akan dibagikan
        String shareMessage = "Check out this product:\n\n" +
                "Name: " + productName + "\n" +
                "Description: " + productDescription + "\n" +
                "Price: " + productPrice;

        // Buat intent untuk berbagi teks dan gambar
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("image/*");
        shareIntent.putExtra(Intent.EXTRA_STREAM, imageResId);
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

        // Start aktivitas berbagi
        startActivity(Intent.createChooser(shareIntent, "Bagikan melalui"));
    }
}
