package com.itsetyydytys.osef.acceptance;

import static java.util.Arrays.asList;
import static org.fest.assertions.Assertions.assertThat;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.itsetyydytys.osef.FooBarQixor;

@RunWith(Parameterized.class)
public abstract class AcceptanceTest {

	@Parameters
	public static Collection<Object[]> generateTestCases() {
		Object[][] testCases = { //
		//
				{ 1, "1", "if input 1 returns 1" }, //
				{ 2, "2", "if input 2 returns 2" }, //
				{ 3, "FooFoo", "if input 3 returns FooFoo" }, //
				{ 4, "4", "if input 4 returns 4" }, //
				{ 5, "BarBar", "if input 5 returns BarBar" }, //
				{ 6, "Foo", "if input 6 returns Foo" }, //
				{ 7, "QixQix", "if input 7 returns QixQix" }, //
				{ 8, "8", "if input 8 returns 8" }, //
				{ 9, "Foo", "if input 9 returns Foo" }, //
				{ 10, "Bar", "if input 10 returns Bar" }, //
				{ 11, "11", "if input 11 returns 11" }, //
				{ 12, "Foo", "if input 12 returns Foo" }, //
				{ 13, "Foo", "if input 13 returns Foo" }, //
				{ 14, "Qix", "if input 14 returns Qix" }, //
				{ 15, "FooBarBar", "if input 15 returns FooBarBar" }, //
				{ 16, "16", "if input 16 returns 16" }, //
				{ 17, "Qix", "if input 17 returns Qix" }, //
				{ 18, "Foo", "if input 18 returns Foo" }, //
				{ 19, "19", "if input 19 returns 19" }, //
				{ 20, "Bar", "if input 20 returns Bar" }, //
				{ 21, "FooQix", "if input 21 returns FooQix" }, //
				{ 22, "22", "if input 22 returns 22" }, //
				{ 23, "Foo", "if input 23 returns Foo" }, //
				{ 24, "Foo", "if input 24 returns Foo" }, //
				{ 25, "BarBar", "if input 25 returns BarBar" }, //
				{ 26, "26", "if input 26 returns 26" }, //
				{ 27, "FooQix", "if input 27 returns FooQix" }, //
				{ 28, "Qix", "if input 28 returns Qix" }, //
				{ 29, "29", "if input 29 returns 29" }, //
				{ 30, "FooBarFoo", "if input 30 returns FooBarFoo" }, //
				{ 31, "Foo", "if input 31 returns Foo" }, //
				{ 32, "Foo", "if input 32 returns Foo" }, //
				{ 33, "FooFooFoo", "if input 33 returns FooFooFoo" }, //
				{ 34, "Foo", "if input 34 returns Foo" }, //
				{ 35, "BarQixFooBar", "if input 35 returns BarQixFooBar" }, //
				{ 36, "FooFoo", "if input 36 returns FooFoo" }, //
				{ 37, "FooQix", "if input 37 returns FooQix" }, //
				{ 38, "Foo", "if input 38 returns Foo" }, //
				{ 39, "FooFoo", "if input 39 returns FooFoo" }, //
				{ 40, "Bar", "if input 40 returns Bar" }, //
				{ 41, "41", "if input 41 returns 41" }, //
				{ 42, "FooQix", "if input 42 returns FooQix" }, //
				{ 43, "Foo", "if input 43 returns Foo" }, //
				{ 44, "44", "if input 44 returns 44" }, //
				{ 45, "FooBarBar", "if input 45 returns FooBarBar" }, //
				{ 46, "46", "if input 46 returns 46" }, //
				{ 47, "Qix", "if input 47 returns Qix" }, //
				{ 48, "Foo", "if input 48 returns Foo" }, //
				{ 49, "Qix", "if input 49 returns Qix" }, //
				{ 50, "BarBar", "if input 50 returns BarBar" }, //
				{ 51, "FooBar", "if input 51 returns FooBar" }, //
				{ 52, "Bar", "if input 52 returns Bar" }, //
				{ 53, "BarFoo", "if input 53 returns BarFoo" }, //
				{ 54, "FooBar", "if input 54 returns FooBar" }, //
				{ 55, "BarBarBar", "if input 55 returns BarBarBar" }, //
				{ 56, "QixBar", "if input 56 returns QixBar" }, //
				{ 57, "FooBarQix", "if input 57 returns FooBarQix" }, //
				{ 58, "Bar", "if input 58 returns Bar" }, //
				{ 59, "Bar", "if input 59 returns Bar" }, //
				{ 60, "FooBar", "if input 60 returns FooBar" }, //
				{ 61, "61", "if input 61 returns 61" }, //
				{ 62, "62", "if input 62 returns 62" }, //
				{ 63, "FooQixFoo", "if input 63 returns FooQixFoo" }, //
				{ 64, "64", "if input 64 returns 64" }, //
				{ 65, "BarBar", "if input 65 returns BarBar" }, //
				{ 66, "Foo", "if input 66 returns Foo" }, //
				{ 67, "Qix", "if input 67 returns Qix" }, //
				{ 68, "68", "if input 68 returns 68" }, //
				{ 69, "Foo", "if input 69 returns Foo" }, //
				{ 70, "BarQixQix", "if input 70 returns BarQixQix" }, //
				{ 71, "Qix", "if input 71 returns Qix" }, //
				{ 72, "FooQix", "if input 72 returns FooQix" }, //
				{ 73, "QixFoo", "if input 73 returns QixFoo" }, //
				{ 74, "Qix", "if input 74 returns Qix" }, //
				{ 75, "FooBarQixBar", "if input 75 returns FooBarQixBar" }, //
				{ 76, "Qix", "if input 76 returns Qix" }, //
				{ 77, "QixQixQix", "if input 77 returns QixQixQix" }, //
				{ 78, "FooQix", "if input 78 returns FooQix" }, //
				{ 79, "Qix", "if input 79 returns Qix" }, //
				{ 80, "Bar", "if input 80 returns Bar" }, //
				{ 81, "Foo", "if input 81 returns Foo" }, //
				{ 82, "82", "if input 82 returns 82" }, //
				{ 83, "Foo", "if input 83 returns Foo" }, //
				{ 84, "FooQix", "if input 84 returns FooQix" }, //
				{ 85, "BarBar", "if input 85 returns BarBar" }, //
				{ 86, "86", "if input 86 returns 86" }, //
				{ 87, "FooQix", "if input 87 returns FooQix" }, //
				{ 88, "88", "if input 88 returns 88" }, //
				{ 89, "89", "if input 89 returns 89" }, //
				{ 90, "FooBar", "if input 90 returns FooBar" }, //
				{ 91, "Qix", "if input 91 returns Qix" }, //
				{ 92, "92", "if input 92 returns 92" }, //
				{ 93, "FooFoo", "if input 93 returns FooFoo" }, //
				{ 94, "94", "if input 94 returns 94" }, //
				{ 95, "BarBar", "if input 95 returns BarBar" }, //
				{ 96, "Foo", "if input 96 returns Foo" }, //
				{ 97, "Qix", "if input 97 returns Qix" }, //
				{ 98, "Qix", "if input 98 returns Qix" }, //
				{ 99, "Foo", "if input 99 returns Foo" }, //
				{ 100, "Bar", "if input 100 returns Bar" }, //
		};

		return asList(testCases);
	}

	private FooBarQixor underTest;

	private final int input;
	private final String expected;
	private final String description;

	public AcceptanceTest(int input, String expected, String description) {
		this.input = input;
		this.expected = expected;
		this.description = description;
	}

	protected void setUnderTest(FooBarQixor underTest) {
		this.underTest = underTest;
	}

	@Test
	public void when_given_input_returns_expected() {
		assertThat(underTest.process(input)).as(description).isEqualTo(expected);
	}

}
