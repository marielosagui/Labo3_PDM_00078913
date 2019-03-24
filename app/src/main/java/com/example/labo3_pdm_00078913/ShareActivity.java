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
    private static final String TAG = MainActivity.class.getSimpleName();



    private Button mButton;



    private EditText mEditText, mEditText1, mEditText2;



    private RadioButton mRadioButton;



    private RadioGroup mRadioGroup;



    private String name, pass, email, gender;



    private int id;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        this.mButton = findViewById(R.id.btn_share);

        this.mEditText = findViewById(R.id.et_name);

        this.mEditText1 = findViewById(R.id.et_pass);

        this.mEditText2 = findViewById(R.id.et_email);



        this.mRadioGroup = findViewById(R.id.rg_selection);



        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ShareActivity.this.name = ShareActivity.this.mEditText.getText().toString();

                ShareActivity.this.pass = ShareActivity.this.mEditText1.getText().toString();

                ShareActivity.this.email = ShareActivity.this.mEditText2.getText().toString();


                ShareActivity.this.id = ShareActivity.this.mRadioGroup.getCheckedRadioButtonId();


                ShareActivity.this.mRadioButton = ShareActivity.this.findViewById(ShareActivity.this.id);


                ShareActivity.this.gender = ShareActivity.this.mRadioButton.getText().toString();


                Intent mIntent;
                mIntent = new Intent(MainActivity.this, NewActivity.class);

                mIntent.putExtra(AppConstants.TEXT_NAME, name);

                mIntent.putExtra(AppConstants.TEXT_PASS, pass);

                mIntent.putExtra(AppConstants.TEXT_MAIL, email);

                mIntent.putExtra(AppConstants.TEXT_GENDER, gender);

                ShareActivity.this.startActivity(mIntent);

            }
        });
    }

}