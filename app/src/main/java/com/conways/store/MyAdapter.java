package com.conways.store;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return MyFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return getTitle(position%3);
    }

    private String getTitle(int position){
        String title="";

        switch (position) {
            case 0:
                title="菜品推荐";
                break;
            case 1:
                title="菜品列表";
                break;
            case 2:
                title="评论";
                break;

            default:
                break;


        }
        return title;
    }
}
