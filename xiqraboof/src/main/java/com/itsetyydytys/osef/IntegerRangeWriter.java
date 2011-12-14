package com.itsetyydytys.osef;

import java.io.PrintStream;

import com.itsetyydytys.osef.integerbomb.MaryPoppins;

/**
 * This range writer uses an Integer instead of an int. It is therefore sensible to {@link MaryPoppins}
 */
public class IntegerRangeWriter implements RangeWriter {

	private final FooBarQixor numberProcessor;
	private final PrintStream out;

	public IntegerRangeWriter(FooBarQixor numberProcessor, PrintStream out) {
		this.numberProcessor = numberProcessor;
		this.out = out;
	}

	@Override
	public void writeRange(int start, int inclusiveEnd) {
		if (start > inclusiveEnd) {
			throw new IllegalArgumentException("start should not be greater than inclusiveEnd");
		}

		for (int number = start; number <= inclusiveEnd; number++) {
			Integer asInteger = number;
			out.println(numberProcessor.process(asInteger));
		}
	}

}
