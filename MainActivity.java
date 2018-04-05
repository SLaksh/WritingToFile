package com.example.writingandreading;

import java.io.OutputStreamWriter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity 
{
	private final static String STORETEXT="storetext.txt";
	 
	private EditText txtEditor;
	@Override
	
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		txtEditor=(EditText)findViewById(R.id.editText1);
	}
	
	public void saveClicked(View v) 
	{
		 
		try {
		 
		OutputStreamWriter out=		 
		new OutputStreamWriter(openFileOutput(STORETEXT, 0));
		 
		out.write(txtEditor.getText().toString());		
		out.close();		 
		Toast.makeText(this, "The contents are saved in the file.",
		Toast.LENGTH_LONG).show();
		 
		}
		 
		catch (Throwable t) 
		{
		Toast.makeText(this, "Exception: "+t.toString(), 
				Toast.LENGTH_LONG).show();
		 
		}
		 
		}

}
