package day05;

import java.util.Scanner;

public class Ex01_grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[100];
		int[] kor = new int[100];
		int[] eng = new int[100];
		int[] mat = new int[100];
		int[] sum = new int[100];
		double[] avg = new double[100];
		char[] grade = new char[100];
		
		int cnt = 0;
		
		while(true) {
			System.out.println("=====성적등록=====");
			System.out.println("1.성적등록 2.성적리스트 0.종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("학생이름> ");
				name[cnt] = sc.next();
				System.out.println("국어> ");
				kor[cnt] = sc.nextInt();
				System.out.println("영어> ");
				eng[cnt] = sc.nextInt();
				System.out.println("수학> ");
				mat[cnt] = sc.nextInt();
				sum[cnt] = kor[cnt]+eng[cnt]+mat[cnt];
				avg[cnt] = sum[cnt] / (double)3;
				
				if(avg[cnt] >= 90) {
					grade[cnt] = 'A';
				}else if(avg[cnt] >= 80) {
					grade[cnt] = 'B';
				}else if(avg[cnt] >= 70) {
					grade[cnt] = 'C';
				}else if(avg[cnt] >= 60) {
					grade[cnt] = 'D';
				}else {
					grade[cnt] = 'F';
				}				
				
				cnt++;
			}else if(menu == 2) {
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
				System.out.println("=====================================================");
				for(int i=0; i<cnt; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n", 
							name[i],kor[i],eng[i],mat[i],sum[i],avg[i],grade[i]);
				}
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("0~2까지 입력가능");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}









