package day09;

public class Fruit {
	// 필드(인스턴스 변수)
	String name;
	String color;
	boolean isSeed;
	
	// 생성자 - 객체를 생성할 때 사용하는 것
	// 특징 1. 클래스이름과 동일
	//     2. 리턴타입이 없다
	public Fruit() { // 기본생성자
		
	}
	
	// 오버로딩 - 매개변수를 다르게 해서 동일한 이름을 가질 수 있는것
	public Fruit(String name) {
		this.name = name;
	}
	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public Fruit(String name, String color, boolean isSeed) {
		this.name = name;
		this.color = color;
		this.isSeed = isSeed;
	}
	
	// 메서드
	public void print() {
		System.out.println(name+"\t"+color+"\t"+isSeed);
	}

}
