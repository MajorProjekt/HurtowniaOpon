package com.example.major.hurtowniaopon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button klientButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        klientButton = (Button) findViewById(R.id.menu_Klient);
        klientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainKlientActivity();
            }
        });
    }

    private void openMainKlientActivity(){
        Intent intent = new Intent(this, MainKlient.class);
        startActivity(intent);
    }
}
