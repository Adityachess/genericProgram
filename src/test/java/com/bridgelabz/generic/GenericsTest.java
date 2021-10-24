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

}