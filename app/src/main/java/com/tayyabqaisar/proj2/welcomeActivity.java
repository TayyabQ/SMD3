package com.tayyabqaisar.proj2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;


import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class welcomeActivity extends AppCompatActivity {

    private ScreenshotObserver screenshotObserver;
    static String fcmtoken=null;
    static String currentUid=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        screenshotObserver = new ScreenshotObserver(new Handler());

        // Register the ContentObserver to listen for changes in the MediaStore
        ContentResolver contentResolver = getContentResolver();
        contentResolver.registerContentObserver(
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                true,
                screenshotObserver
        );

        // Get user name from Intent
        String userName = getIntent().getStringExtra("USER_NAME");
        fcmtoken = getIntent().getStringExtra("FCM_TOKEN");
        currentUid = getIntent().getStringExtra("UID");

        // Find the TextView by ID
        TextView textViewName = findViewById(R.id.textViewName);

        // Set the retrieved user name to the TextView

            textViewName.setText(userName);
        ImageView search = findViewById(R.id.search);
        search.setOnClickListener(view -> {
            Intent intent = new Intent(welcomeActivity.this,searchActivity.class);
            startActivity(intent);
        });
        ImageView chat = findViewById(R.id.chat);
        chat.setOnClickListener(view -> {
            Intent intent = new Intent(welcomeActivity.this,chatActivity.class);
            startActivity(intent);
        });
        ImageView profile = findViewById(R.id.profile);
        profile.setOnClickListener(view -> {
            Intent intent = new Intent(welcomeActivity.this,profileActivity.class);
            startActivity(intent);
        });
        TextView item = findViewById(R.id.item);
        item.setOnClickListener(view -> {
            Intent intent = new Intent(welcomeActivity.this,itemActivity.class);
            startActivity(intent);
        });




    }


    public static void sendNotification(String message){



        try {
                        JSONObject object = new JSONObject();

                        JSONObject notfObject = new JSONObject();
                        notfObject.put("title", "Screenshot Observer");
                        notfObject.put("body", message);

                        JSONObject dataObject = new JSONObject();
                        dataObject.put("userId", currentUid);

                        object.put("notification", notfObject);
                        object.put("data", dataObject);
                      //  object.put("to", fcmtoken);
                         object.put("to", "cWQU0DySSjiE3UnO0qGKNl:APA91bHKn5aNrVmsURJOCHqIuYqcDCeg-Cx5wsDtuwD4YYQ0zxweCsRIbg6yqAayxLuuP_nJ3b4-PncCaKBJc2q-MSW0JLFI2JQn3izG56wrGv6aSZYzSK6eWJRU9DYCIqz_A25n7N-0");

                        callApi(object);




                    }catch (Exception e){

                    }


    }

    private static void callApi(JSONObject object){
        MediaType JSON = MediaType.get("application/json");
        OkHttpClient client = new OkHttpClient();

        String url = "https://fcm.googleapis.com/fcm/send";

        RequestBody body = RequestBody.create(object.toString(), JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .header("Authorization", "Bearer AAAAAjPstAU:APA91bHBO4kREG1i0FS3cvuynMKc_T3iVseO20A07uL7kTuDjvenT6ZgsiSqm3JFtU4fZ-3wZpoAze_WSftGQh96eFMezriL0kqHFf-dDClD1nDJ-_X-Kg_W9aA9TPdX6s-zf4_W87yy")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
//
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                Log.i("notification sent", object.toString());
            }
        });



    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        getContentResolver().unregisterContentObserver(screenshotObserver);
    }


}
