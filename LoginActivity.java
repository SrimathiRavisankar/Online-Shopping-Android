package com.example.flipcart;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.*;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	public void shop(View view)
	{
		EditText e1=(EditText)findViewById(R.id.editText1);
		EditText e2=(EditText)findViewById(R.id.editText2);
		Editable s1=e1.getText();
		Editable s2=e2.getText();
			
		if(((s1.toString()).equals("msk"))&& ((s2.toString()).equals("msk")))
		{ 
			Toast.makeText(getApplicationContext(),"login successfull", Toast.LENGTH_SHORT).show(); 
			
			startActivity(new Intent(this,ShopActivity.class));
		
		}
		else
		{
			Toast.makeText(getApplicationContext(),"Sorry incorrect username or password", Toast.LENGTH_SHORT).show(); 
			
		}
		
		}

}
