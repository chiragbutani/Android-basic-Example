package com.example.animation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //final Animation a = AnimationUtils.loadAnimation(this, R.anim.alpha);        
        //final Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate);
        //final Animation a = AnimationUtils.loadAnimation(this, R.anim.scale); 
      //final Animation a = AnimationUtils.loadAnimation(this, R.anim.translate);
      final Animation a = AnimationUtils.loadAnimation(this, R.anim.set);
        
        a.reset();
        
        final TextView rText = (TextView)findViewById(R.id.textView1);
        LinearLayout mylayout = (LinearLayout)findViewById(R.id.root);
        
               
		mylayout.setOnClickListener(new OnClickListener() {
			
			//@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				rText.startAnimation(a);
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
