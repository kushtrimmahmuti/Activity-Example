package com.milot.example.activity.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

	Button btnHapAktivitetin;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHapAktivitetin = (Button) findViewById(R.id.btnHapAktivitetin);
        btnHapAktivitetin.setOnClickListener(this);
    }

    // https://github.com/milot/Activity-Example.git
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	
	public void onClick(View v) {
		if (v == btnHapAktivitetin) {
			Intent i = new Intent(MainActivity.this, AktivitetiDyte.class);
			i.putExtra("emri", "Hanife Shtiklla");
			startActivity(i);
		}
		
	}
}
