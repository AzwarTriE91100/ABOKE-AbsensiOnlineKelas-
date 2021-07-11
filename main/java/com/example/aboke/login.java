package com.example.aboke;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    DataHelper db;
    EditText txUsername, txPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = new DataHelper(this);

        txUsername =  findViewById(R.id.txUsername);
        txPassword =  findViewById(R.id.txPassword);
        btnLogin =  findViewById(R.id.btnLogin);

        //login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txUsername = "";
                String txPassword = "";
                if(txUsername == "" && txPassword == ""){
                    Intent intentt = new Intent(login.this, MainActivity.class);
                    startActivity(intentt);
                    finish();
                }else{

                }
            }
        });
    }
}