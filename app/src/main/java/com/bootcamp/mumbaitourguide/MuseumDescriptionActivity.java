package com.bootcamp.mumbaitourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MuseumDescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.description);

        //Museum Description
        String museumString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                museumString = null;
            } else {
                museumString = extras.getString("museum");
            }
        } else {
            museumString = (String) savedInstanceState.getSerializable("museum");
        }

        String museumdescString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                museumdescString = null;
            } else {
                museumdescString = extras.getString("museum_desc");
            }
        } else {
            museumdescString = (String) savedInstanceState.getSerializable("museum_desc");
        }

        int museumimageID;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                museumimageID = 0;
            } else {
                museumimageID = extras.getInt("museum_image");
            }
        } else {
            museumimageID = (int) savedInstanceState.getSerializable("museum_image");
        }

        ImageView museumimageView = (ImageView) findViewById(R.id.description_image);
        museumimageView.setImageResource(museumimageID);

        TextView museumNameView = (TextView) findViewById(R.id.description_name);
        museumNameView.setText(museumString);

        TextView museumDescView = (TextView) findViewById(R.id.description);
        museumDescView.setText(museumdescString);
    }
}
