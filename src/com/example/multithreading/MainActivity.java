package com.example.multithreading;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView text;
	int n=50;
	char c='a';

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text=(Button) findViewById(R.id.text1);
		Handler hand=new Handler();
	}

	Runnable r1=new Runnable() {
		
		@Override
		public void run() {
			String txt=text.getText().toString();
			
		}
	};
	class Prime extends Thread
	{
		public void run()
		{
			try
			{
				for(int i=1;i<=10;i++)
				{
					if(i==2||i==3||i==5||i==7)
					{
						System.out.println ("Prime No.= "+i);
					}
					Thread.sleep(500);
				}
			}
			catch (Exception e){}
		}
	}
	}
