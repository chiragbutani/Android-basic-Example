package com.example.chira_000.myapplication;

/**
 * Created by chira_000 on 9/17/2015.
 */

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        Bundle b = getIntent().getExtras();
        TextView name = (TextView) findViewById(R.id.nameValue);
        TextView age = (TextView) findViewById(R.id.ageValue);
        TextView gender = (TextView) findViewById(R.id.genderValue);

        name.setText(b.getCharSequence("name"));
        age.setText(b.getCharSequence("age"));
        gender.setText(b.getCharSequence("gender"));
    }
}