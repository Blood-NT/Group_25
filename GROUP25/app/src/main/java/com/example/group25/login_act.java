package com.example.group25;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_act extends AppCompatActivity {
    Button btn_dangky, btn_dangnhap, btn_quenmk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_dangky=findViewById(R.id.btn_dangky);
        btn_dangnhap= findViewById(R.id.btn_dangnhap);
        btn_dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent view2 = new Intent(login_act.this,register_act.class);
                startActivity(view2);
            }
        });

        btn_dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent view2 = new Intent(login_act.this,profile_act.class);
                startActivity(view2);
            }
        });
    }

}