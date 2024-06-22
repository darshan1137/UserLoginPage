package com.example.userloginpage;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        Bundle b1 = getIntent().getExtras();
//        assert b1 != null;

        TextView t1 = findViewById(R.id.t2);
        TextView t2 = findViewById(R.id.t3);
        TextView t3 = findViewById(R.id.t5);
        TextView t4 = findViewById(R.id.t6);

        String e1 = getIntent().getStringExtra("Username");
        String e2 = getIntent().getStringExtra("Name");
        String e3 = getIntent().getStringExtra("Email");
        String e4 = getIntent().getStringExtra("Gender");
//
//        t1.setText(b1.getString("Username"));
//        t2.setText(b1.getString("Name"));
//        t3.setText(b1.getString("Email"));
//        t4.setText(b1.getString("Gender"));

        t2.setText(e2);
        t3.setText(e3);
        t4.setText(e4);
        t1.setText(e1);
    }
}
