package com.solodroid.ecommerce;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class ActivityHome extends Fragment {
    GridView gv;
    View view;
    Context context;
    //DisplayMetrics metrics = null;
    //int densityDpi;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.gridview_fragment_higher_resolu, container, false);
        gv = (GridView) view.findViewById(R.id.gv);
        gv.setAdapter(new HomeGridViewAdapter(getActivity()));
        return view;
    }

    private void init() {
        Log.d("Hi sammie!", "init method has started");
        //metrics = context.getResources().getDisplayMetrics();
        Log.d("Hi sammie!", "init method has finished");
    }


}