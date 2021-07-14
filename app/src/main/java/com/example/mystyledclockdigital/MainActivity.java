package com.example.mystyledclockdigital;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import java.util.Date;
import android.widget.Button;



public class MainActivity extends Activity implements View.OnClickListener{
    Button hello;

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_main);
        hello=findViewById(R.id.button);
        hello.setOnClickListener(this);
        updateTime();    }
        @Override
        public void onClick(View view){
        updateTime();
        }


    private void updateTime() {
        hello.setText(new Date().toString());
    }
}