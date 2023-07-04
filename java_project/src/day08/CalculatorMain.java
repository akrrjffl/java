package day08;

public class CalculatorMain {

	public static void main(String[] args) {
		// Calculator 객체만들고
		// 모든 메서드 호출하여 더하기 빼기 곱하기 나누기 값 출력
		
		// 객체이름 마음대로지정(car)
		Calculator car = new Calculator();
		car.num1 = 5;
		car.num2 = 3;
		car.sum();
		car.sub(7, 6);      // 매개변수(,)
		System.out.println(car.mul()); // 출력할거니까
		System.out.println(car.div(7, 3.4));

	}

}
