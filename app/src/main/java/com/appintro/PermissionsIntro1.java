package com.appintro;

import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;

public class PermissionsIntro1 extends AppIntro {
    @Override
    public void init(Bundle savedInstanceState) {
        /** Add xml of introduction Screen **/
        addSlide(SampleSlide.newInstance(R.layout.slide1));
        addSlide(SampleSlide.newInstance(R.layout.slide2));
        addSlide(SampleSlide.newInstance(R.layout.slide3));
        addSlide(SampleSlide.newInstance(R.layout.slide4));


//        /** Add Custom color and icon in AppIntroduction **/
//        setBarColor(Color.parseColor("#FFFFFF"));
//        setIndicatorColor(getResources().getColor(R.color.fourth_slide_background), Color.parseColor("#81a8c3"));
        setSeparatorColor(getResources().getColor(R.color.white));
//        setColorDoneText(getResources().getColor(R.color.app_color));
//        setColorSkipButton(getResources().getColor(R.color.app_color));
//        setImageNextButton(getResources().getDrawable(R.drawable.next_arrow));
    }


    @Override
    public void onNextPressed() {
    }

    @Override
    public void onSkipPressed() {
        finish();
    }

    @Override
    public void onDonePressed() {
        finish();
    }

    @Override
    public void onSlideChanged() {
    }

}
