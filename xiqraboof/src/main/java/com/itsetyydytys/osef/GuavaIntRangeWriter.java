package com.itsetyydytys.osef;

import static com.google.common.collect.DiscreteDomains.integers;

import java.io.PrintStream;

import com.google.common.collect.Range;
import com.google.common.collect.Ranges;

public class GuavaIntRangeWriter implements RangeWriter {

	private final FooBarQixor numberProcessor;
	private final PrintStream out;

	public GuavaIntRangeWriter(FooBarQixor numberProcessor, PrintStream out) {
		this.numberProcessor = numberProcessor;
		this.out = out;
	}

	@Override
	public void writeRange(int start, int inclusiveEnd) {
		if (start > inclusiveEnd) {
			throw new IllegalArgumentException("start should not be greater than inclusiveEnd");
		}

		Range<Integer> range = Ranges.closed(start, inclusiveEnd);

		for (Integer value : range.asSet(integers())) {
			out.println(numberProcessor.process(value));
		}
	}

}
