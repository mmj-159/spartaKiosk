package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<MenuItem> menuItems = new ArrayList<>();

    public Kiosk(List<MenuItem> _menuItems){
        this.menuItems = _menuItems;
    }

    public void start(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i); // List에서 객체를 가져옴
                System.out.println((i+1) + ". " +
                        item.getMenuName() +
                        " |  W " + item.getMenuPrice() +
                        "|  " + item.getMenuDescription());
            }
            System.out.println("0. 종료      | 종료");

            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("\n");
                //System.out.println("선택한 메뉴 : " + shackBurger.getMenuName() + "| 가격:" + shackBurger.getMenuPrice() + "| 설명:" + shackBurger.getMenuDescription());
                System.out.println("\n");
            } else if (choice == 0) {
                System.out.println("프로그램이 종료됩니다");
                break;
            } else {
                System.out.println("유효하지 않은 선택입니다. 다시 시도하세요.");
            }
        }
    }
}
