package com.company;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car a, Car b) {
        if (a.getTrack() > b.getTrack()) {
            return 1;
        } else if (a.getTrack() == b.getTrack()) {
            return 0;
        } else {
            return -1;
        }
    }
}
