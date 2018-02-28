package com.bootcamp.mumbaitourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.description);

        //Restaurants as well as Events Description
        String restaurantString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                restaurantString= null;
            } else {
                restaurantString= extras.getString("restaurant");
            }
        } else {
            restaurantString= (String) savedInstanceState.getSerializable("restaurant");
        }

        String restaurantdescString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                restaurantdescString= null;
            } else {
                restaurantdescString= extras.getString("restaurant_desc");
            }
        } else {
            restaurantdescString= (String) savedInstanceState.getSerializable("restaurant_desc");
        }

        int restaurantimageID;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                restaurantimageID= 0;
            } else {
                restaurantimageID= extras.getInt("restaurant_image");
            }
        } else {
            restaurantimageID= (int) savedInstanceState.getSerializable("restaurant_image");
        }

        ImageView restaurantimageView =(ImageView) findViewById(R.id.description_image);
        restaurantimageView.setImageResource(restaurantimageID);

        TextView restaurantNameView = (TextView) findViewById(R.id.description_name);
        restaurantNameView.setText(restaurantString);

        TextView restaurantDescView = (TextView) findViewById(R.id.description);
        restaurantDescView.setText(restaurantdescString);

    }
}
