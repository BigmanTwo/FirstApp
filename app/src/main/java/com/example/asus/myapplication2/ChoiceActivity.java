package com.example.asus.myapplication2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Asus on 2016/3/24.
 */
public class ChoiceActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,View.OnClickListener {
     private RadioGroup mRadioGroup;
    private RadioButton mMan,mWoman;
    private Button mButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice_layout);
        mMan= (RadioButton) findViewById(R.id.man);
        mWoman=(RadioButton)findViewById(R.id.woman);
        mRadioGroup= (RadioGroup) findViewById(R.id.my_radiogroup);
        mButton= (Button) findViewById(R.id.button);
        mButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(mMan.isChecked()) {
            Toast.makeText(ChoiceActivity.this, mMan.getText(), Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(ChoiceActivity.this, mWoman.getText(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

    }
}
