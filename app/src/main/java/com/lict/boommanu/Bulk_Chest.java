package com.lict.boommanu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lict.boommanu.bulk_chest_push.PushUpsActivity;


public class Bulk_Chest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulk_chest);

        Toast.makeText(Bulk_Chest.this, "Bulk_Chest.java!", Toast.LENGTH_LONG).show();
    }

    public void saveChest(View view) {

        Intent intent = new Intent(Bulk_Chest.this, PushUpsActivity.class);
        startActivity(intent);
    }

    public void shoulder(View view) {
        Intent intent = new Intent(Bulk_Chest.this, Bulk_Shoulder.class);
        startActivity(intent);
    }

    public void lats(View view) {
        Intent intent = new Intent(Bulk_Chest.this,Bulk_Lats.class);
        startActivity(intent);
    }
}
