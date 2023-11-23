package com.tayyabqaisar.proj2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class itemActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);

        TextView report = findViewById(R.id.report);
        report.setOnClickListener(view -> {
            Intent intent = new Intent(itemActivity.this, reportActivity.class);
            startActivity(intent);
        });

        Button rentButton = findViewById(R.id.btnLogin);
        rentButton.setOnClickListener(view -> {
            // Get hourly rate from the UI
            TextView hourlyRateTextView = findViewById(R.id.textHourlyRate);
            String hourlyRate = hourlyRateTextView.getText().toString();

        });
    }
}
