package com.itsetyydytys.osef;

public class Main {

	public static void main(String... args) {

		FooBarQixorFactory factory = new FooBarQixorFactory();
		FooBarQixor fooBarQixor = factory.buildConfigurableFooBarQixor();
		IntRangeWriter fooBarQixWriter = new IntRangeWriter(fooBarQixor, System.out);

		fooBarQixWriter.writeRange(1, 100);
	}

}
