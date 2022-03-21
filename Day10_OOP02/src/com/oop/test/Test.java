package com.oop.test;

class A {
	public void funcA() {
		System.out.println("funcA");
	}
	public void funcExtra() {
		System.out.println("A");
	}
}
class B extends A{
	public void funcB() {
		System.out.println("funcB");
	}
	public void funcExtra() {
		System.out.println("B");
	}
}
class C extends A{
	public void funcC() {
		System.out.println("funcC");
	}
}


public class Test {
	public static void main(String[] args) {
		
		/*
		 * 다형성 : 다양한 형태의 성질을 가지는 것
		 * 한 class가 다양한 클래스의 성질을 가질 수 있는 것 
		 * (상속관계에서 부모 타입의 참조변수가 자식타입의 인스턴스를 담을 수 있는 것)
		 * 
		 */
		
		A a1 = new B();
		A a2 = new C();// 자신을 상속 받는 모든 자식형 인스턴스를 부모형 참조변수에 담을 수 있음
		
		a1.funcA();
		a1.funcExtra();
		a2.funcA();
		
		// 부모형 참조변수로 자식의 기능을 사용하게 하고 싶다면... -> 강제 형변환
		// a라는 참조변수(상위클래스)를 B형으로(자식클래스) 다운캐스팅
		((B)a1).funcB();
		((C)a2).funcC();
		
		// 반대로 자식 클래스형 참조변로 부모의 인스턴스을 사용가능?? 불가능
//		B b1 = new A();
//		C c1 = new A();
		
		// 부모 클래스가 더 작기 때문에 이렇게 형변환하면 안된다
//		B b2 = (B)(new A());
//		b2.funcA();
	}
}
