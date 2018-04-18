package com.github.ljtfreitas.tdc.mockito.spy;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Sample25 {

	// spy

	@Spy
	private List<String> spiedList = new ArrayList<>();

	@Test
	public void test() {
		spiedList.add("one");
		spiedList.add("two");

		assertEquals(2, spiedList.size());

		when(spiedList.size()).thenReturn(100);

		assertEquals(100, spiedList.size());
	}
}
