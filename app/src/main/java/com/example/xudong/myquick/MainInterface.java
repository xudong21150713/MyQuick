package com.example.xudong.myquick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainInterface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interface);
        findViewById(R.id.outcome).setOnClickListener(v->{
            startActivity(new Intent(this,ThirdInterface.class));
        });
        findViewById(R.id.income).setOnClickListener(v -> {
            startActivity(new Intent(this,SecondInterface.class));
        });
    }
}
