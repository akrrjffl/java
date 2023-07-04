package day07;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// while문을 사용하여
		
		Scanner sc = new Scanner(System.in);
		int balance = 10000;
		String[] product = new String[100];
		// product[0] = "우유";
		int cnt = 0;
		
		while(true) {
			System.out.printf("=====자판기=====[잔액 : %,d]\n",balance);
			System.out.println("1.콜라 2.사이다 3.우유 4.구매목록 0.종료");
			int menu = sc.nextInt();
			
			
			if(menu == 1) {
				if(balance>=1000) {
				System.out.println("콜라 선택");
				balance -= 1000;
				product[cnt++] ="콜라";
				System.out.println(balance);
				}else {
					System.out.println("잔액 부족");
				}
			}else if(menu == 2) {
				if(balance>=1200) {
				System.out.println("사이다 선택");
				balance -= 1200;
				product[cnt++] ="사이다";
				System.out.println(balance);
				}else {
					System.out.println("잔액 부족");
				}
			}else if(menu == 3) {
				if(balance>=1500) {
				System.out.println("우유 선택");
				balance -= 1500;
				product[cnt++] ="우유";
				System.out.println(balance);
				}else {
					System.out.println("잔액 부족");
				}
			}else if(menu == 4) {
				System.out.println("구매목록\t수량");
				System.out.println("=======");
				System.out.printf("%d\t");
				// 구매목록 출력
				int a = 0;
				int b = 0;
				int c = 0;
				for(int i=0; i<cnt; i++) {
					if(product[0].equals("콜라")) {
						a++;
					}else if(product[0].equals("사이다")) {
						b++;
					}else if(product[0].equals("우유")) {
						c++;
					}
					System.out.printf("콜라:%d\t사이다:%d\t우유:%d\t\n",a,b,c);
					System.out.println();
				}
			}else if(menu == 0) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("다시입력");
			}
			
			
					
		}
		
		
		

	}

}
