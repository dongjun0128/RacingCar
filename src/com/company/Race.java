package com.company;

import java.util.*;

public class Race {

    public void goingTrack(int track) {
        for (int loop = 0; loop < track ; loop++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public int findMaxInt(List<Car> carList) {
        Car maxCar = Collections.max(carList, new CarComparator());
        return maxCar.getTrack();
    }

    public void findTheFastestCar(List<Car> carList, int max) {
        for(int carIndex = 0 ; carIndex < carList.size() ; carIndex++) {
            if(carList.get(carIndex).getTrack() == max) {
                System.out.print(carList.get(carIndex).getName() );
            }
        }

    }
    public int randomNum() {
        Random random = new Random(); // new Random()이랑 그냥 변수 가져다가 쓰는 것에 차이점,, 없으면 없다고
        return random.nextInt(3);
    }

}