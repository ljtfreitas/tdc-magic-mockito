package com.github.ljtfreitas.tdc.mockito.address;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Sample16 {

	// mock configuration - answers (self)

	@Mock(answer = Answers.RETURNS_SELF)
	private HttpRequestBuilder httpRequestBuilder;

	@Test
	public void test() {
		String expectedResponseBody = "response body";

		when(httpRequestBuilder.execute()).thenReturn(expectedResponseBody);

		String response = httpRequestBuilder
				.path("http://my.api.com/path")
				.method("GET")
				.execute();

		assertEquals(expectedResponseBody, response);
	}
}
