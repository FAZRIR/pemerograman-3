package com.example.suhubangker;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;


public class Cover extends Activity implements OnClickListener {

	Animation tls;
	Button pencet;
	TextView welcome;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cover);
		
		pencet = (Button)findViewById(R.id.teken);
		pencet.setOnClickListener(this);
		
		welcome = (TextView)findViewById(R.id.tulisan);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
Intent f=new Intent(this,MainActivity1.class);
		startActivity(f);
//		
		
	}

}
