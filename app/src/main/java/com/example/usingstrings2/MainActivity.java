package com.example.usingstrings2;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
   TextView txtView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i( "Lifecycle", "onStart() invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i( "Lifecycle", "onRestart() invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i( "Lifecycle", "onResume() invoked");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i( "Lifecycle", "onPause() invoked");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i( "Lifecycle", "onStop() invoked");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i( "Lifecycle", "onDestroy() invoked");

    }
}
