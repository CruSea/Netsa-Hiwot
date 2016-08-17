package com.solodroid.ecommerce;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Sammie on 8/17/2016.
 */

public class CRUDFragPagerAdapter extends FragmentPagerAdapter {

    private Context cntx;
    Fragment f;

    public CRUDFragPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        f = new CRUD_Frag();
        return f;
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "CRUD Fragment";
    }
}
