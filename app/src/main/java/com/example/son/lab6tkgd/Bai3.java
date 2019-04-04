package com.example.son.lab6tkgd;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Bai3 extends AppCompatActivity {
    TabLayout tabLayout3;
    ViewPager viewPager3;
    MyPagerAdapter3 adapter3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        tabLayout3=findViewById(R.id.tab3);
        viewPager3=findViewById(R.id.viewpager3);

        adapter3=new MyPagerAdapter3(getSupportFragmentManager());
        viewPager3.setAdapter(adapter3);
        tabLayout3.setupWithViewPager(viewPager3);


    }
}
