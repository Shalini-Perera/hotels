package com.example.next;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.send);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSecond();
            }
        });
        Button btn2 = (Button) findViewById(R.id.galle);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToGalle();
            }
        });
    }
     private void moveToSecond(){
         Intent intent = new Intent(MainActivity.this ,Hotels.class);
         startActivity(intent);
     }
     private void moveToGalle(){
        Intent intent = new Intent(MainActivity.this,HotelsGalle.class);
        startActivity(intent);
     }

}
