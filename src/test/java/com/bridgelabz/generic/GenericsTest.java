package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.Test;

public class GenericsTest {
	Generics max = new Generics();

	@Test
	public void givenThreeNumberWhenIntegerNumberShouldReturnMaxAtFirstPosition() {
		int value = max.findMax(9, 5, 6);
		Assert.assertEquals(9, value);
	}

	@Test
	public void givenThreeNumberWhenIntegerNumberShouldReturnMaxAtSecondPosition() {
		int value = max.findMax(5, 9, 6);
		Assert.assertEquals(9, value);
	}

	@Test
	public void givenThreeNumberWhenIntegerNumberShouldReturnMaxAtThirdPosition() {
		int value = max.findMax(6, 5, 9);
		Assert.assertEquals(9, value);
	}

	@Test
	public void givenThreeNumberWhenFloatNumberShouldReturnMaxAtFirstPosition() {
		float value = max.findMax(9.0f, 5.0f, 6.0f);
		Assert.assertEquals(9.0f, value, 0.0f);
	}

	@Test
	public void givenThreeNumberWhenFloatNumberShouldReturnMaxSecoundPosition() {
		float value = max.findMax(5.0f, 9.0f, 6.0f);
		Assert.assertEquals(9.0f, value, 0.0f);
	}

	@Test
	public void givenThreeNumberWhenFloatNumberShouldReturnMaxThirdPosition() {
		float value = max.findMax(9.0f, 5.0f, 11.0f);
		Assert.assertEquals(11.0f, value, 0.0f);
	}

	@Test
	public void givenThreeNumber_WhenStringValue_ShouldReturnMaxAtFirstPosition() {
		String value = max.findMax("peach", "apple", "banana");
		Assert.assertEquals("peach", value);
	}

	@Test
	public void givenThreeNumber_WhenStringValue_ShouldReturnMaxAtSecoundPosition() {
		String value = max.findMax("apple", "peach", "banana");
		Assert.assertEquals("peach", value);
	}

	@Test
	public void givenThreeNumber_WhenStringValue_ShouldReturnMaxAtThirdPosition() {
		String value = max.findMax("apple", "banana", "peach");
		Assert.assertEquals("peach", value);
	}
}