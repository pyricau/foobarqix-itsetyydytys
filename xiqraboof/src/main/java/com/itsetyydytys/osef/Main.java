package com.itsetyydytys.osef;

import com.itsetyydytys.osef.integerbomb.MaryPoppins;

public class Main {

	public static void main(String... args) {

		MaryPoppins.supercalifragilisticexpialidocious(58);

		FooBarQixorFactory factory = new FooBarQixorFactory();
		FooBarQixor fooBarQixor = factory.buildConfigurableFooBarQixor();
		RangeWriter fooBarQixWriter = new IntegerRangeWriter(fooBarQixor, System.out);

		fooBarQixWriter.writeRange(-57, 42);
	}

}
