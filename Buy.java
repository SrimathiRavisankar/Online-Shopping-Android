package com.example.flipcart;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.SmsManager;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Buy extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buy);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.buy, menu);
		return true;
	}
	public void buy1(View view)
	{
		EditText e1=(EditText)findViewById(R.id.editText1);
		EditText e2=(EditText)findViewById(R.id.editText2);
		EditText e3=(EditText)findViewById(R.id.editText3);
		EditText e4=(EditText)findViewById(R.id.editText4);
		EditText e5=(EditText)findViewById(R.id.editText5);
		Editable s1=e1.getText();
		Editable s2=e2.getText();
		Editable s3=e3.getText();
		Editable s4=e4.getText();
		Editable s5=e5.getText();

		if(((s1.toString()).equals(""))||((s2.toString()).equals(""))||((s4.toString()).equals(""))||((s3.toString()).equals(""))||((s5.toString()).equals("")))
			Toast.makeText(getApplicationContext(),"fill all details", Toast.LENGTH_SHORT).show(); 
					else
					{
			Toast.makeText(getApplicationContext(),"Products will be shortly delivered", Toast.LENGTH_SHORT).show(); 
	        SmsManager smsmanager=SmsManager.getDefault();
	        smsmanager.sendTextMessage(e2.getText().toString(),null,"Your Products will be delivered within this week",null,null);
	        Toast.makeText(getApplicationContext(), "successfully send ", Toast.LENGTH_SHORT).show();

					}
		}

}
