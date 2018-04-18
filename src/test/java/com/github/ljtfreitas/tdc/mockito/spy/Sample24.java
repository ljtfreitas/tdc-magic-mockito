package com.github.ljtfreitas.tdc.mockito.spy;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Sample24 {

	// spy

	@Test
	public void test() {
		List<String> list = new ArrayList<String>();

		List<String> spiedList = Mockito.spy(list);

        spiedList.add("one");
        spiedList.add("two");

        assertEquals(2, spiedList.size());

        when(spiedList.size()).thenReturn(100);

        assertEquals(100, spiedList.size());
	}
}
