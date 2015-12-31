package com.example.listviewexample;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ArrayAdapter<String> myadapter2 = new ArrayAdapter<String>(this,
        		android.R.layout.simple_list_item_1, COUNTRIES);
        ListView mylist = (ListView)findViewById(R.id.listView1);
        mylist.setAdapter(myadapter2);
        
        
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
