package com.dit;

public class Feed {

    String typeOfFeed;

    public Feed(String typeOfFeed) {
        this.typeOfFeed = typeOfFeed;
    }

    @Override
    public String toString() {
        return typeOfFeed;
    }

}
