package day04;

import java.util.Scanner;

public class Ex03_grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====성적표=====");
			System.out.println("국어> ");
			int kor = sc.nextInt();
			System.out.println("영어> ");
			int eng = sc.nextInt();
			System.out.println("수학> ");
			int mat = sc.nextInt();
			int sum = kor+eng+mat;
			int avg = sum/3;
//			double avg = sum / (double)3;
			
			String grade = "";
			if(avg >= 90) {
				grade = "A";
			}else if(avg >= 80) {
				grade = "B";
			}else if(avg >= 70) {
				grade = "C";
			}else if(avg >= 60) {
				grade = "D";
			}else {
				grade = "F";
			}
					
			System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println("===============================================");
			System.out.println(kor+"\t"+eng+"\t"+mat+"\t"+sum+"\t"+avg+"\t"+grade);
			//System.out.printf("%d\t%d\t%d\t%d\t%f\t%s\n",kor, eng, mat, sum, avg, grade);
			System.out.println();
		}

	}

}
