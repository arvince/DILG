package com.dilg.dilg;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.net.URL;


public class MainPage extends AppCompatActivity {

    Button bt1, bt2, bt3, bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        bt1 = (Button) findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(MainPage.this, "Test 1 Complete", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainPage.this, Result1.class);
                startActivity(intent);
            }
        });

        bt2 = (Button) findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(MainPage.this, "Test 2 Complete", Toast.LENGTH_SHORT).show();
                Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1W5Sh7cHQibtmhocmtCNroMxyM4p0tS9jn8z6Y1w6O14/edit#gid=1805625760"));
                startActivity(browser);
            }
        });

        bt3 = (Button) findViewById(R.id.button4);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(MainPage.this, "Test 3 Complete", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainPage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        bt4 = (Button) findViewById(R.id.button5);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(MainPage.this, "Test 4 Complete", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
