package ch06.exam01;	//package 선언

public class Car {	//다른 클래스에서 이용할 목적으로 설계되있는 클래스 => 라이브러리용 클래스(설계도)
	//0823
	public int run(int a, int b){
		int c = a+b;
		return c; //리턴 타입이 int 이므로 같은 타입의 return 값이 있어야 함.
	}
	private int minus(int x, int y){
		int c = x-y;
		return c;
	}
}
