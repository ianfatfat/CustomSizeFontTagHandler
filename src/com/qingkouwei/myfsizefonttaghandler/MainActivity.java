package com.qingkouwei.myfsizefonttaghandler;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.qingkouwei.myfsizefonttaghandler.R;

public class MainActivity extends Activity {

	private ImageView iv1;
	private ImageView iv2;
	String str1="font效果：<br><font color='#00ff00' size='60'>导演：轻口味</font><br><font color='#ff0000' size='80>副导演:重口味</font>";
	String str2="myfont效果：<br><myfont color='#00ff00' size='60'>导演：轻口味</myfont><br><myfont color='#ff0000' size='80'>副导演:重口味</myfont>";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		iv1 = (ImageView) findViewById(R.id.iv1);
		iv2 = (ImageView) findViewById(R.id.iv2);
		iv1.setImageBitmap(FontUtil.getImage(this, 600,400, Color.parseColor("#000000"), Color.parseColor("#ffffff"), 20, str1));
		iv2.setImageBitmap(FontUtil.getImage(this, 600, 400, Color.parseColor("#000000"), Color.parseColor("#ffffff"), 20, str2));
	}
}
