package com.tayyabqaisar.proj2;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class editActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit);
        TextView save = findViewById(R.id.save);
        save.setOnClickListener(view -> {
            Intent intent = new Intent(editActivity.this,profileActivity.class);
            startActivity(intent);
        });






    }



}

