package com.github.ljtfreitas.tdc.mockito.extra;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Sample27 {

	// extra interfaces

	@Mock(extraInterfaces = BarService.class)
	private FooService mockFooService;

	@InjectMocks
	private MyType myType;

    @Test
    public void test() {
        myType.process();

        verify(mockFooService).foo();

        verify((BarService) mockFooService).bar();
    }
}
