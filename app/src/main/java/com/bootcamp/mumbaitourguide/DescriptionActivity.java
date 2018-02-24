package com.bootcamp.mumbaitourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.description);

        //Museum Description
        String museumString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                museumString= null;
            } else {
                museumString= extras.getString("museum");
            }
        } else {
            museumString= (String) savedInstanceState.getSerializable("museum");
        }

        String museumdescString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                museumdescString= null;
            } else {
                museumdescString= extras.getString("museum_desc");
            }
        } else {
            museumdescString= (String) savedInstanceState.getSerializable("museum_desc");
        }

        int museumimageID;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                museumimageID= 0;
            } else {
                museumimageID= extras.getInt("museum_image");
            }
        } else {
            museumimageID= (int) savedInstanceState.getSerializable("museum_image");
        }

        ImageView museumimageView =(ImageView) findViewById(R.id.description_image);
        museumimageView.setImageResource(museumimageID);

        TextView museumNameView = (TextView) findViewById(R.id.description_name);
        museumNameView.setText(museumString);

        TextView museumDescView = (TextView) findViewById(R.id.description);
        museumDescView.setText(museumdescString);

        //Restaurants Description
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

//        //Events Description
//        String eventString;
//        if (savedInstanceState == null) {
//            Bundle extras = getIntent().getExtras();
//            if(extras == null) {
//                eventString= null;
//            } else {
//                eventString= extras.getString("event");
//            }
//        } else {
//            eventString= (String) savedInstanceState.getSerializable("event");
//        }
//
//        String eventdescString;
//        if (savedInstanceState == null) {
//            Bundle extras = getIntent().getExtras();
//            if(extras == null) {
//                eventdescString= null;
//            } else {
//                eventdescString= extras.getString("event_desc");
//            }
//        } else {
//            eventdescString= (String) savedInstanceState.getSerializable("event_desc");
//        }
//
//        int eventimageID;
//        if (savedInstanceState == null) {
//            Bundle extras = getIntent().getExtras();
//            if(extras == null) {
//                eventimageID= 0;
//            } else {
//                eventimageID= extras.getInt("event_image");
//            }
//        } else {
//            eventimageID= (int) savedInstanceState.getSerializable("event_image");
//        }
//
//        ImageView eventimageView =(ImageView) findViewById(R.id.description_image);
//        eventimageView.setImageResource(eventimageID);
//
//        TextView eventNameView = (TextView) findViewById(R.id.description_name);
//        eventNameView.setText(eventString);
//
//        TextView eventDescView = (TextView) findViewById(R.id.description);
//        eventDescView.setText(eventdescString);
    }
}
