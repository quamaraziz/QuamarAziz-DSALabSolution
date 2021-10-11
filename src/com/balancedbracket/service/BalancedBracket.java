package com.balancedbracket.service;

import java.util.Stack;

public class BalancedBracket {

	Stack<Character> stack = new Stack<Character>();

	public boolean checkBalance(String bracketArr) {

		for (int i = 0; i < bracketArr.length(); i++) {
			char ch = bracketArr.charAt(i);

			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
				continue;
			}

			if (stack.isEmpty()) {
				return false;
			}

			char check;
			switch (ch) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}

		}
		return (stack.isEmpty());
	}

}
