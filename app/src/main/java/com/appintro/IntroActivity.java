package com.appintro;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.view.View;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import agency.tango.materialintroscreen.SlideFragmentBuilder;
import agency.tango.materialintroscreen.animations.IViewTranslation;

public class IntroActivity extends MaterialIntroActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        enableLastSlideAlphaExitTransition(true);

        getBackButtonTranslationWrapper()
                .setEnterTranslation(new IViewTranslation() {
                    @Override
                    public void translate(View view, @FloatRange(from = 0, to = 1.0) float percentage) {
                        view.setAlpha(percentage);
                    }
                });

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.first_slide_background)
                .buttonsColor(R.color.first_slide_buttons)
                .image(R.drawable.img_office)
                .title("Organize your time with us")
                .description("Would you try?")
                .build());


        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.second_slide_background)
                .buttonsColor(R.color.second_slide_buttons)
                .image(R.drawable.ic_previous)
                .title("Want more?")
                .description("Go on")
                .build());


        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.third_slide_background)
                .buttonsColor(R.color.third_slide_buttons)
                .possiblePermissions(new String[]{Manifest.permission.CALL_PHONE, Manifest.permission.READ_SMS})
                .neededPermissions(new String[]{Manifest.permission.CAMERA, Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION})
                .image(R.drawable.img_equipment)
                .title("Let's play ")
                .description("Start")
                .build());

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.fourth_slide_background)
                .buttonsColor(R.color.fourth_slide_buttons)
                .image(R.drawable.im5)
                .title("That's it")
                .description("Would you join us?")
                .build());
    }


    @Override
    public void onFinish() {
        super.onFinish();
        Intent intent = new Intent(IntroActivity.this, MainActivity.class);
        startActivity(intent);
    }
}