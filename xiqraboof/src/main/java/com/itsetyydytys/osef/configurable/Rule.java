package com.itsetyydytys.osef.configurable;

public class Rule {

	private final int digit;
	private final String content;

	public Rule(int digit, String content) {
		this.digit = digit;
		this.content = content;
	}

	public int getDigit() {
		return digit;
	}

	public String getContent() {
		return content;
	}

}
