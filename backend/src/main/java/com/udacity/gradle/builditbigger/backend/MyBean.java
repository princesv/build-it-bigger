package com.udacity.gradle.builditbigger.backend;

import com.prince.joketeller.JokeTeller;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        myData = new JokeTeller().getJoke();
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}