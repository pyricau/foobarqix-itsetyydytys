package com.itsetyydytys.osef.configurable;

public class MultipleRule implements NumberRule {

	private final Rule rule;

	public MultipleRule(Rule rule) {
		this.rule = rule;
	}

	@Override
	public String apply(int number) {
		int dividor = rule.getDigit();
		return number % dividor == 0 ? rule.getContent() : "";
	}

}
