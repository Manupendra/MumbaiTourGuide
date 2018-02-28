package com.bootcamp.mumbaitourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MANU on 2/25/2018.
 * This activity shows the description of the architecture
 */

public class ArchitectureDescriptionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.description);

        //Architecture description
        String placeString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                placeString = null;
            } else {
                placeString = extras.getString("place");
            }
        } else {
            placeString = (String) savedInstanceState.getSerializable("place");
        }

        String placedescString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                placedescString = null;
            } else {
                placedescString = extras.getString("place_desc");
            }
        } else {
            placedescString = (String) savedInstanceState.getSerializable("place_desc");
        }

        int placeimageID;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                placeimageID = 0;
            } else {
                placeimageID = extras.getInt("place_image");
            }
        } else {
            placeimageID = (int) savedInstanceState.getSerializable("place_image");
        }

        ImageView imageView = (ImageView) findViewById(R.id.description_image);
        imageView.setImageResource(placeimageID);

        TextView PlaceNameView = (TextView) findViewById(R.id.description_name);
        PlaceNameView.setText(placeString);

        TextView DescView = (TextView) findViewById(R.id.description);
        DescView.setText(placedescString);
    }
}
