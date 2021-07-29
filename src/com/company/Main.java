package com.company;

public class Main {

    public static void main(String[] args) {

        int flag;

        RacingGame game1 = new RacingGame();

        do {
            game1.game();
            flag = View.askRestart();
            game1.initGame();
        }while(flag == 0);

        View.println("게임을 종료합니다.");

    }
}
