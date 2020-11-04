package com.example.mex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class sub1 extends AppCompatActivity {
    TextView ta;
    Spinner sp1;
    ListView li;
    RadioButton r1,r2;
    Button b2;
    String sp_it1[]={"후라이드","양념","반반"};
    String li_it[]={"콜라","사이다"};
    String v;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        ta=(TextView)findViewById(R.id.ta);
        Intent getit=getIntent();
        String s1=getit.getStringExtra("id");
        ta.setText(s1+" 주문");

        //메뉴
        sp1=(Spinner)findViewById(R.id.sp1);
        ArrayAdapter<String> ad1= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked,sp_it1);
        sp1.setAdapter(ad1);

        //사이드 메뉴-listview
        li=(ListView)findViewById(R.id.li);
        ArrayAdapter<String> ad2= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,li_it);
        li.setAdapter(ad2);

        li.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int i=position;

                if(i==0) v="콜라";
                else if(i==1) v="사이다";

            }
        });


        rg=(RadioGroup)findViewById(R.id.rg);
        r1=(RadioButton)findViewById(R.id.r1);
        r2=(RadioButton)findViewById(R.id.r2);



        //이전화면
        /*b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

         */
        b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it1=new Intent(getApplication(),sub2.class);
                Intent getit=getIntent();
                String s1=getit.getStringExtra("id");

                String s2= (String)sp1.getSelectedItem();
                String s3= (String)li.getSelectedItem();


                int id = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(id);
                String s4=rb.getText().toString();

                it1.putExtra("id",s1);
                it1.putExtra("sp1",s2);
                it1.putExtra("sp2",s3);
                it1.putExtra("r",s4);
                startActivity(it1);
            }
        });
    }//onCreate
}//class