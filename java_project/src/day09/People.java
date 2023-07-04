package day09;

public class People {
	private String name; // 이름
	private int age; // 나이
	
	// 기본생성자
	public People() {
		
	}
	// 전체필드를 다 받는 생성자
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 모든필드 get/set 메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// 모든필드 출력하는 print 메서드
	public void print() {
		System.out.println("이름\t나이");
		System.out.println("=============");
		System.out.printf("%S\t%d\n",name,age);
	}
	
	// 메서드명 : ageUp, 매개변수 : X, 리턴타입 : X, 실행문구는 age 1증가
	public void ageUp() {
		age++;
	}
	// 메서드명 : ageUp1, 매개변수 : 정수하나, 리턴타입 : X, 실행문구는 age 매개변수 만큼 증가
	public void ageUp1(int age) {
		this.age += this.age+age;
	}
	public int koreanAge() {
		return age-2;
	}

}
























