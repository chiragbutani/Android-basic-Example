package com.example.spinnerexample;

import com.example.spinnerexample.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ArrayAdapter<String> myadapter3 = new ArrayAdapter<String>(this,
        		android.R.layout.simple_spinner_item, COUNTRIES);

        Spinner mysp = (Spinner)findViewById(R.id.spinner1);
        mysp.setAdapter(myadapter3);
        
       mysp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

		public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			//Toast.makeText(this, "You Selected "+ arg0.getSelectedItemPosition()+" : "+arg0.getItemAtPosition(arg2).toString(),Toast.LENGTH_LONG).show();
			
			Toast.makeText(MainActivity.this, "You Selected "+ arg0.getSelectedItemPosition()+" : "+arg0.getItemAtPosition(arg2).toString(),Toast.LENGTH_LONG).show();
		}

		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			
		}
	});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    private static final String[] COUNTRIES = new String[] {
    	"Belgium","France","Franke","Italy","Germany","Gangotri"
    		};
}
