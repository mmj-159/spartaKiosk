package com.example.kiosk;

public class MenuItem {
    private String menuName;
    private double menuPrice;
    private String menuDescription;

    public String getMenuName() {
        return menuName;
    }

    // 생성자
    public MenuItem(String _menuName, double _menuPrice, String _menuDescription){
        this.menuName = _menuName;
        this.menuPrice = _menuPrice;
        this.menuDescription = _menuDescription;
    }


    // get, set
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public double getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(double menuPrice) {
        this.menuPrice = menuPrice;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }
}
