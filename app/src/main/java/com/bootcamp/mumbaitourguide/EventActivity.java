package com.bootcamp.mumbaitourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.place_list);

        // Create an ArrayList of Info objects
        final ArrayList<Info> events = new ArrayList<Info>();
        events.add(new Info(R.drawable.gc1,getString(R.string.gc),getString(R.string.gc_desc)));
        events.add(new Info(R.drawable.md1,getString(R.string.md),getString(R.string.md_desc)));
        events.add(new Info(R.drawable.holi1,getString(R.string.holi),getString(R.string.holi_desc)));
        events.add(new Info(R.drawable.diwali1,getString(R.string.diwali),getString(R.string.diwali_desc)));

        // Create an {@link InfoAdapter}, whose data source is a list of
        // {@link Info}s. The adapter knows how to create list item views for each item
        // in the list.
        InfoAdapter eventsAdapter = new InfoAdapter(this, events);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(eventsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Get the {@link museum} object at the given position the user is clicked on
                Info event= events.get(i);

                Intent descriptionIntent = new Intent(EventActivity.this,DescriptionActivity.class);
                descriptionIntent.putExtra("restaurant",event.getmName());
                descriptionIntent.putExtra("restaurant_desc",event.getmDescription());
                descriptionIntent.putExtra("restaurant_image",event.getmImageResourceId());

                startActivity(descriptionIntent);
            }
        });
    }
}
