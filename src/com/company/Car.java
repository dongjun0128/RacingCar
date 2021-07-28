package com.company;

import java.util.*;

public class Car {
    private String name;

    private int track = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getTrack() {
        return this.track;
    }

    public void setTrack(int track) {
        this.track = track;
    }
}