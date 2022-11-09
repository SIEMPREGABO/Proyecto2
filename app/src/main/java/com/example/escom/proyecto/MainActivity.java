package com.example.escom.proyecto;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity{
    private Intent in;
    public Button Btninit;
    public EditText EditTUser,EditTPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btninit = findViewById(R.id.Btninit);
        EditTUser = findViewById(R.id.EditTUser);
        EditTPass = findViewById(R.id.EditTPass);

        Btninit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(MainActivity.this,App.class);
                startActivity(in);
            }
        });
    }
}