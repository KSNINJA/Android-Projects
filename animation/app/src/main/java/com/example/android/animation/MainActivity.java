package com.example.android.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private ImageView logo;
    private ImageView text;
    private ImageView topbar;
    private ImageView logo2;
    private RelativeLayout parent;
    private TextView subtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = (ImageView) findViewById(R.id.imageView4);
        text = (ImageView) findViewById(R.id.imageView5);
        topbar = (ImageView) findViewById(R.id.topbar);
        parent=(RelativeLayout) findViewById(R.id.parent);
        subtext=(TextView) findViewById(R.id.subtext);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        logo.startAnimation(myanim);
        text.startAnimation(myanim);
        topbar.startAnimation(myanim);
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        subtext.startAnimation(myanim);
        Animation anim=AnimationUtils.loadAnimation(this, R.anim.translate);
        logo.startAnimation(anim);
        text.startAnimation(anim);
        ColorDrawable[] color = {new ColorDrawable(Color.DKGRAY), new ColorDrawable(Color.BLACK)};
        TransitionDrawable trans = new TransitionDrawable(color);
        parent.setBackground(trans);
        trans.startTransition(2000);



    }
}
