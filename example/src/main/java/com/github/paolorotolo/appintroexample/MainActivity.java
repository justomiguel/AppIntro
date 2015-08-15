package com.github.paolorotolo.appintroexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;

import com.github.paolorotolo.appintroexample.animations.CustomAnimation;
import com.github.paolorotolo.appintroexample.animations.DepthAnimation;
import com.github.paolorotolo.appintroexample.animations.FadeAnimation;
import com.github.paolorotolo.appintroexample.animations.FlowAnimation;
import com.github.paolorotolo.appintroexample.animations.SlideOverAnimation;
import com.github.paolorotolo.appintroexample.animations.ZoomAnimation;
import com.github.paolorotolo.appintroexample.indicators.CustomIndicator;
import com.github.paolorotolo.appintroexample.indicators.ProgressIndicator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startDefaultIntro(View v){
        Intent intent = new Intent(this, DefaultIntro.class);
        startActivity(intent);
    }

    public void startCustomIntro(View v){
        Intent intent = new Intent(this, CustomIntro.class);
        startActivity(intent);
    }

    public void startSecondLayoutIntro(View v){
        Intent intent = new Intent(this, SecondLayoutIntro.class);
        startActivity(intent);
    }

    public void startFadeAnimation(View v){
        Intent intent = new Intent(this, FadeAnimation.class);
        startActivity(intent);
    }

    public void startZoomAnimation(View v){
        Intent intent = new Intent(this, ZoomAnimation.class);
        startActivity(intent);
    }

    public void startFlowAnimation(View v){
        Intent intent = new Intent(this, FlowAnimation.class);
        startActivity(intent);
    }

    public void startDepthAnimation(View v){
        Intent intent = new Intent(this, DepthAnimation.class);
        startActivity(intent);
    }

    public void startSlideOverAnimation(View v){
        Intent intent = new Intent(this, SlideOverAnimation.class);
        startActivity(intent);
    }

    public void startCustomAnimation(View v){
        Intent intent = new Intent(this, CustomAnimation.class);
        startActivity(intent);
    }

    public void startProgressIndicator(View v){
        Intent intent = new Intent(this, ProgressIndicator.class);
        startActivity(intent);
    }

    public void startCustomIndicator(View v){
        Intent intent = new Intent(this, CustomIndicator.class);
        startActivity(intent);
    }
}