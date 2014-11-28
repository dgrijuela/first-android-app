package com.danielgrijuela.myfirstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MyFirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first);
    }


    public void myFirstMethod(View v){

        View myTextView = findViewById(R.id.myFirstTextView);

        myTextView.setVisibility(View.VISIBLE);
    }
}
