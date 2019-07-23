package com.example.ajit.slidingmenu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Pager extends FragmentStatePagerAdapter {

    int tabCount;

    public Pager(FragmentManager fm, int tabCount){
        super(fm);
        this.tabCount = tabCount;
    }
    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                tab1Code t1= new tab1Code();
                return t1;

            case 1:
                tab2Code t2 = new tab2Code();
                return t2;

            case 2:
                tab3Code t3 = new tab3Code();
                return t3;

            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
