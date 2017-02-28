package com.kaivanshah.assignment51;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_HelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        tv_HelloWorld = (TextView)(this.findViewById(R.id.tv_HelloWorld));
        switch (item.getItemId())
        {
            case   R.id.item1:
                tv_HelloWorld.setTextColor(Color.RED);
                break;
            case R.id.item2:
                tv_HelloWorld.setTextColor(Color.GREEN);
                break;
            case R.id.item3:
                tv_HelloWorld.setTextColor(Color.BLUE);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;

    }
}
