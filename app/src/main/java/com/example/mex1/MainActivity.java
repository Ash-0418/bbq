package com.example.mex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ta1,ta2,ta3,ta4;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        ta1=(TextView)findViewById(R.id.ta);
        ta2=(TextView)findViewById(R.id.ta2);
        ta3=(TextView)findViewById(R.id.ta3);
        ta4=(TextView)findViewById(R.id.ta4);
        b1=(Button)findViewById(R.id.b1);
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View view) {
                                      ta2.setText("");
                                      ta4.setText("");
                                  }
                              }

        );//수정버튼


        b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1=new Intent(getApplication(),sub1.class);
                String s1=ta2.getText().toString();
                it1.putExtra("id",s1);
                startActivity(it1);
            }
        });

    }//onCreate
}//class