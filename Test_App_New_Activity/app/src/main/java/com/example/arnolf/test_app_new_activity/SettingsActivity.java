package com.example.arnolf.test_app_new_activity;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class SettingsActivity extends ActionBarActivity {

    int tvCounter = 1, slCounter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button btn_txt = (Button) findViewById(R.id.btn_TC);
        Button btn_bg = (Button) findViewById(R.id.btn_BC);

        final LinearLayout settingsLayout = (LinearLayout) findViewById(R.id.settings_layout);

        final TextView settingsText = (TextView) findViewById(R.id.textViewSettings);

        btn_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tvCounter < 2) {
                    settingsText.setTextColor(Color.rgb(22, 22, 22));
                }

                if (tvCounter < 5) {
                    settingsText.setTextColor(Color.RED);
                }

                else if (tvCounter > 5) {
                    settingsText.setTextColor(Color.rgb(66, 66, 66));
                }

                tvCounter++;
            }
        });

        btn_bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (slCounter < 2) {
                    settingsLayout.setBackgroundColor(Color.rgb(99, 99, 99));
                }

                if (slCounter < 5) {
                    settingsLayout.setBackgroundColor(Color.rgb(44, 44, 44));
                }

                else if (slCounter > 5) {
                    settingsLayout.setBackgroundColor(Color.rgb(11, 11, 11));
                }

                slCounter++;
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_settings, menu);
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
}
