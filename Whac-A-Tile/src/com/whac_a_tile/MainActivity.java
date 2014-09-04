package com.whac_a_tile;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
{
	private Button game, instructions;
	

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		game = (Button)this.findViewById(R.id.main_button_start);
		instructions = (Button)this.findViewById(R.id.main_button_intructions);
		
		//Listeners
		game.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View arg0)
			{
				//Starts the Game when button is pressed.
				Intent i = new Intent(MainActivity.this, GameActivity.class);
				startActivity(i);
			}
		});
		
		instructions.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View arg0)
			{
				//Opens link to the instruction video
				startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.youtube.com/watch?v=0yqeIHXbJ1o")));
				Log.i("Video", "Video Playing....");
				
			}
			
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
