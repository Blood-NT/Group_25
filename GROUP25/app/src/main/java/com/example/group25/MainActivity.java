package com.example.group25;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void getViews(){
        btn_check=findViewById(R.id.check_ok);
    }
    public void onClick(View v){
        Intent view2 = new Intent(MainActivity.this,login_act.class);
        startActivity(view2);
    }
}