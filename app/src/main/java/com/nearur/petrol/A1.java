package com.nearur.petrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class A1 extends AppCompatActivity {
    EditText t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
        t1=(EditText)findViewById(R.id.editText);
        t2=(EditText)findViewById(R.id.editText2);
        t3=(EditText)findViewById(R.id.editText3);
    }

    public void cl(View v){
        int n=Integer.parseInt(t1.getText().toString().trim());
        String[] c=t2.getText().toString().trim().split(",");
        String[] l=t3.getText().toString().trim().split(",");
        int total=0;
        for(int i=0;i<n;i++){
            total+=Integer.parseInt(c[i])*Integer.parseInt(l[i]);
        }
        Toast.makeText(this, "Total Cost: "+total, Toast.LENGTH_SHORT).show();

    }
}
