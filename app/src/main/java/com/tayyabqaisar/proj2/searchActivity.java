package com.tayyabqaisar.proj2;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class searchActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_number);
        ImageView chat = findViewById(R.id.chat);
        chat.setOnClickListener(view -> {
            Intent intent = new Intent(searchActivity.this,chatActivity.class);
            startActivity(intent);
        });


        ImageView profile = findViewById(R.id.profile);
        profile.setOnClickListener(view -> {
            Intent intent = new Intent(searchActivity.this,profileActivity.class);
            startActivity(intent);
        });

        ImageView home = findViewById(R.id.home);
        home.setOnClickListener(view -> {
            Intent intent = new Intent(searchActivity.this,welcomeActivity.class);
            startActivity(intent);
        });

    }



}

