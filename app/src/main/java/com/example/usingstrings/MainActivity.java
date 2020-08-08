package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtMsg2 = findViewById(R.id.textView2);
        txtMsg2.setText(R.string.Msg2);

        Log.i("Lifecycle", "OnCreate ........");

    }


    @Override
    public void onStart()
    {
        super.onStart();
        Log.i("Lifecycle", "OnStart .........");

    }

    @Override
    public void onRestart()
    {
        super.onRestart();
        Log.i("Lifecycle", "OnRestart .........");

    }

    @Override
    public void onResume()
    {
        super.onResume();
        Log.i("Lifecycle", "OnResume .........");

    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.i("Lifecycle", "OnPause .........");

    }

    @Override
    public void onStop()
    {
        super.onStop();
        Log.i("Lifecycle", "OnPause ........");

    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.i("Lifecycle", "OnDestroy ........");

    }

}