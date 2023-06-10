package com.greedy.section02.abstractclass;

public abstract class Product {
	
	private int nonStaticField;
	private static int staticField;
	
	public Product() {
		nonStaticField = 1;
		System.out.println("Product 기본 생성자 호출됨");
	}

	public void printField() {
		System.out.println(nonStaticField);
		System.out.println(staticField);
	}
	
	public static void staticMethod() {
		System.out.println("static 메소드 호출함");
	}
	
	/* 추상메소드 
	 * 구현부가 없는 메소드
	 * 추상 메소드가 1개 이상 존재하는 경우 class에 abstract 키워드 필수
	 * 0개면 선택적으로 키워드 사용 가능
	 * */
	public abstract void abstMethod();
}
