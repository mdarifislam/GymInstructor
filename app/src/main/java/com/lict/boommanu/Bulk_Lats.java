package com.lict.boommanu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lict.boommanu.bulk_lats_seatCable.DescriptionLatPullDownActivity;
import com.lict.boommanu.bulk_lats_seatCable.DescriptionOverMarbellActivity;
import com.lict.boommanu.bulk_lats_seatCable.DescriptionSeatCableRowActivity;

public class Bulk_Lats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulk__lats);
        Toast.makeText(Bulk_Lats.this, "Bulk_Lats Activity!", Toast.LENGTH_LONG).show();
    }

    public void seatCable(View view) {
        Intent intent = new Intent(Bulk_Lats.this, DescriptionSeatCableRowActivity.class);
        startActivity(intent);
    }

    public void latPullDown(View view) {
        Intent intent = new Intent(Bulk_Lats.this, DescriptionLatPullDownActivity.class);
        startActivity(intent);
    }

    public void overMarbell(View view) {
        Intent intent = new Intent(Bulk_Lats.this, DescriptionOverMarbellActivity.class);
        startActivity(intent);
    }
}
