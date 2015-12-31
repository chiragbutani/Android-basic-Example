package com.example.radiogroupcheck;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       RadioGroup myrdr = (RadioGroup)findViewById(R.id.radioGroup1);
       int myid = myrdr.getCheckedRadioButtonId();
       switch(myid)
       {
       case R.id.radio0:
    	   Toast.makeText(this, "Male", Toast.LENGTH_LONG).show();
    	   break;
    	   
       case R.id.radio1:
    	   Toast.makeText(this, "female", Toast.LENGTH_LONG).show();
    	   break;
    	   
       case R.id.radio2:
    	   Toast.makeText(this, "both", Toast.LENGTH_LONG).show();
    	   break;
       
       }
        
    }
    private static final String[] COUNTRIES = new String[] {
    	"Belgium","France","Franke","Italy","Germany","Gangotri"
    		};
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
