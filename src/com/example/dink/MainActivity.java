package com.example.dink;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	private ImageButton searchButton;
	private EditText songField;
	private EditText bandField;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		searchButton = (ImageButton) findViewById(R.id.imageButton1);
		songField = (EditText) findViewById(R.id.editText1);
		bandField = (EditText) findViewById(R.id.EditText01);
		//searchButton.setOnClickListener(this);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		String songName = songField.getText().toString();
		String bandName = bandField.getText().toString();
		songName.replace(' ', '+');
		bandName.replace(' ', '+');
		
	}

}
