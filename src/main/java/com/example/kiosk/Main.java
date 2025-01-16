package com.example.kiosk;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuItem shackBurger = new MenuItem("ShackBurger", 6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem smokeShack = new MenuItem("SmokeShack", 8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseburger = new MenuItem("Cheeseburger", 6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamburger = new MenuItem("Hamburger", 5.4,"비프패티를 기반으로 야채가 들어간 기본버거");

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(shackBurger);
        menuItems.add(smokeShack);
        menuItems.add(cheeseburger);
        menuItems.add(hamburger);

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
                System.out.println("선택한 메뉴 : " + shackBurger.getMenuName() + "| 가격:" + shackBurger.getMenuPrice() + "| 설명:" + shackBurger.getMenuDescription());
                System.out.println("\n");
            } else if (choice == 2) {
                System.out.println("\n");
                System.out.println("선택한 메뉴 : " + smokeShack.getMenuName() + "| 가격:" + smokeShack.getMenuPrice() + "| 설명:" + smokeShack.getMenuDescription());
                System.out.println("\n");
            } else if (choice == 3) {
                System.out.println("\n");
                System.out.println("선택한 메뉴 : " + cheeseburger.getMenuName() + "| 가격:" + cheeseburger.getMenuPrice() + "| 설명:" + cheeseburger.getMenuDescription());
                System.out.println("\n");
            } else if (choice == 4) {
                System.out.println("\n");
                System.out.println("선택한 메뉴 : " + hamburger.getMenuName() + "| 가격:" + hamburger.getMenuPrice() + "| 설명:" + hamburger.getMenuDescription());
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