package com.example.userloginpage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private UserDatabaseManager dbhelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        dbhelper =  new UserDatabaseManager(this);
        dbhelper.open();



        TextView t1 = findViewById(R.id.t1);
        Button login = findViewById(R.id.login);
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);

        t1.setOnClickListener(v->{
            Intent i = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(i);
        });

        login.setOnClickListener(v->{
            String usernameText = usernameEditText.getText().toString();
            String passwordText = passwordEditText.getText().toString();

        });
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        dbhelper.close();
    }
}
