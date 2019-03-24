package com.example.labo3_pdm_00078913;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class ShareActivity extends AppCompatActivity {
    private TextView mTextView;

    private String info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        this.mTextView = findViewById(R.id.t_info);
        Intent mIntent = getIntent();
        if(mIntent!=null){
            this.mTextView.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}