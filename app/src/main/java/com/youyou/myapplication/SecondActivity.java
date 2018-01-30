package com.youyou.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

import adapter.MyAdapter;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by yuemeiling on 2017/11/23.
 */

public class SecondActivity extends Activity {

    @Bind(R.id.tab_FindFragment_title)
    TabLayout mTabFindFragmentTitle;

    @Bind(R.id.vp_FindFragment_pager)
    ViewPager mViewPager;

//    @Bind(R.id.tab1)
//    TabItem tab1;
//
//    @Bind(R.id.tab2)
//    TabItem tab2;

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
        setContentView(R.layout.activity_second);
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
        TabLayout.Tab tab1= mTabFindFragmentTitle.newTab();
//        tab1.getCustomView().setBackgroundResource(R.drawable.tab_left_background);
        mTabFindFragmentTitle.addTab(tab1.setText(titleList.get(0)));
        TabLayout.Tab tab2= mTabFindFragmentTitle.newTab();
        tab2.getCustomView().setBackgroundResource(R.drawable.tab_right_background);
        mTabFindFragmentTitle.addTab(tab2.setText(titleList.get(1)));
//        mTabFindFragmentTitle.addTab(mTabFindFragmentTitle.newTab().setText(titleList.get(2)));
        adapter = new MyAdapter(titleList, viewList);

        mTabFindFragmentTitle.setTabsFromPagerAdapter(adapter);
        mViewPager.setAdapter(adapter);
        mTabFindFragmentTitle.setupWithViewPager(mViewPager);
        mTabFindFragmentTitle.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.d("yml",tab.getPosition()+"");
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
