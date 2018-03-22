package com.pum2018.pillreminder_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.RadioGroup;
import android.support.v4.app.NavUtils;

public class AddMedicine extends AppCompatActivity {

    RadioGroup rg1, rg2;
    int chkId1 = 0, chkId2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medicine);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        rg1 = (RadioGroup) findViewById(R.id.radio_group_left);
        rg2 = (RadioGroup) findViewById(R.id.radio_group_right);
        rg1.clearCheck(); // this is so we can start fresh, with no selection on both RadioGroups
        rg2.clearCheck();
        rg1.setOnCheckedChangeListener(listener1);
        rg2.setOnCheckedChangeListener(listener2);
    }

    private RadioGroup.OnCheckedChangeListener listener1 = new RadioGroup.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (checkedId != 0) {
                rg2.setOnCheckedChangeListener(null); // remove the listener before clearing so we don't throw that stackoverflow exception(like Vladimir Volodin pointed out)
                chkId1 = rg1.getCheckedRadioButtonId();
                rg2.clearCheck(); // clear the second RadioGroup!
                rg2.setOnCheckedChangeListener(listener2); //reset the listener
                //Log.i("TEST", "rd1 : " + chkId1);
            }
        }
    };

    private RadioGroup.OnCheckedChangeListener listener2 = new RadioGroup.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (checkedId != 0) {
                rg1.setOnCheckedChangeListener(null);
                chkId2 = rg2.getCheckedRadioButtonId();
                rg1.clearCheck();
                rg1.setOnCheckedChangeListener(listener1);
                //Log.i("TEST", "rd1 : " + chkId2);
            }
        }
    };

    public void addMedicineToStore(View view){
        int realCheck = chkId1 == 0 ? chkId2 : chkId1;
        Log.i("You pressed", ": " + realCheck);
        chkId1 = 0;
        chkId2 = 0;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            // Respond to a click on the "Up" arrow button in the app bar
            case android.R.id.home:
                // Navigate back to parent activity (CatalogActivity)
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
