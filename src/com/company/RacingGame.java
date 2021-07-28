package com.company;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    Race race = new Race();
    View view = new View();

    private List<Car> carList = new ArrayList<>();

    public void game(){
        view.showFirst(carList);
        int roundNum = view.showSecond();

        for (int round = 0; round < roundNum; round++) {
            view.println(round + 1 + "회");

            for (int carIndex = 0; carIndex < carList.size(); carIndex++) {
                view.print(carList.get(carIndex).getName() + " : ");
                carList.get(carIndex).setTrack(race.randomNum());
                race.goingTrack(carList.get(carIndex).getTrack());
            }

            System.out.println();
        }

        int max;

        max = race.findMaxInt(carList);
        race.findTheFastestCar(carList, max);
        view.println("가 최종우승했습니다.");
    }


}
