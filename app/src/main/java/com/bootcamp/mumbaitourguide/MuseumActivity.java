package com.bootcamp.mumbaitourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.place_list);

        // Create an ArrayList of Info objects
        final ArrayList<Info> museums = new ArrayList<Info>();
        museums.add(new Info(R.drawable.csmvs1,getString(R.string.csmvs),getString(R.string.csmvs_desc)));
        museums.add(new Info(R.drawable.nsc1,getString(R.string.nsc),getString(R.string.nsc_desc)));
        museums.add(new Info(R.drawable.gag1,getString(R.string.jag),getString(R.string.jag_desc)));
        museums.add(new Info(R.drawable.ngma1,getString(R.string.ngoma),getString(R.string.ngoma_desc)));

        // Create an {@link InfoAdapter}, whose data source is a list of
        // {@link Info}s. The adapter knows how to create list item views for each item
        // in the list.
        InfoAdapter museumAdapter = new InfoAdapter(this, museums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(museumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Get the {@link museum} object at the given position the user is clicked on
                Info museum= museums.get(i);

                Intent descriptionIntent = new Intent(MuseumActivity.this, MuseumDescriptionActivity.class);
                descriptionIntent.putExtra("museum",museum.getmName());
                descriptionIntent.putExtra("museum_desc",museum.getmDescription());
                descriptionIntent.putExtra("museum_image",museum.getmImageResourceId());

                startActivity(descriptionIntent);
            }
        });
    }
}
