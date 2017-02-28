package com.example.multithreading;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {
	private ProgressBar bar;

	/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bar = (ProgressBar) findViewById(R.id.progressBar1);

	}

	public void startProgress(View view) {

		bar.setProgress(0);
		new Thread(new Task()).start();
	}

	class Task implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i <= 10; i++) {
				final int value = i;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				bar.setProgress(value);

			}
		}

	}

}