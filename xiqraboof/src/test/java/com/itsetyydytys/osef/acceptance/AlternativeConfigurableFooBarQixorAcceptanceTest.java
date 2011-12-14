package com.itsetyydytys.osef.acceptance;

import org.junit.Before;

import com.itsetyydytys.osef.FooBarQixor;
import com.itsetyydytys.osef.FooBarQixorFactory;

public class AlternativeConfigurableFooBarQixorAcceptanceTest extends AcceptanceTest {

	public AlternativeConfigurableFooBarQixorAcceptanceTest(int input, String expected, String description) {
		super(input, expected, description);
	}

	@Before
	public void setup() {
		FooBarQixorFactory factory = new FooBarQixorFactory();
		FooBarQixor fooBarQixor = factory.buildAlternativeConfigurableFooBarQixor();
		setUnderTest(fooBarQixor);
	}

}
