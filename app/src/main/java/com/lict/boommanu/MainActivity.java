package com.lict.boommanu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.TextOutsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BoomMenuButton bmb;
    ArrayList<Integer> imageIDList;
    ArrayList<String> titleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bmb = findViewById(R.id.boom);
        imageIDList = new ArrayList<>();
        titleList = new ArrayList<>();
        setInitialData();
        bmb.setButtonEnum(ButtonEnum.TextOutsideCircle);
        bmb.setPiecePlaceEnum(PiecePlaceEnum.DOT_5_1);
        bmb.setButtonPlaceEnum(ButtonPlaceEnum.SC_5_1);


        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {

            TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                    .normalImageRes(imageIDList.get(i))
                    .normalText(titleList.get(i))
                    //.subNormalText("Click to watch some magic!")
                    .listener(new OnBMClickListener() {
                        @Override
                        public void onBoomButtonClick(int index) {
                            if (index == 0) {
                                Intent intent = new Intent(MainActivity.this, Bulk_Chest.class);
                                startActivity(intent);
                            } else if (index == 1) {
                                Intent intent = new Intent(MainActivity.this, Bulk_Shoulder.class);
                                startActivity(intent);
                            }
                        }
                    });
            bmb.addBuilder(builder);
        }
//        bmb.setButtonEnum(ButtonEnum.Ham);
//        bmb.setPiecePlaceEnum(PiecePlaceEnum.DOT_4_1);
//        bmb.setButtonPlaceEnum(ButtonPlaceEnum.HAM_4);
//
//
//        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
//
//            HamButton.Builder builder = new HamButton.Builder()
//                    .normalImageRes(imageIDList.get(i))
//                    .normalText(titleList.get(i))
//                    .subNormalText("Click to watch some magic!")
//                    .listener(new OnBMClickListener() {
//                        @Override
//                        public void onBoomButtonClick(int index) {
//                            if (index == 0) {
//                                Intent intent = new Intent(MainActivity.this, Bulk_Chest.class);
//                                startActivity(intent);
//                            } else if (index == 1) {
//                                Intent intent = new Intent(MainActivity.this, Bulk_Shoulder.class);
//                                startActivity(intent);
//                            }
//                        }
//                    });
//            bmb.addBuilder(builder);
//        }


    }

    private void setInitialData() {

        imageIDList.add(R.drawable.chest);
        imageIDList.add(R.drawable.user);
        imageIDList.add(R.drawable.settings);
        imageIDList.add(R.drawable.share);
        imageIDList.add(R.drawable.last);

        titleList.add("Bulk Body.");
        titleList.add("Lean Body.");
        titleList.add("Fitness");
        titleList.add("Six Pack ABS.");
        titleList.add("Food Diet");

    }

}
