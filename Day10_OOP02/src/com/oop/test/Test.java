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
		 * ������ : �پ��� ������ ������ ������ ��
		 * �� class�� �پ��� Ŭ������ ������ ���� �� �ִ� �� 
		 * (��Ӱ��迡�� �θ� Ÿ���� ���������� �ڽ�Ÿ���� �ν��Ͻ��� ���� �� �ִ� ��)
		 * 
		 */
		
		A a1 = new B();
		A a2 = new C();// �ڽ��� ��� �޴� ��� �ڽ��� �ν��Ͻ��� �θ��� ���������� ���� �� ����
		
		a1.funcA();
		a1.funcExtra();
		a2.funcA();
		
		// �θ��� ���������� �ڽ��� ����� ����ϰ� �ϰ� �ʹٸ�... -> ���� ����ȯ
		// a��� ��������(����Ŭ����)�� B������(�ڽ�Ŭ����) �ٿ�ĳ����
		((B)a1).funcB();
		((C)a2).funcC();
		
		// �ݴ�� �ڽ� Ŭ������ �������� �θ��� �ν��Ͻ��� ��밡��?? �Ұ���
//		B b1 = new A();
//		C c1 = new A();
		
		// �θ� Ŭ������ �� �۱� ������ �̷��� ����ȯ�ϸ� �ȵȴ�
//		B b2 = (B)(new A());
//		b2.funcA();
	}
}
