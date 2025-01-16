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

    }
}