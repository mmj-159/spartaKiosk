package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String categoryName;
    private List<MenuItem> listItems;

    //생성자(Main에서 받아온 카테고리 이름)
    public Menu(String _categoryName){
        this.categoryName = _categoryName;
        this.listItems = new ArrayList<>();
    }

    // 메뉴 항목 추가
    public void addItem(MenuItem item) {
        listItems.add(item);
    }

    // 출력 담당
    public void printMenu(){
        System.out.println("["+getCategoryName()+"  메뉴]");
        for (int i = 0; i < listItems.size(); i++) {
            // List 에서 i 번째의 객체(값)를 가져옴
            MenuItem item = listItems.get(i);
            // i 는 0번째 부터 시작하므로 1 증가 시켜줌
            System.out.println((i+1) + ". " +
                    item.getMenuName() +
                    " |  W " + item.getMenuPrice() +
                    "|  " + item.getMenuDescription());
        }
        System.out.println("0. 종료      | 종료");
    }
    // 메뉴 크기 반환
    public int getSize() {
        return listItems.size();
    }

    // 특정 인덱스의 메뉴 항목 반환
    public MenuItem getItem(int index) {
        return listItems.get(index);
    }

    // 카테고리 이름 반환
    public String getCategoryName() {
        return categoryName;
    }

}
