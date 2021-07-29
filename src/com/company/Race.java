package com.company;

import java.util.*;

public class Race {

    Random random;
    View view;

    public Race() {
        random = new Random();
        view = new View();
    }

    public void goingTrack(int track) {
        for (int loop = 0; loop < track; loop++) {
            view.print("-");
        }
        view.println("");
    }

    public int findMaxInt(List<Car> carList) {
        Car maxCar = Collections.max(carList, new CarComparator());
        return maxCar.getTrack();
    }

    public void findTheFastestCar(List<Car> carList, int max) {
        List<String> theFastestCarList = new ArrayList<>();

        for (int carIndex = 0; carIndex < carList.size(); carIndex++) {
            if (carList.get(carIndex).getTrack() == max) {
                theFastestCarList.add(carList.get(carIndex).getName());
            }
        }
        view.print(String.join(",",theFastestCarList));
    }

    public int randomNum() {
        return random.nextInt(3);
    }

}