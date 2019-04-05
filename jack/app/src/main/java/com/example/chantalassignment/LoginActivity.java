package com.example.chantalassignment;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    TextView txtFdBack;
    String txtUsername, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.edtUserName);
        password = findViewById(R.id.edtPassword);
        txtFdBack = findViewById(R.id.txtFeedBackMsg);
    }

    public void loginClicked(View v){
        txtUsername = username.getText().toString();
        txtPassword = password.getText().toString();

        if (txtUsername.contentEquals("Chantal") && txtPassword.contentEquals("1234")){
            txtFdBack.setText("Login = Success");
            txtFdBack.setTextColor(Color.BLUE);
        }else{
            txtFdBack.setText("Invalid");
            txtFdBack.setTextColor(Color.RED);
        }

    }

    public void registerClicked(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
