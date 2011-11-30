package com.itsetyydytys.osef;

import java.io.PrintStream;

public class Main {

	public static void main(String... args) {
		NumberProcessor numberProcessor = new NumberProcessor();
		PrintStream out = System.out;
		IntRangeWriter fooBarQixWriter = new IntRangeWriter(numberProcessor, out);
		fooBarQixWriter.writeRange(1, 100);
	}

}
