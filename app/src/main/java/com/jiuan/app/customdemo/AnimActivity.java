package com.jiuan.app.customdemo;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ZhangKong on 2015/8/5.
 */
public class AnimActivity extends Activity {

    private TextView textView;

    private Button button;

    private Button touchbutton;

    private static final int index = 100;

    private int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anim_layout);
       /* ValueAnimator anim = ValueAnimator.ofFloat(0f,1f);
        anim.setDuration(500);
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float valueAnimator = (float) animation.getAnimatedValue();
                Log.d("TAG", "The value is:" + valueAnimator);
            }
        });
        anim.start();*/
        textView = (TextView) findViewById(R.id.hello);
        button = (Button)findViewById(R.id.play);
        touchbutton = (Button)findViewById(R.id.touchme);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /*  ObjectAnimator animator = ObjectAnimator.ofFloat(textView, "rotation", 0f,360f);
                animator.setDuration(5000);
                animator.start();*/
               /* float currentX = textView.getTranslationX();
                ObjectAnimator animator = ObjectAnimator.ofFloat(textView,"translationX",currentX,-500f,1000f,currentX);
                animator.setDuration(5000);
                animator.start();*/


                 /*   float currentY  = touchbutton.getTranslationY();
                    ObjectAnimator animator = ObjectAnimator.ofFloat(touchbutton,"translationY",currentY,currentY - 130f,currentY);

                    animator.setDuration(1000);
                    animator.start();*/

                Animator animator = AnimatorInflater.loadAnimator(AnimActivity.this,R.animator.customanim);
                animator.setTarget(textView);
                animator.start();




            }
        });


    }
}
