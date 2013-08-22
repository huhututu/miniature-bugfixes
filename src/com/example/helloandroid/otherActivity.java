package com.example.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class otherActivity extends Activity {

	private Button secondButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);


        secondButton = (Button)findViewById(R.id.secondButtton);
        ButtonListener secondButtonListener = new ButtonListener();
        secondButton.setOnClickListener(secondButtonListener);
        
    }

class ButtonListener implements OnClickListener{

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent =new Intent();
		intent.setClass(otherActivity.this, MainActivity.class);
		startActivity(intent);
		
	}
	
}


    @Override
protected void onDestroy() {
	// TODO Auto-generated method stub
	super.onDestroy();
	System.out.println("otherActivity.onDestroy()");
}


@Override
protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
	System.out.println("otherActivity.onPause()");
}


@Override
protected void onRestart() {
	// TODO Auto-generated method stub
	super.onRestart();
	System.out.println("otherActivity.onRestart()");
}


@Override
protected void onResume() {
	// TODO Auto-generated method stub
	super.onResume();
	System.out.println("otherActivity.onResume()");
}


@Override
protected void onStart() {
	// TODO Auto-generated method stub
	super.onStart();
	System.out.println("otherActivity.onStart()");
}


@Override
protected void onStop() {
	// TODO Auto-generated method stub
	super.onStop();
	System.out.println("otherActivity.onStop()");
}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
