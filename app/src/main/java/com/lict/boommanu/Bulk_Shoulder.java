package com.lict.boommanu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lict.boommanu.bulk_shoulder_Military.DescriptionDumbellPressActivity;
import com.lict.boommanu.bulk_shoulder_Military.DescriptionDumbellRaiseActivity;
import com.lict.boommanu.bulk_shoulder_Military.DescriptionMilitaryPressActivity;
import com.lict.boommanu.bulk_shoulder_Military.UpRightRowsActivity;

public class Bulk_Shoulder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulk_shoulder);

      //  Toast.makeText(Bulk_Shoulder.this, "Bulk_Sholder Activity!", Toast.LENGTH_LONG).show();
    }

    public void military(View view) {
        Intent intent = new Intent(Bulk_Shoulder.this, DescriptionMilitaryPressActivity.class);
        startActivity(intent);
    }

    public void dumbell(View view) {
        Intent intent = new Intent(Bulk_Shoulder.this, DescriptionDumbellPressActivity.class);
        startActivity(intent);
    }

    public void dumbellRaise(View view) {
        Intent intent = new Intent(Bulk_Shoulder.this, DescriptionDumbellRaiseActivity.class);
        startActivity(intent);
    }

    public void upRightRows(View view) {
        Intent intent = new Intent(Bulk_Shoulder.this, UpRightRowsActivity.class);
        startActivity(intent);
    }
}
