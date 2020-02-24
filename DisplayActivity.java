package com.example.flipcart;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.*;
/**
 * Created by ctslab on 16/8/16.
 */
public class DisplayActivity extends Activity {
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        int i;
        String x="";
        setContentView(R.layout.activity_display);
        EditText t1= (EditText) findViewById(R.id.editText1);
        //String name=t1.getText().toString();
        MyDbHandler db=new MyDbHandler(this);
        ArrayList<String > y=db.displayall();
       int sum=0;
       for(i=0;i<y.size();i++){ 
          String s=y.get(i);
        	 String k[]=s.split(" ");
        	 //Toast.makeText(getApplicationContext(),k[1], Toast.LENGTH_SHORT).show(); 
        	 int v=Integer.valueOf(k[1]);
sum+=v;
       
x+=(i+1)+"\t\t";        		 
x+=k[0]+"    Rs."+k[1]+"\n"+"\n";
          
           
        }
         
       t1.setText(x+"Total is"+sum);
      
       //t1.setText("Total is"+sum);
    }
public void buy(View view)
{
	startActivity(new Intent(this,Buy.class));
}
}
