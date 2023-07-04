package day08;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class 복습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 10000;
		
		while(true) {
			System.out.printf("=====자판기=====[%,d원]\n",balance);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 0.종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				if(balance >= 1000) {
					System.out.println("콜라 선택> ");
					balance -= 1000;
				}else {
					System.out.println("잔액부족");
				}
			}else if(menu == 2) {
				if(balance >= 1200) {
					System.out.println("사이다 선택> ");
					balance -= 1200;
				}else {
					System.out.println("잔액부족");
				}
			}else if(menu == 3) {
				if(balance >= 1500) {
					System.out.println("우유 선택> ");
					balance -= 1500;
				}else {
					System.out.println("잔액부족");
				}
			}else if(menu == 0) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("다시 선택");
			}
			System.out.println();
		}
		
		
		

	}

}












