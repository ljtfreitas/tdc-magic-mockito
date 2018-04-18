package com.github.ljtfreitas.tdc.mockito.address;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.github.ljtfreitas.tdc.mockito.address.AddressSearch;
import com.github.ljtfreitas.tdc.mockito.address.AddressSearchService;

public class Sample2 {

	// mock creation - annotations

	@Mock
	private AddressSearchService mockAddressSearchService;

	private AddressSearch addressSearch;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);

		addressSearch = new AddressSearch(mockAddressSearchService); // mockAddressSearchService inicializado
	}

	@Test
	public void shouldFindAddressByZipCode() {
		// ...
	}
}
