package lv.bizapps.androidpopupmenuexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.PopupMenu.OnMenuItemClickListener;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final Activity activity = this;

		final Button b = (Button)findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.e("AAA", "BBBB");

				PopupMenu pm = new PopupMenu(activity, b);
				pm.getMenuInflater().inflate(R.menu.main_button_popup, pm.getMenu());
				pm.setOnMenuItemClickListener(new OnMenuItemClickListener() {
					public boolean onMenuItemClick(MenuItem mi) {
						Log.e("AAA", "CCCCCCCCCC");

						switch (mi.getItemId()) {
							case R.id.action_1:	Log.e("AAA", "DDDD");
												break;
	
							default:
												break;
						}

						return true;
					}
				});
				pm.show();
			}
		});
	}
}
