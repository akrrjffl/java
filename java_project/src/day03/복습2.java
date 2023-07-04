package day03;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		
//		for(int i=0;i<5;i++) {
//			System.out.println("컹.");
//		}

//		
//		for(int i=10; i>0;i=i-1) {
//			System.out.println(i);
//		}

//		// 1부터 10까지 가로로
//		for (int i = 1; i < 11; i++) {
//			if (i == 10) {
//				System.out.print(10);
//			} else {
//				System.out.print(i + ",");
//			}
//			}

//		int sum = 0;    //값의 합을 구하고싶으면 sum
//		
//		for(int i=1; i<=10; i++) {
//			sum=sum+i;
//		}System.out.println(sum);
//		
//		

		// 1~100 7배수 갯수 출력
//		int cnt = 0; // cnt=갯수 출력
//		for (int i = 1; i <= 100; i++) {
//			if (i % 7 == 0) {
//				cnt++;
//			}
//		}
//		System.out.println("1~100까지 7의배수" + cnt);

		// 구구단 break;(반복문 중지) , continue;(반복문 건너뛰기)
//		int dan = 6;
//		System.out.println(dan+"단");
//		
//		for(int i=1; i<=9; i++) {
//			if(i==5) {
//				System.out.println();
//				break; // continue;
//			
//			}	System.out.println(dan+"*"+i+"="+(dan*i));
//		}
//			System.out.println(dan+"단 끝");
//	
//	

		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자입력>");
//		int a = sc.nextInt();
////		
////		if(a>0) {
////			System.out.println("양수");
////		}
////		
//		
//		
//		while(a>0) {
//			System.out.println("컹");
//		}
//	
//	

		while (true) {
			System.out.print("숫자입력>");
			int a = sc.nextInt();
			if (a == 0) {
				System.out.println("반복문 종료");
				break;
			} else if (a % 2 == 1) {
				System.out.println("홀수");
			} else if (a % 2 == 0) {
				System.out.println("짝수");
			}
				
		}

	}

}
