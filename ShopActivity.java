package com.example.flipcart;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ShopActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shop);
	}
	public void select(View view){
		//Toast.makeText(getApplicationContext(), "successfully", Toast.LENGTH_SHORT).show();
		 RadioGroup gender = (RadioGroup) findViewById(R.id.radioGroup1);
	       int selectedId = gender.getCheckedRadioButtonId();
	       //Toast.makeText(getApplicationContext(), "1 registered", Toast.LENGTH_SHORT).show();
	     RadioButton gen = (RadioButton) findViewById(selectedId);
	       String gen1=gen.getText().toString();
	       if(gen1.equals("women"))
	       {
	    	   startActivity(new Intent(this,Women.class));
	       }
	       else  if(gen1.equals("Men"))
	       {
	    	   startActivity(new Intent(this,Men.class));
	       }
	       else if(gen1.equals("Children"))
	       {
	    	   startActivity(new Intent(this,Child.class));
	       }
	       else  if(gen1.equals("Kitchen"))
	       {
	    	   startActivity(new Intent(this,Kic.class));
	       }
	       else  if(gen1.equals("Furniture"))
	       {
	    	   startActivity(new Intent(this,Fur.class));
	       }
	       else  if(gen1.equals("Crafts in India"))
	       {
	    	   startActivity(new Intent(this,Craft.class));
	       }
	       else  if(gen1.equals("Book"))
	       {
	    	   startActivity(new Intent(this,Book.class));
	       }
	       else  if(gen1.equals("DecorLightings"))
	       {
	    	   startActivity(new Intent(this,Decor.class));
	       }
	       else  if(gen1.equals("Gardening"))
	       {
	    	   startActivity(new Intent(this,Gard.class));
	       }
	       else  if(gen1.equals("Electronic Items"))
	       {
	    	   startActivity(new Intent(this,Elec.class));
	       }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.shop, menu);
		return true;
	}

}
