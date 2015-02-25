package com.ceino.main;

public class A extends B implements Test {
	public void name(){
		System.out.println("My name is marita");
	}
	public void job(){
		System.out.println("I'm an intern");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.name();
		a.job();
		a.fullName();

	}

}
