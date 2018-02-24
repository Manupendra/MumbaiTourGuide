package com.bootcamp.mumbaitourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ArchitectureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.place_list);

        // Create an ArrayList of Info objects
        final ArrayList <Info> architectures = new ArrayList<Info>();
        architectures.add(new Info(R.drawable.gateway1,getString(R.string.gateway),getString(R.string.gateway_desc)));
        architectures.add(new Info(R.drawable.elephanta1,getString(R.string.elephanta),getString(R.string.elephanta_desc)));
        architectures.add(new Info(R.drawable.haji1,getString(R.string.haji),getString(R.string.haji_desc)));
        architectures.add(new Info(R.drawable.bwsl1,getString(R.string.bwsl),getString(R.string.bwsl_desc)));

        // Create an {@link InfoAdapter}, whose data source is a list of
        // {@link Info}s. The adapter knows how to create list item views for each item
        // in the list.
        InfoAdapter architectureAdapter = new InfoAdapter(this, architectures);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(architectureAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Get the {@link architecture} object at the given position the user is clicked on
                Info architecture= architectures.get(i);

                Intent descriptionIntent = new Intent(ArchitectureActivity.this,ArchitectureDescriptionActivity.class);
                descriptionIntent.putExtra("place",architecture.getmName());
                descriptionIntent.putExtra("place_desc",architecture.getmDescription());
                descriptionIntent.putExtra("place_image",architecture.getmImageResourceId());

                startActivity(descriptionIntent);
            }
        });
    }
}
