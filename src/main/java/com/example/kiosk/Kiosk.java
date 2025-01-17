package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //배열 선언
    List<MenuItem> menuItems = new ArrayList<>();

    //Kiosk 생성자(list)
    public Kiosk(List<MenuItem> _menuItems){
        this.menuItems = _menuItems;
    }


    //start 메서드
    public void start(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            for (int i = 0; i < menuItems.size(); i++) {
                // List 에서 i 번째의 객체(값)를 가져옴
                MenuItem item = menuItems.get(i);
                // i 는 0번째 부터 시작하므로 1 증가 시켜줌
                System.out.println((i+1) + ". " +
                        item.getMenuName() +
                        " |  W " + item.getMenuPrice() +
                        "|  " + item.getMenuDescription());
            }
            System.out.println("0. 종료      | 종료");

            int choice = sc.nextInt();

            if(choice == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 사용자가 입력한 숫자가 최소한 1 이상인지 확인 후 동작 하게끔 함, 0 은 종료 숫자 이므로 위에서 처리함.
            // 사용자가 입력한 숫자가 menuItems list 갯수를 초과 하지 않도록 조건을 추가함
            // AND 연산자로 두가지 조건을 모두 만족해야 내부 로직이 실행 됨

            if(choice >= 1 && choice <= menuItems.size()-1){
                MenuItem selectedmenuItem = menuItems.get(choice - 1);
                System.out.println("선택한 메뉴 : " + selectedmenuItem.getMenuName()  + "| 가격:" + selectedmenuItem.getMenuPrice() + "| 설명:" + selectedmenuItem.getMenuDescription());
                System.out.println("\n");
            }else{
                System.out.println("유효하지 않은 선택입니다, 다시 선택해주세요.");
            }
        }
    }
}
