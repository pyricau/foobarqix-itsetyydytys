package com.itsetyydytys.osef.configurable;

import java.util.List;

import com.itsetyydytys.osef.FooBarQixor;

public class ConfigurableFooBarQixor implements FooBarQixor {

	private final List<NumberRule> numberRules;

	public ConfigurableFooBarQixor(List<NumberRule> numberRules) {
		this.numberRules = numberRules;
	}

	@Override
	public String process(int number) {
		StringBuilder result = new StringBuilder();

		for (NumberRule numberRule : numberRules) {
			String content = numberRule.apply(number);
			result.append(content);
		}

		return result.length() > 0 ? result.toString() : Integer.toString(number);
	}
}
