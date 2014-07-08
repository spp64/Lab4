package com.example.labwork;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        Button create = (Button)findViewById(R.id.button1);
        create.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Uri uriUrl = Uri.parse("http://134.193.136.147:8080/HbaseWS/jaxrs/generic/hbaseCreate/Table5266/Date:accelerometer:Humidity:Gyro"); 
				Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);  
				startActivity(launchBrowser);
			
			}
		});
        
        
        Button insert = (Button)findViewById(R.id.button2);
        create.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Uri uriUrl = Uri.parse("http://134.193.136.147:8080/HbaseWS/jaxrs/generic/hbaseInsert/Test5266/-home-group9-sensortag.txt/Date:accelerometer:Humidity:Gyro"); 
				Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);  
				startActivity(launchBrowser);
			
			}
		});
        
       
        Button retrieve = (Button)findViewById(R.id.button3);
        create.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Uri uriUrl = Uri.parse("http://134.193.136.147:8080/HbaseWS/jaxrs/generic/hbaseRetrieveAll/Test5266"); 
				Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);  
				startActivity(launchBrowser);
			
			}
		});
        
        Button delete = (Button)findViewById(R.id.button4);
        create.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Uri uriUrl = Uri.parse("http://134.193.136.147:8080/HbaseWS/jaxrs/generic/hbasedeletel/Test5266"); 
				Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);  
				startActivity(launchBrowser);
			
			}
		});
       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */


}
