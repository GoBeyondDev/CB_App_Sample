package com.cbappsample.gobeyonddev.cb_app_sample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    public static String TAG = "CB_App_Sample";

    public static String base64EncodedPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuZrCewb8ap+My14EzsxLXVdvyjwvXX06dhEtPE3T4QCHY43IbqMYH+QecPe9LP9kYegpJwtDIwjgT38IyDCdFLqy9jkZcNH48ANVA/O3PK0bASAgPaOhbntetpNd8MCR6rPxj7KdqZf6GVgzTyGE9+V4qTf2E+DbnAiWbaNDL6tSzlyPjnuurfqbjSdKULj3oGZOUcnoGL+i9U2edX8gb25xvZMRWnU2aEPo0f1rcUNdSDbf3dX+HdCpsx2i4BvnB0W9NCLC3azcKUCJJ18vXKZM171CR0P/eDK0HHOevKomoBbl37jC3iSc4Qf8cLkRkajTgRy6rOaoYHii55FcDQIDAQAB";

    IabHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Log.d(TAG, "Creating IAB helper.");
        // compute your public key and store it in base64EncodedPublicKey
        mHelper = new IabHelper(this, base64EncodedPublicKey);

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
