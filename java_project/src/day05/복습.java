package day05;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// 하나의 숫자를 입력받아, 3의배수, 5의배수, 3과5의배수, 둘다아님
		
		Scanner sc = new Scanner(System.in);
//		System.out.println();
		System.out.println("숫자입력> ");
		int num = sc.nextInt();
		int sum = 0;
		
//		if(num % 3 == 0 && num % 5 == 0) {
//			System.out.println("3과5의배수");
//		}else if(num % 3 == 0) {
//			System.out.println("3의배수");
//		}else if(num % 5 == 0) {
//			System.out.println("5의배수");
//		}else {
//			System.out.println("둘다아님");
//		}
		
		// 하나의 숫자를 입력받아, 1~입력받은 수 까지의 합 출력
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		  System.out.println(sum);

	}

}
