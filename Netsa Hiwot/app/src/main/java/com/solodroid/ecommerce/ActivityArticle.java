package com.solodroid.ecommerce;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityArticle extends Activity {
    TextView text;
    ImageView iv;
    Bundle bundle;
    String img_loc, txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_article);
        bundle = getIntent().getExtras();
        text = (TextView) findViewById(R.id.AmansText);
        iv = (ImageView) findViewById(R.id.AmansImage);
        txt = bundle.getString("Txt");
        img_loc = bundle.getString("Resource");
        int id = getResources().getIdentifier(txt, "string", getPackageName());
        text.setText(id);
        int id2 = getResources().getIdentifier(img_loc, "drawable", getPackageName());
        iv.setImageResource(id2);
    }
}