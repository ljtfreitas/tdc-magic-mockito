package com.github.ljtfreitas.tdc.mockito.address;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.github.ljtfreitas.tdc.mockito.address.AddressSearch;
import com.github.ljtfreitas.tdc.mockito.address.AddressSearchService;

public class Sample1 {

	// mock creation - dsl

	private AddressSearch addressSearch;

	@Before
	public void setup() {
		AddressSearchService mockAddressSearchService = Mockito.mock(AddressSearchService.class);

		addressSearch = new AddressSearch(mockAddressSearchService);
	}

	@Test
	public void shouldFindAddressByZipCode() {
		// ...
	}
}
