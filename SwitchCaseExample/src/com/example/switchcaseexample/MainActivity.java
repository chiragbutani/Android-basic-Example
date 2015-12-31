package com.example.switchcaseexample;

import com.example.switchcaseexample.R;

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
    public void showoperation(View v)
    {
    	int x=0;
    	int y=0;
    	int z;
    	
    	EditText objmytext1 = (EditText)findViewById(R.id.editText1);
    	EditText objmytext2= (EditText)findViewById(R.id.editText2);
    	EditText objmytext3= (EditText)findViewById(R.id.editText3);
    	String myoperator = new String(objmytext3.getText().toString());
    	//Character xyz = new Character(objmytext3.getText().toString());
    	x=Integer.parseInt(objmytext1.getText().toString());
   	 y=Integer.parseInt(objmytext2.getText().toString());
   	TextView objlbl = (TextView)findViewById(R.id.textView1);
   	
   	switch(myoperator) {
   	case "+":
   		z=x+y;
		objlbl.setText(Integer.toString(z));
   	break;
   	case "-":
   		z=x-y;
		objlbl.setText(Integer.toString(z));
   	break;
   	case "*":
   		
		z=x*y;
		objlbl.setText(Integer.toString(z));
   	break;
   	default:
   		
		z=x/y;
		objlbl.setText(Integer.toString(z));
   	}
   	
   	
    	//if(myoperator == "+")
    	//{
    		//int z;
    	    		//z=x+y;
    	    		//objlbl.setText(Integer.toString(z));
    	//}
    	//objlbl.setText(myoperator);
    	
    	
    	 
    	
    	
    	
    	
    	
    }    
    
}
