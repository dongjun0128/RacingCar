package com.company;

public class Main {

    public static void main(String[] args) {

        int flag;

        RacingGame game1 = new RacingGame();

        do {
            game1.game();
            flag =game1.view.askRestart();
        }while(flag == 0);

        game1.view.println("게임을 종료합니다.");

    }
}
