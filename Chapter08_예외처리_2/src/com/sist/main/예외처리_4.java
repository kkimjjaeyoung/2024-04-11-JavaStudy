package com.sist.main;

import javax.naming.PartialResultException;

public class 예외처리_4 {
	public void display() throws NumberFormatException, NullPointerException, ArithmeticException{
		
	}
	public void print() throws NumberFormatException, NullPointerException, ArithmeticException{
		display();
	}
	public void print2() throws NumberFormatException, NullPointerException, ArithmeticException{
		display();	
	}
	public void print3() 
	{
		try {
			display();
		}catch(NumberFormatException e) {}
		catch(NullPointerException e) {}
		catch(ArithmeticException e) {}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
