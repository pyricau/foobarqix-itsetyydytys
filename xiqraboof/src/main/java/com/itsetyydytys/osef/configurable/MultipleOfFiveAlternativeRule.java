package com.itsetyydytys.osef.configurable;

public class MultipleOfFiveAlternativeRule implements NumberRule {

	@Override
	public String apply(int number) {
		String numberAsString = Integer.toString(number);
		char lastChar = numberAsString.charAt(numberAsString.length() - 1);
		return lastChar == '0' || lastChar == '5' ? "Bar" : "";
	}

}
