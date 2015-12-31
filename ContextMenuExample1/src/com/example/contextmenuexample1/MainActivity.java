package com.example.contextmenuexample1;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btn = (Button)findViewById(R.id.button1);
        registerForContextMenu(btn);
    }
@Override
public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuinfo)
{
	super.onCreateContextMenu(menu, v, menuinfo);
	menu.setHeaderTitle("ContextMenu");
	menu.add(0,v.getId(),0,"Action 1");
	menu.add(0,v.getId(),0,"Action 2");
	
}
@Override
public boolean onContextItemSelected(MenuItem item)
{
	if(item.getTitle()=="Action 1")
	{
		
		function1(item.getItemId());
	}
	else if(item.getTitle()=="Action 2")
	{
		
		function2(item.getItemId());
	}
	
	return true;
}
    private void function2(int id) {
    	Toast.makeText(this, "function 1 called", Toast.LENGTH_LONG).show();
	// TODO Auto-generated method stub
	
}
	private void function1(int id) {
		Toast.makeText(this, "function 2 called", Toast.LENGTH_LONG).show();
	// TODO Auto-generated method stub
	
}
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
