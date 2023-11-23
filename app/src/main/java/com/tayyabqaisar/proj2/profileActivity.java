package com.tayyabqaisar.proj2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class profileActivity extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST = 1;
    private ImageView profileImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        profileImageView = findViewById(R.id.edit_p);

        // Set click listener for profile picture
        profileImageView.setOnClickListener(view -> openFileChooser());

        ImageView chat = findViewById(R.id.chat);
        chat.setOnClickListener(view -> {
            Intent intent = new Intent(profileActivity.this, chatActivity.class);
            startActivity(intent);
        });

        ImageView search = findViewById(R.id.search);
        search.setOnClickListener(view -> {
            Intent intent = new Intent(profileActivity.this, searchActivity.class);
            startActivity(intent);
        });

        ImageView edit = findViewById(R.id.edit);
        edit.setOnClickListener(view -> {
            Intent intent = new Intent(profileActivity.this, editActivity.class);
            startActivity(intent);
        });

        ImageView home = findViewById(R.id.home);
        home.setOnClickListener(view -> {
            Intent intent = new Intent(profileActivity.this, welcomeActivity.class);
            startActivity(intent);
        });
    }

    private void openFileChooser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            Uri imageUri = data.getData();
            // Set the selected image URI to the profileImageView
            profileImageView.setImageURI(imageUri);
        }
    }
}
