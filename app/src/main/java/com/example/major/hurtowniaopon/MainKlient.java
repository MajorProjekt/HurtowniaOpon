package com.example.major.hurtowniaopon;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainKlient extends AppCompatActivity {
    private ImageButton addKlientButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_klient);

        addKlientButton = (ImageButton) findViewById(R.id.AddButtonKlient);
       addKlientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddKlientActivity();
            }
        });

    }

    private void openAddKlientActivity(){
        Intent intent = new Intent(this, AddKlient.class);
        startActivity(intent);
    }

}
