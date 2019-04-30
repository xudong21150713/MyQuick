package com.example.xudong.myquick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class load extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        findViewById(R.id.login).setOnClickListener(v -> {
            startActivity(new Intent(this, MainInterface.class));
        });
        findViewById(R.id.tv_regist).setOnClickListener(v ->{
            startActivity(new Intent(this,register.class));
        });
    }
}
