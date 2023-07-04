package 범수버스;

import java.util.Scanner;

public class 범수1 {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 10;
//		int c = a + b;
//		System.out.println(c);

		// ex) char = 'ㅁ','a'
		// ex) String = "김범수","기"
		// boolean = true,false

		// 만약 나이가 20살 보다 많다
		// 출력 : 성인입니다
		// 만약 나이가 8보다 많고 20아래이다
		// 출력 : 학생입니다
		// 8보다 나이가 적다
		// 출력 : 잼

//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이");
//		int age = sc.nextInt();
//		
//		if(age>=20) {
//			System.out.println("성인입니다");
//		}else if(age>=8) {
//			System.out.println("학생입니다");
//		}else if(age<=8) {
//			System.out.println("잼민");
//		}
 
		// 구구단 단을 입력을 받으면
		// 값 * 1 = 0
//		int dan = 2;
//		for (int i = 0; i <= 9; i++) {
//			System.out.println(dan + "*" + i + "=" + dan * i);
//		}
//		for(int i=0; i<=10; i++) {
//			System.out.println("안녕하세요");
//		}
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);

//		int sum = 0;
//		// int i = 0; <<- 밑에 int 빼도댐
//		for(int i=0; i<=100; i++) {
//			if(i % 2 == 1) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);

//		Scanner sc = new Scanner(System.in);                       !
//		System.out.println("변수를 입력하시오");
//		int a = sc.nextInt();
//		int sum = 0;
//		int sum1 = 0;
//		int sum2 = 0;
//		
//		for(int i=0; i<=a; i++) {
//			if(i % 3 == 0 && i % 5 == 0) {
//				sum += i;                  // sum=sum+i (sum에 sum+i값을 저장)
//				System.out.println(sum);
//			}else if(i % 3 == 0) {
//				sum1 += i;
//				System.out.println(sum1);
//			}else if(i % 5 == 0) {
//				sum2 += i;
//				System.out.println(sum2);
//			}else {
//				System.out.println("3과 5의 배수가 아닙니다");
//			}
//		}
		// 입력받은 수 부터 입력받은 수 까지 출력하는데, 3의배수는 피즈, 5의배수는 버즈, 3,5의배수는 피즈버즈
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하시오");
//		int a = sc.nextInt();
//		System.out.println("숫자를 입력하시오");
//		int b = sc.nextInt();
//		
//		for(int i=a; i<=b; i++) {
//			if(i % 3 == 0 && i % 5 == 0) {
//				System.out.println("피즈버즈");
//			}else if(i % 3 == 0) {
//				System.out.println("피즈");
//			}else if(i % 5 == 0) {
//				System.out.println("버즈");
//			}else {
//				System.out.println(i);
//			}
//		}
//		int i=1;
//		while(i<10) {
//			System.out.print("i");
//		}

//		String a = "";     // 초기화 값

//		Scanner sc = new Scanner(System.in);
//		System.out.println("단을 입력하시오");
//		int dan = sc.nextInt();
//		int sum = 0;
//
//		
//		while(true) {
//			for(int i=1; i<=9; i++) {
//				sum = dan*i;
//				if(i==7) {
//					System.out.println();
//					continue;
//				}
//				System.out.println(dan+" * "+i+" = "+sum);	
//			}
//			break;
//		}

		Scanner sc = new Scanner(System.in);
		int balance = 10000;

		while (true) {
			System.out.println("=====자판기=====");
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 0.종료");
			int menu = sc.nextInt();
			
			
			if (menu == 1) {
				if (balance >= 1000) {
					System.out.println("콜라");
					balance -= 1000;
					System.out.println(balance);
				} else {
					System.out.println("잔액이 부족합니다");
				}
			} else if (menu == 2) {
				if (balance >= 1200) {
					System.out.println("사이다");
					balance -= 1200;
					System.out.println(balance);
				} else {
					System.out.println("잔액이 부족합니다");
				}
			} else if (menu == 3) {
				if (balance >= 1500) {
					System.out.println("우유");
					balance -= 1500;
				} else {
					System.out.println("잔액이 부족합니다");
				}
			} else if (menu == 0) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("0~3까지 입력 가능합니다");
			}
			System.out.println();
		}

	}

}
