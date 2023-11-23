package com.tayyabqaisar.proj2;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class messageActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messages);
        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(view -> {
            Intent intent = new Intent(messageActivity.this,chatActivity.class);
            startActivity(intent);
        });
        ImageView caller = findViewById(R.id.caller);
        caller.setOnClickListener(view -> {
            Intent intent = new Intent(messageActivity.this,callerActivity.class);
            startActivity(intent);
        });



    }



}

