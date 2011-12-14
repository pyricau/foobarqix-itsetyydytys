package com.itsetyydytys.osef.initial;

import com.itsetyydytys.osef.FooBarQixor;

public class InitialFooBarQixor implements FooBarQixor {

	@Override
	public String process(int number) {

		StringBuilder result = new StringBuilder();
		String numberAsString = Integer.toString(number);

		if (number % 3 == 0) {
			result.append("Foo");
		}

		char lastChar = numberAsString.charAt(numberAsString.length() - 1);
		if (lastChar == '0' || lastChar == '5') {
			result.append("Bar");
		}

		if (number % 7 == 0) {
			result.append("Qix");
		}

		for (int i = 0; i < numberAsString.length(); i++) {
			char checkedChar = numberAsString.charAt(i);
			if (checkedChar == '3') {
				result.append("Foo");
			} else if (checkedChar == '5') {
				result.append("Bar");
			} else if (checkedChar == '7') {
				result.append("Qix");
			}
		}

		if (result.length() == 0) {
			result.append(numberAsString);
		}
		return result.toString();
	}
}
