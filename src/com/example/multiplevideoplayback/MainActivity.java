package com.example.multiplevideoplayback;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.widget.VideoView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		VideoView vv1 =(VideoView)findViewById(R.id.videoView1);
		VideoView vv2 = (VideoView)findViewById(R.id.VideoView01);
		
		Uri pathToVideo = Uri.parse("android.resource://com.example.knog/" + R.raw.light);  
		vv1.setVideoURI(pathToVideo);  
		 
		// to start it          
		vv1.requestFocus();  
		vv1.start(); 
		
		vv2.setVideoURI(pathToVideo);  
		 
		// to start it          
		vv2.start(); 
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
