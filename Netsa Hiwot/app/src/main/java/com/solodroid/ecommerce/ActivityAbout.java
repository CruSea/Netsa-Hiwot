package com.solodroid.ecommerce;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActivityAbout extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_us);
		Button facebookButton=(Button) findViewById(R.id.button1);


		facebookButton.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View arg0)
			{
				Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com/netsahiwot"));
				startActivity(browserIntent);

				Intent tweet = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.twetter.com/netsahiwot"));
				startActivity(browserIntent);
				Intent google = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/netsahiwot"));
				startActivity(browserIntent);
			}
		});
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.header)));
		bar.setTitle("About Us");
		bar.setDisplayHomeAsUpEnabled(true);
		bar.setHomeButtonEnabled(true);
	}

		


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// app icon in action bar clicked; go home
			this.finish();
			overridePendingTransition(R.anim.open_main, R.anim.close_next);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		overridePendingTransition(R.anim.open_main, R.anim.close_next);
	}
}