package edu.washington.mxl.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.EventLog;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String bundle = "";
        if (savedInstanceState != null) {
            bundle = savedInstanceState.toString();
        }
        Log.i("activity", "onCreate fired " + bundle);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        Log.i("activity", "onCreateOptionMenu fired");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        Log.i("activity", "onOptionsItemSelected fired");
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        Log.e("activity", "We're going down, Captain!");
    }

}
