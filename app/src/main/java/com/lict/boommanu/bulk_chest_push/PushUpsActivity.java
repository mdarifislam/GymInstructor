package com.lict.boommanu.bulk_chest_push;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lict.boommanu.R;

public class PushUpsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push_ups);
    }

    public void pushUps(View view) {
        Intent intent = new Intent(PushUpsActivity.this, DescriptionPushUpsActivity.class);
        startActivity(intent);
    }

    public void pullUps(View view) {
        Intent intent = new Intent(PushUpsActivity.this, DescriptionPullUpsActivity.class);
        startActivity(intent);
    }

    public void chestDips(View view) {
        Intent intent = new Intent(PushUpsActivity.this, DescriptionChestDipsActivity.class);
        startActivity(intent);
    }

    public void declinePress(View view) {
        Intent intent = new Intent(PushUpsActivity.this, DescriptionDeclinePressActivity.class);
        startActivity(intent);
    }
}
