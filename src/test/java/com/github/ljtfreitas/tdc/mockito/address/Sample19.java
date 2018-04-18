package com.github.ljtfreitas.tdc.mockito.address;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Sample19 {

	// verify

	@Mock
	private AddressSearchService mockAddressSearchService;

	@Test
	public void shouldFindAddressByZipCode() {
		mockAddressSearchService.searchByZipCode("12345678");

		verify(mockAddressSearchService).searchByZipCode("12345678");

		verify(mockAddressSearchService, atLeastOnce()).searchByZipCode("12345678");

		verify(mockAddressSearchService, atLeast(1)).searchByZipCode("12345678");

		verify(mockAddressSearchService, atMost(1)).searchByZipCode("12345678");

		verify(mockAddressSearchService, only()).searchByZipCode("12345678");

		verify(mockAddressSearchService, never()).searchByZipCode("12345678");
	}
}
