package com.github.ljtfreitas.tdc.mockito.address;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.github.ljtfreitas.tdc.mockito.address.AddressSearch;
import com.github.ljtfreitas.tdc.mockito.address.AddressSearchService;

@RunWith(MockitoJUnitRunner.class)
public class Sample4 {

	// mock creation - runner

	@Mock
	private AddressSearchService mockAddressSearchService;

	private AddressSearch addressSearch;

	@Before
	public void setup() {
		addressSearch = new AddressSearch(mockAddressSearchService); // mockAddressSearchService inicializado
	}

	@Test
	public void shouldFindAddressByZipCode() {
		// ...
	}
}
