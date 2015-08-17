package com.lgm.dynamicview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private DynamicView dynamicView;
    private Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getActionBar() != null){
            getActionBar().hide();
        }
        dynamicView = (DynamicView)findViewById(R.id.dynamicView);
        List<Integer> list = new ArrayList<>();
        list.add(R.drawable.bomb5);
        list.add(R.drawable.bomb6);
        list.add(R.drawable.bomb7);
        list.add(R.drawable.bomb8);
        list.add(R.drawable.bomb9);
        list.add(R.drawable.bomb10);
        list.add(R.drawable.bomb11);
        list.add(R.drawable.bomb12);
        list.add(R.drawable.bomb13);
        list.add(R.drawable.bomb14);
        list.add(R.drawable.bomb15);
        list.add(R.drawable.bomb16);
        dynamicView.setList(list);
        start = (Button)findViewById(R.id.start);
        stop = (Button)findViewById(R.id.stop);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dynamicView.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dynamicView.stop();
            }
        });
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
}
