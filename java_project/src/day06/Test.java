package day06;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] number = new int[3];
//		System.out.print(">");
//		
//		for(int i=0; i<10000; i++) {
//			sc.nextLine();
//			for(int j=0; j<number.length; j++) {
//				number[j] = (int)(Math.random()*45)+1;
//				System.out.print(number[j]+" ");
//			}
//			if(number[0] == number[1] && number[1] == number[2]) {
//				System.out.println("정답");
//				break;
//			}
//		}
		
		int[] lotto = new int[6];
		
		// lotto 배열에 중복없이 1~9까지 값 넣기
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*9)+1;    // 공식
			
			
		}
		
		System.out.println(lotto[0]);
		System.out.println(lotto[1]);
		System.out.println(lotto[2]);
		System.out.println(lotto[3]);
		System.out.println(lotto[4]);

	}

}
