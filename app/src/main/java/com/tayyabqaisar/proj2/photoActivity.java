package com.tayyabqaisar.proj2;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class photoActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo2);

        TextView spt = findViewById(R.id.spt);
        spt.setOnClickListener(view -> {
            Intent intent = new Intent(photoActivity.this,SpotActivity.class);
            startActivity(intent);
        });




    }



}

