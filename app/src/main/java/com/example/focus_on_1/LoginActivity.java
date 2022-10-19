package com.example.focus_on_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

//    private FirebaseDatabase database = FirebaseDatabase.getInstance();
//    private DatabaseReference databaseReference = database.getReference();

    Button loginBtn;
    Button regBtn;
//    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = findViewById(R.id.LoginBtn);
        regBtn = findViewById(R.id.RegisterBtn);

        // 로그인 버튼 눌렀을 때
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                addemail(editText.getText().toString());

                Intent intentM = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentM);
                finish();
            }
        });

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentR = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intentR);
            }
        });

        ImageView titleview;
        titleview = (ImageView) findViewById(R.id.titleimage);
        final Animation animtitle = AnimationUtils.loadAnimation(this,R.anim.title);

        titleview.startAnimation(animtitle);
    }

//    public void addemail(String email){
//        firebasetest firebasetest = new firebasetest(email);
//        databaseReference.child("user").child("id").setValue(email);
//    }
}