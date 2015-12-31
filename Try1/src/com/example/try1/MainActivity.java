package com.example.try1;

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
	EditText objmytext = (EditText)findViewById(R.id.editText1);
	String mystr = objmytext.getText().toString();
	TextView objlbl = (TextView)findViewById(R.id.textView2);
	objlbl.setText(mystr);
	
}
    
}
