package com.example.chira_000.imageprocess;

import android.app.ActionBar;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Environment;
import android.provider.MediaStore;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

    ImageView buckysImageView;
    Drawable buckysFace;
    Drawable bb;
    Bitmap Bitmapimage;
    Bitmap bi;
    Button b1;
    TextView t;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buckysImageView=(ImageView) findViewById(R.id.buckysimageView);
        buckysFace=getResources().getDrawable(R.mipmap.hqdefault);
        bb=getResources().getDrawable(R.mipmap.invert);
        Bitmapimage=((BitmapDrawable) buckysFace).getBitmap();
        bi=((BitmapDrawable) bb).getBitmap();
        t=(TextView) findViewById(R.id.displaytext);

        final Bitmap newphoto=inverImage(Bitmapimage);

        final Bitmap b=inverImage(bi);
        buckysImageView.setImageBitmap(b);
        b1=(Button)findViewById(R.id.DisplayButton);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int c=0;
                buckysImageView.setImageBitmap(newphoto);
               t.setText("hi me"+ (c+1));
            }

        });


        /*Drawable[] layers=new Drawable[2];
        layers[0]=getResources().getDrawable(R.mipmap.hqdefault);
        layers[1]=getResources().getDrawable(R.mipmap.dd);

        LayerDrawable layerDrawable=new LayerDrawable(layers);
        buckysImageView.setImageDrawable(layerDrawable);*/

                MediaStore.Images.Media.insertImage(getContentResolver(), newphoto, "title", "description");
    }


    public static Bitmap inverImage(Bitmap orignal)
    {
        Bitmap finalImage=Bitmap.createBitmap(orignal.getWidth(), orignal.getHeight(),orignal.getConfig());

        int A, R,G,B;
        int pixelcolor;
        int height=orignal.getHeight();
        int width=orignal.getWidth();

        for (int y=0; y<height; y++)
        {
            for (int x=0; x<width; x++)
            {
                pixelcolor=orignal.getPixel(x,y);
                A=Color.alpha(pixelcolor);
                R=255-Color.red(pixelcolor);
                G=255-Color.green(pixelcolor);
                B=255-Color.blue(pixelcolor);
                finalImage.setPixel(x, y, Color.argb(A,R,G,B));

            }
        }
        return finalImage;
    }

}
