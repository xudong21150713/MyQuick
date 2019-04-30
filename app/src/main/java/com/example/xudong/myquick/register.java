package com.example.xudong.myquick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        findViewById(R.id.bt_regist_save).setOnClickListener(v ->{
            startActivity(new Intent(this,MainInterface.class));
        });
        findViewById(R.id.bt_regist_cancel).setOnClickListener(v->{
            startActivity(new Intent(this,load.class));
        });
    }
}
