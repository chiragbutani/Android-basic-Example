package com.example.contextmenuexample2;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.example.contextmenuexample2.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {
private String[] Countries;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Countries = getResources().getStringArray(R.array.countries);
        Arrays.sort(Countries);
        ListView list = (ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, id.listView1,Countries);
        list.setAdapter(adapter);
        registerForContextMenu(list);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuinfo)
    {
    	if(v.getId()==R.id.listView1)
    	{
    		AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)menuinfo;
    		menu.setHeaderTitle(Countries[info.position]);
    		String[] menuItems = getResources().getStringArray(R.array.menu);
    		for(int i=0;i<menuItems.length;i++)
    		{
    			menu.add(Menu.NONE,i,i,menuItems[i]);
    		}
    		
    	}
    }
    
    
    
    
   @Override
   public boolean onContextItemSelected(MenuItem item)
   {
	   AdapterView.AdapterContextMenuInfo info =(AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
	   int menuItemIndex = item.getItemId();
	   String[] menuItems =getResources().getStringArray(R.array.menu);
	   String menuItemName =menuItems[menuItemIndex];
	   String listItemName =Countries[info.position];
	   
	   TextView text = (TextView)findViewById(R.id.textView1);
	   text.setText(String.format("Selected %s for item %s", menuItemName, listItemName));
	   
	   return true;
	   
   }

    
}
