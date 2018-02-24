package com.bootcamp.mumbaitourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by MANU on 2/24/2018.
 */

public class InfoAdapter extends ArrayAdapter<Info> {
    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param infoArrayList A List of AndroidFlavor objects to display in a list
     */
    public InfoAdapter(Activity context, ArrayList<Info> infoArrayList) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, infoArrayList);
        Log.v("InfoAdapter.java","Hey we are inside InfoAdapter");
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Info} object located at this position in the list
        Info currentInfo = getItem(position);

        // Find the placeTextView in the list_item.xml layout with the ID place_name
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_name);
        // Get the version name from the current Info object and
        // set this text on the name placeTextView
        placeTextView.setText(currentInfo.getmName());


        // Find the placeImageView in the list_item.xml layout with the ID place_image
        CircleImageView placeImageView = (CircleImageView) listItemView.findViewById(R.id.place_image);
        // Get the image resource ID from the current Info object and
        // set the image to placeImageView
        placeImageView.setImageResource(currentInfo.getmImageResourceId());

        // Return the whole list item layout (containing a TextView and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
