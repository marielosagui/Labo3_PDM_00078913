package com.example.labo3_pdm_00078913;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NewActivity extends AppCompatActivity {

    TextView mText1;
    String text_aux;
    Button mSubmitAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        mText1 =findViewById(R.id.prueba_text);

        mSubmitAction=findViewById(R.id.submit2_action);

      text_aux="Texto Quemado";

        Intent new_Intent =getIntent();

        if(new_Intent != null){
          text_aux =new_Intent.getStringExtra(AppConstants.TEXT1_KEY);
        }
        mText1.setText(new_Intent.getStringExtra(AppConstants.TEXT1_KEY));
        mSubmitAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent2 =new Intent();

                m_intent2.setAction(Intent.ACTION_SEND);
                m_intent2.setType("text/plain");

                m_intent2.putExtra(Intent.EXTRA_TEXT,text_aux);

                startActivity(m_intent2);
            }
        });

    }
}
