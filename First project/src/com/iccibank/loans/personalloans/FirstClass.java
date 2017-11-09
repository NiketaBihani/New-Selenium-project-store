package com.iccibank.loans.personalloans;

public class FirstClass implements NewInterface {
	
	int ab=5;
	public void hello() {
		System.out.println("Hello");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      FirstClass obj1=new FirstClass();
        System.out.println("This is my first program");
        obj1.hello();
        obj1.InterfaceMethod();
 
	}

	@Override
	public void InterfaceMethod() {
		// TODO Auto-generated method stub
		System.out.println("Implementing interface in Java in child class");
	}

}

//- object can call how many methods at a time?? is it mandatory to have separate object allocation for every new method.