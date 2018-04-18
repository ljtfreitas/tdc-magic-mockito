package com.github.ljtfreitas.tdc.mockito.address;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import com.github.ljtfreitas.tdc.mockito.address.AddressSearch;
import com.github.ljtfreitas.tdc.mockito.address.AddressSearchService;

public class Sample3 {

	// mock creation - rule

	@Rule
	public MockitoRule mockitoRule = MockitoJUnit.rule();

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
