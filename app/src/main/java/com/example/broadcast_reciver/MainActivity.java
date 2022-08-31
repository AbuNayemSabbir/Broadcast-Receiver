package com.example.broadcast_reciver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageReceive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageReceive=findViewById(R.id.imageReciveId);

        Intent intent=getIntent();
        String action=intent.getAction();
        String type=intent.getType();

        if (Intent.ACTION_SEND.equals(action)&& type!=null){
            imageReceive.setImageURI(intent.getParcelableExtra(Intent.EXTRA_STREAM));
        }
    }
}