package com.example.asus.myapplication2;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
        private Button mButton,mButton1,mButton2;
//         private EditText mEditText;
//    private Button mButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton= (Button) findViewById(R.id.button1);
        mButton1= (Button) findViewById(R.id.button2);
        mButton2= (Button) findViewById(R.id.button3);
        mButton.setOnClickListener(this);
        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
//        mEditText= (EditText) findViewById(R.id.edit_text);
//        mButton= (Button) findViewById(R.id.button1);

//        mButton.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View v) {
//        String str=mEditText.getText().toString();
//        if(str.equals("")){
//            Toast.makeText(this,"请输入内容",Toast.LENGTH_SHORT).show();
//        }
//        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
//    }
        @Override
    public void onClick(View v) {
            Intent intent=new Intent();
        switch (v.getId()) {
            case R.id.button1:
            Toast.makeText(this, "点击1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                intent.setComponent(new ComponentName(MainActivity.this,ChekedActivity.class));
                startActivity(intent);
                break;
            case R.id.button3:
                intent.setComponent(new ComponentName(MainActivity.this,ChoiceActivity.class));
                startActivity(intent);
                break;
        }
    }
}
