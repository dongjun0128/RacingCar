package com.company;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    public com.company.View View;
    Race race = new Race();
    // View view = new View();

    private List<Car> carList = new ArrayList<>();

    public void game(){
        View.inputCarName(carList);
        int roundNum = View.inputRoundNum();

        for (int round = 0; round < roundNum; round++) {
            View.println(round + 1 + "회");

            /*
            carList.stream().forEach(car-> {
                view.print(car.getName() + " : ");
                car.setTrack(race.randomNum());
                race.goingTrack(car.getTrack());
            });
            */
            /*
            for (Car car :carList) {
                view.print(car.getName() + " : ");
                car.setTrack(race.randomNum());
                race.goingTrack(car.getTrack());
            }
            */
            for (int carIndex = 0; carIndex < carList.size(); carIndex++) {
                View.print(carList.get(carIndex).getName() + " : ");
                carList.get(carIndex).setTrack(race.randomNum());
                race.goingTrack(carList.get(carIndex).getTrack());
            }

            View.println("");
        }

        int max;

        max = race.findMaxInt(carList);
        race.findTheFastestCar(carList, max);
        View.println("가 최종우승했습니다.");
    }
}
