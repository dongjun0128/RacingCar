package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Race {
    Random random = new Random();
    View view = new View();

    public Race() {
    }

    public void goingTrack(int track) {
        View var10000;
        for(int loop = 0; loop < track; ++loop) {
            var10000 = this.view;
            View.print("-");
        }

        var10000 = this.view;
        View.println("");
    }

    public int findMaxInt(List<Car> carList) {
        Car maxCar = (Car)Collections.max(carList, new CarComparator());
        return maxCar.getTrack();
    }

    public void findTheFastestCar(List<Car> carList, int max) {
        List<String> theFastestCarList = new ArrayList();

        for(int carIndex = 0; carIndex < carList.size(); ++carIndex) {
            if (((Car)carList.get(carIndex)).getTrack() == max) {
                theFastestCarList.add(((Car)carList.get(carIndex)).getName());
            }
        }

        View var10000 = this.view;
        View.print(String.join(",", theFastestCarList));
    }

    public int randomNum() {
        return this.random.nextInt(3);
    }
}
