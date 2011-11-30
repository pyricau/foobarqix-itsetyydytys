package com.itsetyydytys.osef;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class IntRangeWriterTest {

	private NumberProcessor numberProcessor;
	private PrintStream out;
	private IntRangeWriter writer;

	@Before
	public void setup() {
		numberProcessor = mock(NumberProcessor.class);
		out = mock(PrintStream.class);
		writer = new IntRangeWriter(numberProcessor, out);
	}

	@Test
	public void outputs_result_from_processor() {
		String mockedResult = "mockedResult";
		when(numberProcessor.process(anyInt())).thenReturn(mockedResult);

		writer.writeRange(0, 0);

		verify(out).println(mockedResult);
	}

	@Test
	public void println_is_called_n_times() {
		when(numberProcessor.process(anyInt())).thenReturn(anyString());

		writer.writeRange(1, 5);

		verify(out, times(5)).println(anyString());
	}

	@Test
	public void answers_are_transmitted() {
		final int start = 1;
		int inclusiveEnd = 5;
		when(numberProcessor.process(anyInt())).thenAnswer(new Answer<String>() {

			int counter = start - 1;

			@Override
			public String answer(InvocationOnMock invocation) throws Throwable {
				counter++;
				return Integer.toString(counter);
			}
		});

		writer.writeRange(start, inclusiveEnd);

		for (int i = start; i <= inclusiveEnd; i++) {
			verify(out).println(Integer.toString(i));
		}
	}

	@Test
	public void all_numbers_in_range_are_processed() {
		int start = 1;
		int inclusiveEnd = 5;
		writer.writeRange(start, inclusiveEnd);
		for (int i = start; i <= inclusiveEnd; i++) {
			verify(numberProcessor).process(i);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void start_greater_than_end_throws_exception() {
		writer.writeRange(12, 3);
	}

}
