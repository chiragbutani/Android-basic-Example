package com.example.panelexample;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

public class mypanel extends View{
	private Bitmap mBitmap;
	
	public mypanel(Context context)
	{
		super(context);
		mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
	}
	@Override
	public void onDraw(Canvas canvas)
	{
		canvas.drawColor(Color.BLACK);
		canvas.drawBitmap(mBitmap, 10, 10, null);
	}
	
}
