package com.balancedbracket.main;

import com.balancedbracket.service.BalancedBracket;

public class BracketMain {

	public static void main(String[] args) {
		
		String bracketArr = "(){}[]";
		
		BalancedBracket balancedBracket = new BalancedBracket();
		boolean response = balancedBracket.checkBalance(bracketArr);
		
		if(response) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");

	}

}
