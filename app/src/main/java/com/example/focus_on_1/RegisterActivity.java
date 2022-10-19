package com.example.focus_on_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    Button exitBtn, regBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        exitBtn = findViewById(R.id.exitBtn1);
        regBtn = findViewById(R.id.regBtn);

        TextView textview;
        textview = (TextView) findViewById(R.id.regtitle);
        final Animation animtitle = AnimationUtils.loadAnimation(this,R.anim.title);

        textview.startAnimation(animtitle);

        Animation reganim = AnimationUtils.loadAnimation(this,R.anim.reglayout);
        ViewGroup reglayout = (ViewGroup) findViewById(R.id.regLayout);

        reglayout.startAnimation(reganim);

        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentL1 = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intentL1);
                finish();
            }
        });

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //회원가입 버튼 누를 때 빈 칸 없는지 확인하는 절차 추가할 것
                Intent intentL2 = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intentL2);
                finish();
            }
        });
    }
}