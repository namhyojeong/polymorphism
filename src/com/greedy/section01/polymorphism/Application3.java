package com.greedy.section01.polymorphism;

public class Application3 {

	public static void main(String[] args) {

		/* 매개변수와 다형성 */
		Animal animal1 = new Rabbit();
		Animal animal2 = new Tiger();
		
		Application3 app3 = new Application3();
		app3.feed(animal1);
		app3.feed(animal2);
	}
	
	public void feed(Animal animal) {
		animal.eat();
	}

}
