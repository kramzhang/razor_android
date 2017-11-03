
package com.wbtech.test_sample;


import com.wbtech.ums.UmsAgent;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button = (Button)findViewById(R.id.button_back);
        button.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
            	 Intent intent = new Intent(SecondActivity.this,LIstActivity.class);
                 startActivity(intent);
                 finish();
            }
        });
        
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        String  name = this.getComponentName()
				.getShortClassName();
        System.out.println(name);
        UmsAgent.onResume(this);
    }
    
    

    @Override
    protected void onPause() {
       
        super.onPause();
        UmsAgent.onPause(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.second, menu);
        return true;
    }

}
