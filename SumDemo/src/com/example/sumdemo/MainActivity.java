package com.example.sumdemo;

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

    public void showsum(View v)
    {
    	double x=0;
    	double y=0;
    	double z;
    	
    	EditText objmytext1 = (EditText)findViewById(R.id.editText1);
    	EditText objmytext2= (EditText)findViewById(R.id.editText2);
    	  	
    	//String mystr1 = objmytext1.getText().toString();
    	//String mystr2 = objmytext2.getText().toString();
    	 x=Double.parseDouble(objmytext1.getText().toString());
    	 y=Double.parseDouble(objmytext2.getText().toString());
    	z=x+y;
    	TextView objlbl = (TextView)findViewById(R.id.textView2);
    	objlbl.setText(Double.toString(z));
    	
    }    
}
