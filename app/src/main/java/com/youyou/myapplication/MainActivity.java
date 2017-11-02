package com.youyou.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import butterknife.Bind;
import butterknife.ButterKnife;
import view.CustomTitleView;

/**
 * 程序入口
 *
 * @author yuemeiling
 * @date
 */

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.custom)
    CustomTitleView custom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                custom.setmTitleText(randomText());
            }
        });

    }

    private String randomText() {
        Random random = new Random();
        Set<Integer> set = new HashSet<Integer>();
        while (set.size() < 4) {
            int randomInt = random.nextInt(10);
            set.add(randomInt);
        }
        StringBuffer sb = new StringBuffer();
        for (Integer i : set) {
            sb.append("" + i);
        }

        return sb.toString();
    }
}
