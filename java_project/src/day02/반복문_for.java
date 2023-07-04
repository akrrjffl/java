package day02;

import java.util.Scanner;

public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문 예시 for(int i = 0; i<11; i++) ++=1씩증가
		// i++= i=i+1
		// i=변수

//		for(int i = 1; i<=10; i=i+2){
//				System.out.println(i);
//	}
//		for(int i=0; i<10; i=i+2) {
//			System.out.println(i);
//		}
//	

//		for(int i = 3; i<=100; i++) {
//			System.out.println(i);
//		}

//		for(int i = 3; i<=100; i++)  //가로표시 println <<ln빼기
//			System.out.print(i);
//	    for(int i = 0; i<=100; i=i+2) {
//	    	System.out.println(i);
//	    }

		// 1부터 10까지 가로출력
		// 출력예시 1,2,3,4,5,6,7,8,9,10

//		for(int i = 1; i<=10; i=i+1){if (i==10) {
//		 System.out.print(i);
//		}else {
//			System.out.print(i +",");
//		}
//	

//     	int sum = 6;
//		
//		sum = sum +1; 
//		sum = sum +2;
//		sum = sum +3;
//		sum = sum +4;
//		sum = sum +5;
//		sum = sum +6;
//		sum = sum +7;
//		sum = sum +8;
//		sum = sum +9;
//		sum = sum +10;
//	
//		System.out.println(sum);

//		for(int i = 0; i<=100; i++ ) {sum=sum+i;}{
//			
//		
//        System.out.println(sum);	
//		}
//	  for(int i = 0; i<=100; i++ ) {sum=sum+i;}{

//    System.out.println(sum);}	 

//    	for(int i = 0; i<=100; i++ )  System.out.println(sum=sum+i);
//		 == 1
//		    3
//		 	6
//        	10	
//	  		15
//	
//
//	
		// 4 * 1 = 4
		// 4 * 2 = 8
		// ....
		// 4 * 9 = 36
//     	int dan =2;
//  
//		for(int i = 1; i < 10 ; i++ ) {
//     		System.out.println(dan+" * " +i+" = "+(2*i));
//     	}
//		

//		// 1~100까지 3의 배수 갯수출력
//		int cnt = 0;
//		for(int i=1; i<=100; i++){
//	if( i % 3 ==0){
//			cnt = cnt + 1; //=cnt++
//		}
//		}
//		System.out.println(cnt);
//		

//		// 1~100까지 3의 3의 배수 갯수, 5의 배수 갯수
//		int cnt1 = 0;
//		int cnt2 = 0;
//
//		// 출력예시)3의 배수 ~~개
//		// 출력예시)5의 배수 ~~개
//
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				cnt1++;
//			}
//			if (i % 5 == 0) {
//				cnt2++;
//			}
//			
//		}
//		System.out.println("3의배수 " + cnt1 + "개");
//		System.out.println("5의배수 " + cnt2 + "개");
//
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇 부터>");
//		int a = sc.nextInt();
//		System.out.println("몇 까지");
//		int b = sc.nextInt();
//		
//		int sum = 0;
//		for(int i=a; i<=b; i++) {
//			sum = sum + 1;
//		}
//		System.err.println(sum);
//		
		// 피즈버즈
		// 입력받은 수 부터 입력받은 수 까지 출력하는데, 3의 배수는 피즈 5의 배수는 버즈 3,5배수는 피즈버즈
		// 예시)
		// 1
		// 2
		// 피즈
		// 4
		// 버즈
		// 피즈
		// 7
		// 8 
		// 피즈
		// 버즈
		
		
		
		
		Scanner sc = new Scanner(System.in); // 콘솔에 나타내기하는 명령어
		System.out.println("몇 부터>"); //콜솔에 프린트
		int a = sc.nextInt(); //입력하게하는 값
	    System.out.println("몇 까지"); // 콘솔에 프린트
		int b = sc.nextInt(); //입력하게 하는 값
		
		for(int i=a; i<=b; i++){            // a를 1로 입력했을때 i=1  < 1부터, b를100으로 입력했을때 i는 100보다 작거나 크다 
			if(i%3==0 && i%5==0) { //i가 3의 배수거나 5의 배수 일때 
				System.out.println("피즈버즈"); //피즈버즈로 출력
			}else if (i % 3==0) {System.out.println("피즈"); //i가 3의 배수일때 피즈로 출력
			}else if (i % 5==0) {System.out.println("버즈"); //i가 5의 배수일때 버즈로 출력
			}else {System.out.println(i); //3이나5의배수가아닐때 i값 출력
			}
		}
		
				
				// 복습하기
				
				
				
				
		
		
		
		
	}
    }
