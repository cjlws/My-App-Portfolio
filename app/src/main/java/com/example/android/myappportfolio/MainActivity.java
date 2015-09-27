package com.example.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

        return super.onOptionsItemSelected(item);
    }

    public void appButtonClick(View view){
        String text = null;
        int duration = Toast.LENGTH_SHORT;

        switch (view.getId()){
            case R.id.button:
                text = getString(R.string.spotify_streamer);
                break;
            case R.id.button2:
                text = getString(R.string.scores_app);
                break;
            case R.id.button3:
                text = getString(R.string.library_app);
                break;
            case R.id.button4:
                text = getString(R.string.build_it_bigger);
                break;
            case R.id.button5:
                text = getString(R.string.xyz_reader);
                break;
            case R.id.button6:
                text = getString(R.string.capstone);
                break;
        }

        String textToToast = getString(R.string.toast_pre) + " " + text + " " + getString(R.string.toast_post);
        Toast.makeText(context, textToToast, duration).show();
    }
}
