
package com.example.mo.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void spotifyStreamer(View v) {
        tToast("This button will launch my Spotify app!");
    }

    public void scoresApp(View v) {
        tToast("This button will launch my Scores app!");
    }

    public void libraryApp(View v) {
        tToast("This button will launch my Library app!");
    }

    public void buildItBigger(View v) {
        tToast("This button will launch my Built It Bigger app!");
    }

    public void xyzReader(View v) {
        tToast("This button will launch my XYZ reader app!");
    }

    public void capstoneApp(View v) {
        tToast("This button will launch my Capstone app!");
    }

    private void tToast(String s) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, s, duration);
        toast.show();
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

        return super.onOptionsItemSelected(item);
    }

}
