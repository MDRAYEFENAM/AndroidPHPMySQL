package com.mdrayefenam.androidphpmysql;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Build;
import android.view.WindowManager;
import android.widget.TextView;

import android.widget.ProgressBar;


public class SplashActivity extends AppCompatActivity {
    ProgressBar progressBar;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        progressBar = findViewById(R.id.progressb);
        textView = findViewById(R.id.textView);
        progressBar.setMax(100);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            progressBar.setScaleY(3f);
        }

        progressBarAnimation();
    }
    public void progressBarAnimation() {
        ProgressBarAnimation anim = new ProgressBarAnimation(this, progressBar, textView, 0f, 100f);
        anim.setDuration(2500);
        progressBar.setAnimation(anim);


    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
