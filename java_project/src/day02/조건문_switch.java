package day02;

import java.util.Scanner;

public class 조건문_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자입력>");
//        int a = sc.nextInt();
//        String a = sc.next();
//        
////        switch(a) {
//        case "1": 
//        	System.out.println("1을 선택하였습니다");
//        	break;
//        case "2":
//        	System.out.println("2를 선택하였습니다");
//        	break;
//        case "3":
//        	System.out.println("3을 선택하였습니다");
//        	break;
//        	default:
//        	    System.out.println("1~3까지 입력하세요");
//        }
//		
//          
//		
	
	//  입력한 월의 영어 출력
		System.out.println("월입력>");
		int month = sc.nextInt();
		
//		switch(month) {
//		case 1:
//			System.out.println("January");
//	        break;	
//		case 2:
//			System.out.println("February");
//			break;
//		case 3:
//			System.out.println("March");
//            break;	
//		case 4:
//			System.out.println("April");
//		    break;
//		case 5:
//			System.out.println("May");
//            break;
//		case 6:
//			System.out.println("June");
//	        break;
//		case 7:
//			System.out.println("July");
//			break;
//		case 8:
//			System.out.println("August");
//			break;
//		case 9:
//			System.out.println("September");
//	        break;
//		case 10:
//			System.out.println("October");
//			break;
//		case 11:
//			System.out.println("November");
//			break;
//		case 12:
//			System.out.println("December");
//	        break;
//	        default:
//	        	System.out.println("1~12중에 입력하세요");
//	       
	    if (month == 1){
	        	System.out.println("Jan");
	    }else if(month == 2) {
			System.out.println("Fer");
		}else if(month == 3) {
			System.out.println("Mar");
		}else if(month == 4) {
			System.out.println("Apl");
		}else if(month == 5) {
			System.out.println("May");
		}else if(month == 6) {
			System.out.println("Jun");
		}else if(month == 7) {
			System.out.println("Jul");
		}else if(month == 8) {
			System.out.println("Aug");
		}else if(month == 9) {
			System.out.println("Sep");
		}else if(month == 10) {
			System.out.println("Oct");
		}else if(month == 11) {
			System.out.println("Nov");
		}else if(month == 12) {
			System.out.println("Dec");
		}else System.out.println("1~12중에 입력하세요");
		} 
	

}


