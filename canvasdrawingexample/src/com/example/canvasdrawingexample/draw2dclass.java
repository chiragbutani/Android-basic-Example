package com.example.canvasdrawingexample;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class draw2dclass extends View{
	public draw2dclass(Context context){
		super(context);
		}
	@Override
	protected void onDraw(Canvas c)
	{
		super.onDraw(c);
		Paint paint = new Paint();
		paint.setStyle(Paint.Style.FILL);
		//make the entire canvas white
		paint.setColor(Color.WHITE);
		c.drawPaint(paint);
		
		paint.setAntiAlias(true);
		paint.setColor(Color.BLUE);
		c.drawCircle(80, 20, 15, paint);
		paint.setColor(Color.GREEN);
		c.drawRect(20,5,50,100, paint);
		paint.setColor(Color.RED);
		paint.setStyle(Paint.Style.FILL);
		
		paint.setAntiAlias(true);
		paint.setTextSize(30);
		c.drawText("Me Like painting!", 30, 200, paint);
		int x=75;
		int y=140;
		
		paint.setColor(Color.GRAY);
		paint.setTextSize(25);
		String str2rotate="Rotate Text";
		
		Rect rct = new Rect();
		c.rotate(-45, x+rct.exactCenterX(),y+rct.exactCenterY());
		
		paint.setStyle(Paint.Style.FILL);
		c.drawText(str2rotate, x, y, paint);
		
		c.restore();
		
		Resources res = this.getResources();
		Bitmap bitmp = BitmapFactory.decodeResource(res, R.drawable.ic_delete);
		c.drawBitmap(bitmp, 90,200, paint);
		
		
		
	}
	
	
	
}
