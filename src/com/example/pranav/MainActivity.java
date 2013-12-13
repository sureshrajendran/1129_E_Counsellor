package com.example.pranav;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	
	Button b1,b2,b3,b4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
b1=(Button) findViewById(R.id.button1);
b1.setOnClickListener(this);

b2=(Button) findViewById(R.id.button2);
b2.setOnClickListener(this);

b3=(Button) findViewById(R.id.button3);
b3.setOnClickListener(this);

b4=(Button) findViewById(R.id.button4);
b4.setOnClickListener(this);


	}
	@Override
	public void onClick(View E) {
		// TODO Auto-generated method stub
		if(E==b1)
		{
			Intent i=new Intent(this,AngerManagement.class);
			startActivity(i);
		}
		if(E==b2)
		{
			Intent i=new Intent(this,Anxiety.class);
			startActivity(i);
		}
		if(E==b3)
		{
			Intent i=new Intent(this,Depression.class);
			startActivity(i);
		}
		
		
		
		
	}




}
