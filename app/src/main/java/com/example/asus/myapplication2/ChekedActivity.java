package com.example.asus.myapplication2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 2016/3/24.
 */
public class ChekedActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButton;
    private LinearLayout mLinearLayout;
    private List<CheckBox> list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_layout);
        mButton= (Button) findViewById(R.id.button);
        mLinearLayout=(LinearLayout)findViewById(R.id.linear);
        mButton.setOnClickListener(this);
    }

    @Override

    public void onClick(View v) {
        list=new ArrayList<>();
        for(int i=0;i<mLinearLayout.getChildCount();i++){
            CheckBox mChekBox= (CheckBox) mLinearLayout.getChildAt(i);
            if(mChekBox.isChecked()) {
                list.add(mChekBox);
            }
        }
        for(int i=0;i<list.size();i++){
                Toast.makeText(ChekedActivity.this, list.get(i).getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
