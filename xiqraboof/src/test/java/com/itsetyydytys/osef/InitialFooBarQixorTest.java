package com.itsetyydytys.osef;

import static java.util.Arrays.asList;
import static org.fest.assertions.Assertions.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.itsetyydytys.osef.initial.InitialFooBarQixor;

@RunWith(Parameterized.class)
public class InitialFooBarQixorTest {

	@Parameters
	public static Collection<Object[]> generateTestCases() {
		Object[][] testCases = { //
		//
				{ 13, "Foo", "if only contains 3 returns Foo" }, //
				{ 151, "Bar", "if only contains 5 returns Bar" }, //
				{ 74, "Qix", "if only contains 7 returns Qix" }, //
				{ 6, "Foo", "if is only multiple of 3 returns Foo" }, //
				{ 20, "Bar", "if is only multiple of 5 returns Bar" }, //
				{ 14, "Qix", "if is only multiple of 7 returns Qix" }, //
				{ 2, "2", "if does not match any rule returns input as string" }, //
				{ 3, "FooFoo", "if contains 3 and is multiple of 3 returns FooFoo" }, //
				{ 5, "BarBar", "if contains 5 and is multiple of 5 returns BarBar" }, //
				{ 7, "QixQix", "if contains 7 and is multiple of 7 returns BarBar" }, //
				{ 51, "FooBar", "Dividers have higher precedence than content: if is multiple of 3 and contains 5 returns FooBar" }, //
				{ 27, "FooQix", "Dividers have higher precedence than content: if is multiple of 3 and contains 7 returns FooQix" }, //
				{ 230, "BarFoo", "Dividers have higher precedence than content: if is multiple of 5 and contains 3 returns BarFoo" }, //
				{ 170, "BarQix", "Dividers have higher precedence than content: if is multiple of 5 and contains 7 returns BarQix" }, //
				{ 301, "QixFoo", "Dividers have higher precedence than content: if is multiple of 7 and contains 3 returns QixFoo" }, //
				{ 56, "QixBar", "Dividers have higher precedence than content: if is multiple of 7 and contains 5 returns QixBar" }, //
				{ 3257, "FooBarQix", "Content is matched in its appearing order: if contains 3, 5 and 7 returns FooBarQix" }, //
				{ 3758, "FooQixBar", "Content is matched in its appearing order: if contains 3, 7 and 5 returns FooQixBar" }, //
				{ 50317, "BarFooQix", "Content is matched in its appearing order: if contains 5, 3 and 7 returns BarFooQix" }, //
				{ 50713, "BarQixFoo", "Content is matched in its appearing order: if contains 5, 7 and 3 returns BarQixFoo" }, //
				{ 7351, "QixFooBar", "Content is matched in its appearing order: if contains 7, 3 and 5 returns QixFooBar" }, //
				{ 7531, "QixBarFoo", "Content is matched in its appearing order: if contains 7, 5 and 3 returns QixBarFoo" }, //
				{ 60, "FooBar", "Dividers are matched in ascending order: if multiple of 3 and 5 returns FooBar" }, //
				{ 21, "FooQix", "Dividers are matched in ascending order: if multiple of 3 and 7 returns FooQix" }, //
				{ 140, "BarQix", "Dividers are matched in ascending order: if multiple of 5 and 7 returns BarQix" }, //
				{ 420, "FooBarQix", "Dividers are matched in ascending order: if multiple of 3, 5 and 7 returns FooBarQix" }, //
				{ 15, "FooBarBar", "Test extracted from the spec" }, //
				{ 33, "FooFooFoo", "Test extracted from the spec" }, //
				{ -33, "FooFooFoo", "Test extracted from the spec" }, //
		};

		return asList(testCases);
	}

	private FooBarQixor underTest;

	private final int input;
	private final String expected;
	private final String description;

	public InitialFooBarQixorTest(int input, String expected, String description) {
		this.input = input;
		this.expected = expected;
		this.description = description;
	}

	@Before
	public void setUp() {
		underTest = new InitialFooBarQixor();
	}

	@Test
	public void when_given_input_returns_expected() {
		assertThat(underTest.process(input)).as(description).isEqualTo(expected);
	}

}
