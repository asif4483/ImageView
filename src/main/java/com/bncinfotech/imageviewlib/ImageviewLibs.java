package com.bncinfotech.imageviewlib;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ImageviewLibs extends LinearLayout {

    ImageView imageBack;

    ViewPager mViewPager;

    TextView textViewTotalcount;

    private int currentPosition;

    int a=1;
    int b=1;

    public ImageviewLibs(final Context context, final String[] mResources) {
        super(context);

        initialize(context);



        mViewPager = findViewById(R.id.pager);
        textViewTotalcount = findViewById(R.id.totalcountimg);






        /*final String[] mResources = {
                "https://www.hellomagazine.com/imagenes/celebrities/2018031046891/emma-watson-spotted-with-boyfriend-chord-overstreet/0-234-768/emma-watson-t.jpg",
                "https://static.independent.co.uk/s3fs-public/thumbnails/image/2016/10/17/11/harry-potter-hermione.jpg",
                "https://i.pinimg.com/originals/cb/5a/56/cb5a5655834dd84f7c003c76c606b6f3.jpg",
                "http://images5.fanpop.com/image/photos/31900000/New-promotional-pictures-of-Emma-Watson-for-Harry-Potter-and-the-Deathly-Hallows-part-1-hermione-granger-31934042-1920-2560.jpg",
                "http://img1.wikia.nocookie.net/__cb20090317030609/harrypotter/images/e/e1/HermioneHBPHi-resPromo3.jpg",
                "https://i2-prod.dailyrecord.co.uk/incoming/article923117.ece/ALTERNATES/s615/harry-potter-premiere-image-3-719860509.jpg",
                "https://all4desktop.com/data_images/original/4227614-emma-watsons-new-hp6-normal.jpg"
        };
*/

        textViewTotalcount.setText("1 of "+mResources.length);


        Myphotoalbumsviewpager myphotoalbumsviewpager = new Myphotoalbumsviewpager(getContext(),mResources);

        mViewPager.setAdapter(myphotoalbumsviewpager);



        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {



                if(currentPosition < i) {
                    // handle swipe LEFT
                    a = a+b;
                    textViewTotalcount.setText(String.valueOf(a)+" of "+mResources.length);

                    // Toast.makeText(Profilesimagesvies.this, "left", Toast.LENGTH_SHORT).show();
                } else if(currentPosition > i){
                    // handle swipe RIGHT
                    a = a-b;

                    textViewTotalcount.setText(String.valueOf(a)+" of "+mResources.length);

                    // Toast.makeText(Profilesimagesvies.this, "Right", Toast.LENGTH_SHORT).show();
                }
                currentPosition = i;


            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });






    }

    public ImageviewLibs(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }

    public ImageviewLibs(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ImageviewLibs(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialize(context);

    }


    private void initialize(Context context)
    {
        inflate(context, R.layout.imageviewlib, this);

    }
}
