package com.bootcamp.mumbaitourguide;

/**
 * Created by MANU on 2/24/2018.
 * {@link Info} represents a information of the places.
 * It contains images and name of the place.
 */

public class Info {

    /** Image Resource Id of the place */
    private int mImageResourceId;

    /** Name of the particular place */
    private String mName;

    /** Description of the particular place */
    private String mDescription;

    /**
     * Create a new Info object.
     *
     * @param ImageResourceId is the image of the place.
     *
     * @param Name is the name of place.
     */
    public Info(int ImageResourceId , String Name , String Description){
        mImageResourceId = ImageResourceId;
        mName = Name;
        mDescription = Description;
    }

    /**
     * Get ImageResourceID of the place
     * @return mImageResourceId
     */
    public int getmImageResourceId(){return mImageResourceId;}

    /**
     * Get the Name of the particular place
     * @return mName
     */
    public String getmName() {
        return mName;
    }

    /**
     * Get the Description of the particular place
     * @return mDescription
     */
    public String getmDescription() {
        return mDescription;
    }
}
