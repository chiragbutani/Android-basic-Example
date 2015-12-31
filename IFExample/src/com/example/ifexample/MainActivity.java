package com.example.ifexample;

import com.example.ifexample.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=(Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int x=0;
		    	int y=0;
		    	int z;
		    	
		    	EditText objmytext1 = (EditText)findViewById(R.id.editText1);
		    	EditText objmytext2= (EditText)findViewById(R.id.editText2);
		    	EditText objmytext3= (EditText)findViewById(R.id.editText3);
		    	
		    	    	
		    	x=Integer.parseInt(objmytext1.getText().toString());
		   	 y=Integer.parseInt(objmytext2.getText().toString());
		   	 
		   	TextView objlbl = (TextView)findViewById(R.id.textView1);
		   	
		     	//Toast.makeText(this, "x : "+String.valueOf(x)+" y : "+String.valueOf(y)+" Sign = "+objmytext3.getText().toString(), Toast.LENGTH_LONG).show();
		    	//char c;
		    	String s=objmytext3.getText().toString();
		    	
		     	//if(c=='+')
		    	//{
		    	//Toast.makeText(this, "Ascii value : "+String.valueOf(ascval)+" character ", Toast.LENGTH_LONG).show();
		    	if(s.equals("+"))
		    	{
		    				
		    	    		z=x+y;
		    	    		Toast.makeText(MainActivity.this, "answer is = "+String.valueOf(z),Toast.LENGTH_LONG).show();
		    	    		objlbl.setText(String.valueOf(z));
		    	    		
		    	} 		
		    	   //}
		    	//objlbl.setText(myoperator);
		    	
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
   
    
}
