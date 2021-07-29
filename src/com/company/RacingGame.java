package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RacingGame {
    Race race = new Race();
    private List<Car> carList = new ArrayList();

    public RacingGame() {
    }

    public void game() {
        View.inputCarName(this.carList);
        int roundNum = View.inputRoundNum();

        int max;
        for(max = 0; max < roundNum; ++max) {
            View.println(max + 1 + "회");
            Iterator var3 = this.carList.iterator();

            while(var3.hasNext()) {
                Car car = (Car)var3.next();
                View.print(car.getName());
                car.setTrack(car.getTrack() + this.race.randomNum());
                this.race.goingTrack(car.getTrack());
            }

            View.println("");
        }

        max = this.race.findMaxInt(this.carList);
        this.race.findTheFastestCar(this.carList, max);
        View.println("가 최종우승했습니다.");
    }

    public void initGame() {
        this.carList.removeAll(this.carList);
    }
}
