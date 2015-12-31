package com.example.autocompleteviewpractice;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//ArrayAdapter<String> myadapter = new ArrayAdapter<String>(this,
				//android.R.layout.simple_dropdown_item_1line, COUNTRIES);
		//AutoCompleteTextView myview = (AutoCompleteTextView)findViewById(R.id.autocompleteTextView1);
		//myview.setAdapter(myadapter);
		
		ArrayAdapter<String> myadapter1 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, COUNTRIES);
		ListView mylist =(ListView)findViewById(R.id.listView1);
		mylist.setAdapter(myadapter1);
		
		
		
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
