package com.youyou.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
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

    private ArrayList<String> titleList = new ArrayList<String>() {{
        add("google drive");
        add("google+");
        add("google play");
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
        View view3 = getLayoutInflater().inflate(R.layout.view3, null);
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        initView();
    }

    private void initView() {
        mTabFindFragmentTitle.addTab(mTabFindFragmentTitle.newTab().setText(titleList.get(0)));
        mTabFindFragmentTitle.addTab(mTabFindFragmentTitle.newTab().setText(titleList.get(1)));
        mTabFindFragmentTitle.addTab(mTabFindFragmentTitle.newTab().setText(titleList.get(2)));
        adapter = new MyAdapter(titleList, viewList);

        mTabFindFragmentTitle.setTabsFromPagerAdapter(adapter);
        mViewPager.setAdapter(adapter);
        mTabFindFragmentTitle.setupWithViewPager(mViewPager);
    }

}
