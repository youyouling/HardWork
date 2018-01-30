package com.youyou.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

import adapter.MyAdapter;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by yuemeiling on 2017/11/23.
 */

public class RadioGroupActivity extends Activity {


    @Bind(R.id.btn1)
    RadioButton btn1;

    @Bind(R.id.btn2)
    RadioButton btn2;

    @Bind(R.id.radioGroup)
    RadioGroup radioGroup;

    @Bind(R.id.vp_FindFragment_pager)
    ViewPager vpFindFragmentPager;

    private ArrayList<String> titleList = new ArrayList<String>() {{
        add("google drive");
        add("google+");
//        add("google play");
    }};
    private ArrayList<View> viewList = new ArrayList<>();
    private MyAdapter adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ButterKnife.bind(this);
        View view1 = getLayoutInflater().inflate(R.layout.view1, null);
        View view2 = getLayoutInflater().inflate(R.layout.view2, null);
//        View view3 = getLayoutInflater().inflate(R.layout.view3, null);
        viewList.add(view1);
        viewList.add(view2);
//        viewList.add(view3);
        initView();
    }

    private void initView() {
        adapter = new MyAdapter(titleList, viewList);
        vpFindFragmentPager.setAdapter(adapter);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId){
                    case R.id.btn1:

                        break;
                    case R.id.btn2:

                        break;
                }
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
