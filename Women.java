package com.example.flipcart;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class Women extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_women);
	}
	public void anarkali(View view)
	 {
		MyDbHandler mydb=new MyDbHandler(getApplicationContext());
mydb.insert("Anarkali","5000");
Toast.makeText(getApplicationContext(), "Added to cart", Toast.LENGTH_SHORT).show();
	 }
	public void dabaang(View view)
	 {
		MyDbHandler mydb=new MyDbHandler(getApplicationContext());
		mydb.insert("Dabaang","2000");
		Toast.makeText(getApplicationContext(), "Added to cart", Toast.LENGTH_SHORT).show();
	 }
	public void saree(View view)
	 {
		MyDbHandler mydb=new MyDbHandler(getApplicationContext());
		mydb.insert("Saree","4000");
		Toast.makeText(getApplicationContext(), "Added to cart", Toast.LENGTH_SHORT).show(); 
	 }
	public void cart(View view)
	 {
		 startActivity(new Intent(this,DisplayActivity.class));
	 }
	public void back(View view)
	 {
		 startActivity(new Intent(this,ShopActivity.class));
	 }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.women, menu);
		return true;
	}

}
