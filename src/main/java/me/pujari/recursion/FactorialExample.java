package me.pujari.recursion;

public class FactorialExample {

	public int calculateFactorial(int numb) {
		return (numb == 1)? 1:numb * calculateFactorial(numb -1); 
	}
}
