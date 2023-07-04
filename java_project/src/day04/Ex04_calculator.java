package day04;

import java.util.Scanner;

public class Ex04_calculator {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		boolean run = true;
//		
//		while(run) {
//			System.out.println("=====계산기=====");
//			System.out.print("첫번째 숫자입력> ");
//			int num1 = sc.nextInt();
//			
//			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
//			System.out.print("선택> ");
//			int menu = sc.nextInt();
//			
//			System.out.print("두번째 숫자입력> ");
//			int num2 = sc.nextInt();
//			
//			if(menu == 1) {
//				System.out.println(num1+" + "+num2+" = "+(num1+num2));
//			}else if(menu == 2) {
//				System.out.println(num1+" - "+num2+" = "+(num1-num2));
//			}else if(menu == 3) {
//				System.out.println(num1+" * "+num2+" = "+(num1*num2));
//			}else if(menu == 4) {
//				System.out.println(num1+" / "+num2+" = "+(num1/num2));
//			}else if(menu == 5) {
//				System.out.println(num1+" % "+num2+" = "+(num1%num2));
//			}
//			System.out.println();
//		}
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("=====계산기=====");
			System.out.print("첫번째 숫자입력> ");
			int num1 = sc.nextInt();
			
			String cal = "";
			while(true) {
				System.out.print("연산자 선택> ");
				cal = sc.next();
				if(cal.equals("+") || cal.equals("-") || cal.equals("*") || cal.equals("/") || cal.equals("%")) {
					break;
				}else {
				System.out.println("사용할 수 없는 연산자 입니다");
				}
			}
			System.out.print("두번째 숫자입력> ");
			int num2 = sc.nextInt();
			
			if(cal.equals("+")) {
				System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			}else if(cal.equals("-")) {
				System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
			}else if(cal.equals("*")) {
				System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
			}else if(cal.equals("/")) {
				System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
			}else if(cal.equals("%")) {
				System.out.printf("%d % %d = %d\n",num1,num2,num1%num2);
			}
			System.out.println();
		}
	}

}
