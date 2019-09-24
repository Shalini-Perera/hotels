package com.example.next;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btn = (Button) findViewById(R.id.hotels);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToHotels();
            }
        });
        Button btn2 = (Button) findViewById(R.id.info);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToInfo();
            }
        });
    }
    private void moveToHotels(){
        Intent intent = new Intent(Second.this , Hotels.class);
        startActivity(intent);
    }
    private void moveToInfo(){
        Intent intent = new Intent(Second.this, Hotels.class);
        startActivity(intent);
    }
}
