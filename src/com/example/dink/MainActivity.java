package com.example.dink;

import android.app.Activity;
import android.os.Bundle;
import android.sax.TextElementListener;
import android.view.Menu;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends Activity {

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
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
