package com.tayyabqaisar.proj2;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.HashMap;
import java.util.Map;

public class registrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        Button btnsignup = findViewById(R.id.btnsignup);
        btnsignup.setOnClickListener(view -> {
            String name = ((EditText) findViewById(R.id.getName)).getText().toString().trim();
            String email = ((EditText) findViewById(R.id.getEmail)).getText().toString().trim();
            String password = ((EditText) findViewById(R.id.getPassword)).getText().toString().trim(); // Get password from input field
            String contactNumber = ((EditText) findViewById(R.id.getEmail3)).getText().toString().trim();
            String country = ((EditText) findViewById(R.id.getcountry3)).getText().toString().trim();
            String city = ((EditText) findViewById(R.id.getcity3)).getText().toString().trim();

        });
    }
}
