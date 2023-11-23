package com.tayyabqaisar.proj2;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class callerActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caller1);
        ImageView photo = findViewById(R.id.photo);
        photo.setOnClickListener(view -> {
            Intent intent = new Intent(callerActivity.this,photoActivity.class);
            startActivity(intent);
        });




    }



}

