package com.example.optionmenuexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {
private int searchBtnid=Menu.FIRST;
private int scheduleBtnid=Menu.FIRST+1;
private int playBtnid=Menu.FIRST+2;
private int stopBtnid=Menu.FIRST+3;
private int group1id=1;
private int group2id=2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	menu.add(group1id,searchBtnid,searchBtnid,"Search");
    	menu.add(group2id,scheduleBtnid,scheduleBtnid,"Schedule");
    	menu.add(group1id,playBtnid,playBtnid,"Play");
    	menu.add(group1id,stopBtnid,stopBtnid,"Stop");
    	menu.setGroupVisible(2, false);
    	return super.onCreateOptionsMenu(menu);
        //getMenuInflater().inflate(R.menu.activity_main, menu);
        //return true;
    }

    
}
