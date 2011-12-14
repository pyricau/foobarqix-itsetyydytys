package com.itsetyydytys.osef.configurable;

import static java.lang.Character.forDigit;

public class CharacterRule {

	private static final int DIGIT_BASE_TEN_RADIX = 10;
	private final Rule rule;

	public CharacterRule(Rule rule) {
		this.rule = rule;
	}

	public boolean matches(char character) {
		int digit = rule.getDigit();
		return character == forDigit(digit, DIGIT_BASE_TEN_RADIX);
	}

	String content() {
		return rule.getContent();
	}
}
