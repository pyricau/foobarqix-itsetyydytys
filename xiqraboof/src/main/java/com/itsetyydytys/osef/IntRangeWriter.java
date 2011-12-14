package com.itsetyydytys.osef;

import java.io.PrintStream;

public class IntRangeWriter {

	private final FooBarQixor numberProcessor;
	private final PrintStream out;

	public IntRangeWriter(FooBarQixor numberProcessor, PrintStream out) {
		this.numberProcessor = numberProcessor;
		this.out = out;
	}

	/**
	 * 
	 * @param start
	 * @param inclusiveEnd
	 * @throws IllegalArgumentException
	 *             if start is greater than inclusiveEnd
	 */
	public void writeRange(int start, int inclusiveEnd) {
		if (start > inclusiveEnd) {
			throw new IllegalArgumentException("start should not be greater than inclusiveEnd");
		}
		for (int number = start; number <= inclusiveEnd; number++) {
			out.println(numberProcessor.process(number));
		}
	}

}
