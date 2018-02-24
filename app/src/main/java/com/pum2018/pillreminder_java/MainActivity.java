package com.pum2018.pillreminder_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onStoreClick(View view){
        Toast.makeText(this,"You pressed Store",LENGTH_SHORT).show();
    }

    public void onSettingsClick(View view){
        Toast.makeText(this,"You pressed Settings", LENGTH_SHORT).show();
    }

    public void onReportClick(View view){
        Toast.makeText(this,"You pressed Report", LENGTH_SHORT).show();
    }

    public void onScheduleClick(View view){
        Toast.makeText(this,"You pressed Schedule", LENGTH_SHORT).show();
    }
}
