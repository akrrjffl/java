package day09;

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 홍길동, 나이 90인 People객체 생성
		// ageUp메서드 사용(호출)
		// print메서드 사용(호출)
		People a = new People();
		a.setName("홍길동");
		a.setAge(90);
		a.ageUp();
		a.print();
		// 이름 : 이순신, 나이 80인 people객체 생성
		// ageUp1메서드 사용(호출)
		// print메서드 사용(호출)
		People b = new People("이순신", 80);
		b.ageUp1(5);
		b.print();
		
		System.out.println(a.getName()+"만 나이 : "+a.koreanAge());
		System.out.println(b.getName()+"만 나이 : "+b.koreanAge());

	}

}
