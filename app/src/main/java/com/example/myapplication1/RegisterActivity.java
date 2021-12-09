package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7;
    AppCompatButton b1,b2;
    String getname,getaddress,getphoneno,getemailid,getusername,getpassword,getconfirmpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e1=(EditText) findViewById(R.id.name);
        e2=(EditText) findViewById(R.id.address);
        e3=(EditText) findViewById(R.id.ph);
        e4=(EditText) findViewById(R.id.id);
        e5=(EditText) findViewById(R.id.username);
        e6=(EditText) findViewById(R.id.password);
        e7=(EditText) findViewById(R.id.confirm_password);
        b1=(AppCompatButton) findViewById(R.id.login);
        b2=(AppCompatButton)findViewById(R.id.gr);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),getname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getaddress, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getphoneno, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getemailid, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getusername, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getpassword, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getconfirmpassword, Toast.LENGTH_SHORT).show();


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}