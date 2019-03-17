package com.example.firstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Show a toast
     * @param view -- the view that is clicked
     */
    public void toastMe(View view) {
        // Toast myToast = Toast.makeText(this, message, duration);
        Toast myToast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT);
        myToast.show();
    }
}
