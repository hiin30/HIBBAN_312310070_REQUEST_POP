package com.example.requestpop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;

public class LoginActivity extends AppCompatActivity {
    

    View edUsername;
    View edPassword;
    View btn;
    TextView tv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        edUsername = findViewById(R.id.editTextTextLoginUser);
        edPassword = findViewById(R.id.editTextTextLoginPassword);
        btn = findViewById(R.id.buttonlogin);
        tv= findViewById(R.id.daftar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=edUsername.getText().toString;
                String password=edPassword.getText().toString;
                if (username.length()==0 || password.length()==0){
                    Toast.makeText(getApplicationContext(),"password salah",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"login selesai",Toast.LENGTH_LONG).show();
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivities(new Intent(LoginActivity.this,RegisterActivity.class));

            }
        });
    }
}