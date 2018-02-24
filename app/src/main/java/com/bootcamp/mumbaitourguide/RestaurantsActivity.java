package com.bootcamp.mumbaitourguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.place_list);

        // Create an ArrayList of Info objects
        final ArrayList<Info> restaurants = new ArrayList<Info>();
        restaurants.add(new Info(R.drawable.csmvs1,getString(R.string.csmvs),getString(R.string.csmvs_desc)));
        restaurants.add(new Info(R.drawable.nsc1,getString(R.string.nsc),getString(R.string.nsc_desc)));
        restaurants.add(new Info(R.drawable.gag1,getString(R.string.jag),getString(R.string.jag_desc)));
        restaurants.add(new Info(R.drawable.ngma1,getString(R.string.ngoma),getString(R.string.ngoma_desc)));

        // Create an {@link InfoAdapter}, whose data source is a list of
        // {@link Info}s. The adapter knows how to create list item views for each item
        // in the list.
        InfoAdapter restaurantsAdapter = new InfoAdapter(this, restaurants);

        ListView listViewr = (ListView) findViewById(R.id.list);

        listViewr.setAdapter(restaurantsAdapter);

        listViewr.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Get the {@link museum} object at the given position the user is clicked on
                Info restaurant= restaurants.get(i);

                Intent descriptionIntentr = new Intent(RestaurantsActivity.this,DescriptionActivity.class);
                descriptionIntentr.putExtra("restaurant",restaurant.getmName());
                descriptionIntentr.putExtra("restaurant_desc",restaurant.getmDescription());
                descriptionIntentr.putExtra("restaurant_image",restaurant.getmImageResourceId());

                startActivity(descriptionIntentr);
            }
        });
    }
}
