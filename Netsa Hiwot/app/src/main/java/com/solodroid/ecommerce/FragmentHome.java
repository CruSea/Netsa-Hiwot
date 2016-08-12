package com.solodroid.ecommerce;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.GridView;

public class FragmentHome extends Fragment {
    GridView gv;
    View view;
    /*Context context;
    WindowManager wm;
    Display display;
    Point size;
    int width, height;*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //init();
        /*width = size.x;
        height = size.y;*/
        view = inflater.inflate(R.layout.gridview_fragment_higher_resolu, container, false);
        gv = (GridView) view.findViewById(R.id.gv);
        gv.setAdapter(new gvAdapter(getActivity()));
        return view;
    }

    private void init() {
        Log.d("Hi sammie!", "init method has started");
        //wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        //display = wm.getDefaultDisplay();
        //size = new Point();
        Log.d("Hi sammie!", "init method has finished");
    }

}