package com.example.flipcart;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class Fur extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fur);
	}
	public void one(View view)
	 {
		MyDbHandler mydb=new MyDbHandler(getApplicationContext());
mydb.insert("FoldingChair","1000");
Toast.makeText(getApplicationContext(), "Added to cart", Toast.LENGTH_SHORT).show();
	 }
	public void two(View view)
	 {
		MyDbHandler mydb=new MyDbHandler(getApplicationContext());
		mydb.insert("DinningSet","8000");
		Toast.makeText(getApplicationContext(), "Added to cart", Toast.LENGTH_SHORT).show();
	 }
	public void three(View view)
	 {
		MyDbHandler mydb=new MyDbHandler(getApplicationContext());
		mydb.insert("Studytable","5000");
		Toast.makeText(getApplicationContext(), "Added to cart", Toast.LENGTH_SHORT).show(); 
	 }
	public void cart2(View view)
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
		getMenuInflater().inflate(R.menu.men, menu);
		return true;
	}

}
