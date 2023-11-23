package com.tayyabqaisar.proj2;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;




import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

public class chatActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);
        ImageView search = findViewById(R.id.search);
        search.setOnClickListener(view -> {
            Intent intent = new Intent(chatActivity.this,searchActivity.class);
            startActivity(intent);
        });


        ImageView profile = findViewById(R.id.profile);
        profile.setOnClickListener(view -> {
            Toast.makeText(chatActivity.this,"hello umer",Toast.LENGTH_LONG).show();

        });

        ImageView home = findViewById(R.id.home);
        home.setOnClickListener(view -> {
            Intent intent = new Intent(chatActivity.this,welcomeActivity.class);
            startActivity(intent);
        });
        TextView msg = findViewById(R.id.msg);
        msg.setOnClickListener(view -> {
            Intent intent = new Intent(chatActivity.this,messageActivity.class);
            startActivity(intent);
        });

    }



}

