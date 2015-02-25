package com.ceino.main;

public class A  implements Test {
	public void name(){
		System.out.println("My name is marita");
	}
	public void job(){
		System.out.println("I'm an intern");
	}

	
	@Override
	public void place() {
		// TODO Auto-generated method stub
		System.out.println("Im from ceino");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.name();
		//a.fullName();
		a.job();
		a.place();

	}
	

}
