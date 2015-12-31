package com.example.practice1;

import org.w3c.dom.Text;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
public void showans(View v)
{
	/*
	EditText txt1 = (EditText)findViewById(R.id.editText1);
	String str = txt1.getText().toString();
	TextView mytext = (TextView)findViewById(R.id.textView1);
	mytext.setText("Welcome " +str);
	//upar nu coding textbox ma je lakho e lable ma print karva mate 6.
	 
	 */
	
	EditText txt1 = (EditText)findViewById(R.id.editText1);
	int a = Integer.parseInt(txt1.getText().toString());
	
	EditText txt2 = (EditText)findViewById(R.id.editText2);
	int b = Integer.parseInt(txt2.getText().toString());
	int c = a+b;
	
	TextView mytext = (TextView)findViewById(R.id.textView1);
	mytext.setText(String.valueOf(c));
	
	
}
    
}
