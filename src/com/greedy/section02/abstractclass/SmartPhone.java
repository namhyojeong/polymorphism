package com.greedy.section02.abstractclass;

public class SmartPhone extends Product {
	
	public SmartPhone() {
		System.out.println("SmartPhone 클래스의 기본생성자 호출됨");
	}
	
	@Override
	public void abstMethod() {
		System.out.println("Product 클래스의 abstMethod 오버라이딩 한 메소드 호출");
	}

}
