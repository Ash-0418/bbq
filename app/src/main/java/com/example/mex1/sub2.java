package com.example.mex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sub2 extends AppCompatActivity {


    TextView ta,ta1,ta22,ta33,ta44;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);
        ta=(TextView)findViewById(R.id.ta);



        b=(Button)findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ta1=(TextView)findViewById(R.id.ta1);
        ta22=(TextView)findViewById(R.id.ta22);
        ta33=(TextView)findViewById(R.id.ta33);
        ta44=(TextView)findViewById(R.id.ta44);

        /*
        Intent getit=getIntent();
        String s1=getit.getStringExtra("id");
        ta.setText(s1+" 주문 결과");
         */
        Intent getit=getIntent();
        String s1=getit.getStringExtra("id");
        String s2=getit.getStringExtra("sp1");
        String s3=getit.getStringExtra("sp2");
        //radio
        String s4=getit.getStringExtra("r");

        ta1.setText(s1);
        ta22.setText(s2);
        ta33.setText(s3);
        ta44.setText(s4);
    }//onCreate
}//class