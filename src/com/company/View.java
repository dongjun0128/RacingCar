package com.company;

import java.util.*;

public class View {

    Scanner scanner = new Scanner(System.in);


    public void showFirst(List<Car> carList) {

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        String str = scanner.next();

        ArrayList<String> carNameList = new ArrayList<String>(Arrays.asList(str.split(",")));

        for (int index = 0; index < carNameList.size(); index++) {
            carList.add(new Car(carNameList.get(index)));
        }
    }

    public int showSecond(){
        int roundNum;

        System.out.println("시도할 횟수는 몇회인가요?");
        roundNum = scanner.nextInt();

        return roundNum;
    }

    public int askRestart(){
        System.out.println("한 번 더 진행 하시겠습니까? Y/N");

        int flag=2;

        while(flag==2) {
            String restart = scanner.next();
            if (restart.equals("Y")) flag = 0;
            else if (restart.equals("N")) flag=1;
            else println("올바르게 입력 해주세요");
        }

        return flag;
    }

    public void println(String str) {
        System.out.println(str);
    }
    public void print(String str) {
        System.out.print(str);
    }

}
