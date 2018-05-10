package com.conways.store;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(myAdapter);
        TabLayout tabLayout=findViewById(R.id.tl);
        tabLayout.setupWithViewPager(viewPager,true);
        PgAdapter pgAdapter=new PgAdapter(getSupportFragmentManager());
        ViewPager viewPagerPic = findViewById(R.id.picvp);
        viewPagerPic.setAdapter(pgAdapter);

    }
}
