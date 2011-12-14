package com.itsetyydytys.osef.acceptance;

import org.junit.Before;

import com.itsetyydytys.osef.FooBarQixor;
import com.itsetyydytys.osef.FooBarQixorFactory;

public class InitialFooBarQixorAcceptanceTest extends AcceptanceTest {

	public InitialFooBarQixorAcceptanceTest(int input, String expected, String description) {
		super(input, expected, description);
	}

	@Before
	public void setup() {
		FooBarQixorFactory factory = new FooBarQixorFactory();
		FooBarQixor fooBarQixor = factory.buildInitialFooBarQixor();
		setUnderTest(fooBarQixor);
	}

}
