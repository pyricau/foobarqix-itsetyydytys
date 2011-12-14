package com.itsetyydytys.osef;

import java.util.Arrays;
import java.util.List;

import com.itsetyydytys.osef.configurable.CharacterCheckingNumberRule;
import com.itsetyydytys.osef.configurable.CharacterRule;
import com.itsetyydytys.osef.configurable.ConfigurableFooBarQixor;
import com.itsetyydytys.osef.configurable.MultipleOfFiveAlternativeRule;
import com.itsetyydytys.osef.configurable.MultipleRule;
import com.itsetyydytys.osef.configurable.NumberRule;
import com.itsetyydytys.osef.configurable.Rule;
import com.itsetyydytys.osef.initial.InitialFooBarQixor;
import com.itsetyydytys.osef.stupid.StupidFooBarQixor;

public class FooBarQixorFactory {

	public FooBarQixor buildStupidFooBarQixor() {
		return new StupidFooBarQixor();
	}

	public FooBarQixor buildInitialFooBarQixor() {
		return new InitialFooBarQixor();
	}

	public FooBarQixor buildConfigurableFooBarQixor() {

		Rule fooRule = new Rule(3, "Foo");
		Rule barRule = new Rule(5, "Bar");
		Rule qixRule = new Rule(7, "Qix");

		List<NumberRule> numberRules = Arrays.<NumberRule> asList( //
				new MultipleRule(fooRule), //
				new MultipleRule(barRule), //
				new MultipleRule(qixRule), //
				new CharacterCheckingNumberRule( //
						Arrays.asList( //
								new CharacterRule(fooRule), //
								new CharacterRule(barRule), //
								new CharacterRule(qixRule) //
						)) //
				);
		return new ConfigurableFooBarQixor(numberRules);
	}

	public FooBarQixor buildAlternativeConfigurableFooBarQixor() {

		Rule fooRule = new Rule(3, "Foo");
		Rule barRule = new Rule(5, "Bar");
		Rule qixRule = new Rule(7, "Qix");

		List<NumberRule> numberRules = Arrays.<NumberRule> asList( //
				new MultipleRule(fooRule), //
				new MultipleOfFiveAlternativeRule(), //
				new MultipleRule(qixRule), //
				new CharacterCheckingNumberRule( //
						Arrays.asList( //
								new CharacterRule(fooRule), //
								new CharacterRule(barRule), //
								new CharacterRule(qixRule) //
						)) //
				);
		return new ConfigurableFooBarQixor(numberRules);
	}
}
