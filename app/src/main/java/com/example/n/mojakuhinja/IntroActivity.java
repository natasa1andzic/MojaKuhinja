package com.example.n.mojakuhinja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class IntroActivity extends AppCompatActivity {

    private ImageView icon_chef;
    private TextView welcomeTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        icon_chef = (ImageView) findViewById(R.id.icon_chef);
        welcomeTxt = (TextView)findViewById(R.id.welcomeTx);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        icon_chef.startAnimation(animation);
        welcomeTxt.startAnimation(animation);

        Thread timer = new Thread()
        {
            @Override
            public void run() {

                try
                {
                    sleep(3000);
                    Intent splash = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(splash);
                    finish();

                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }


                super.run();
            }
        };
        timer.start();
    }
    }

