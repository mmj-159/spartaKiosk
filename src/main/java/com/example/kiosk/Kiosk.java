package com.example.kiosk;

import java.util.Scanner;

public class Kiosk {

    // Kiosk는 특정 Menu를 관리
    private Menu menu;

    // 생성자
    public Kiosk(Menu _menu) {
        this.menu = _menu;
    }

    //start 메서드
    public void start(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            //Menu 클래스의 printMenu 메서드를 씀
            menu.printMenu();

            int choice = sc.nextInt();

            if(choice == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 사용자가 입력한 숫자가 최소한 1 이상인지 확인 후 동작 하게끔 함, 0 은 종료 숫자 이므로 위에서 처리함.
            // 사용자가 입력한 숫자가 menu list 갯수를 초과 하지 않도록 조건을 추가함
            // AND 연산자로 두가지 조건을 모두 만족해야 내부 로직이 실행 됨

            if(choice >= 1 && choice <= menu.getSize()){
                System.out.println("\n");
                MenuItem selectedmenuItem = menu.getItem(choice - 1);
                System.out.println("선택한 메뉴 : " + selectedmenuItem.getMenuName()  + "| 가격:" + selectedmenuItem.getMenuPrice() + "| 설명:" + selectedmenuItem.getMenuDescription());
                System.out.println("\n");
            }else{
                System.out.println("유효하지 않은 선택입니다, 다시 선택해주세요.");
            }
        }
    }
}
