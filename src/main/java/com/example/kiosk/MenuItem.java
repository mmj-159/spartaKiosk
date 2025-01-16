package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    private String menuName;
    private double menuPrice;
    private String menuDescription;

    public String getMenuName() {
        return menuName;
    }

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

    public MenuItem(String _menuName, double _menuPrice, String _menuDescription){
        this.menuName = _menuName;
        this.menuPrice = _menuPrice;
        this.menuDescription = _menuDescription;

    }
}
