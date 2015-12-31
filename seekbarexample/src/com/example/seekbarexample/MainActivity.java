package com.example.seekbarexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.widget.*;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
public class MainActivity extends Activity {
	SeekBar mSeekbar;
	TextView mProgressText;
	TextView mTrackingText;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSeekbar=(SeekBar)findViewById(R.id.seekBar1);
        mSeekbar.setOnSeekBarChangeListener((OnSeekBarChangeListener) this);
        mProgressText=(TextView)findViewById(R.id.progress);
        mTrackingText=(TextView)findViewById(R.id.tracking);
    }
    
    public void onProgressChanged(SeekBar seekbar, int progress, boolean fromTouch)
    {
    	mProgressText.setText(progress + " "+getString(R.string.seekbar_from_touch)+ "="+fromTouch);
    }
    
    public void onStartTrackingTouch(SeekBar seekBar)
    {
    	mTrackingText.setText(getString(R.string.seekbar_tracking_on));
    }
    
    public void onStopTrackingTouch(SeekBar arg0)
    {
    	mTrackingText.setText(getString(R.string.seekbar_tracking_off));
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
