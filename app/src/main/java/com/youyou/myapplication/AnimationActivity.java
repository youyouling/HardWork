package com.youyou.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 程序入口
 *
 * @author yuemeiling
 * @date
 */

public class AnimationActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.custom)
    TextView custom;

    @Bind(R.id.button_scale)
    Button buttonScale;

    @Bind(R.id.button_alpha)
    Button buttonAlpha;

    @Bind(R.id.button_rotate)
    Button buttonRotate;

    @Bind(R.id.button_trans)
    Button buttonTrans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim);
        ButterKnife.bind(this);
        buttonScale.setOnClickListener(this);
        buttonAlpha.setOnClickListener(this);
        buttonRotate.setOnClickListener(this);
        buttonTrans.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Animation anim = null;
        switch (view.getId()) {
            case R.id.button_scale:
                anim = AnimationUtils.loadAnimation(AnimationActivity.this, R.anim.scaleanim);
                break;
            case R.id.button_rotate:
                anim = AnimationUtils.loadAnimation(AnimationActivity.this, R.anim.rotateanim);
                break;
            case R.id.button_trans:
                anim = AnimationUtils.loadAnimation(AnimationActivity.this, R.anim.translateanim);
                break;
            case R.id.button_alpha:
                anim = AnimationUtils.loadAnimation(AnimationActivity.this, R.anim.alphaanim);
                break;
            default:
                break;
        }
        custom.startAnimation(anim);
    }
}
