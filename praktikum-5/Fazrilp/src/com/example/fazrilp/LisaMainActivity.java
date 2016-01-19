package com.example.fazrilp;


import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class LisaMainActivity extends Activity {
	Button btnExit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lisa_main);
		 addListenerOnButton();
	}
	
	public void addListenerOnButton(){
    	final Context context = this;
    	btnExit = (Button) findViewById(R.id.btnExit);
    	btnExit.setOnClickListener(new View.OnClickListener() {

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i = new Intent(context,MainActivityFazrilp.class);
		startActivity(i);
	 }
  });
}
}	
	
	
