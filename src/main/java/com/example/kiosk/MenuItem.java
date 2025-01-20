package com.example.kiosk;

public class MenuItem {
    private String menuName;
    private double menuPrice;
    private String menuDescription;



    // 생성자
    public MenuItem(String _menuName, double _menuPrice, String _menuDescription){
        this.menuName = _menuName;
        this.menuPrice = _menuPrice;
        this.menuDescription = _menuDescription;
    }

    // getter

    public String getMenuName() {
        return menuName;
    }

    public double getMenuPrice() {
        return menuPrice;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

}
