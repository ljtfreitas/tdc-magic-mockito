package com.github.ljtfreitas.tdc.mockito.address;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.github.ljtfreitas.tdc.mockito.address.AddressSearch;
import com.github.ljtfreitas.tdc.mockito.address.AddressSearchService;

@RunWith(MockitoJUnitRunner.class)
public class Sample5 {

	// mock injection

	@Mock
	private AddressSearchService mockAddressSearchService;

	@InjectMocks
	private AddressSearch addressSearch;

	@Test
	public void shouldFindAddressByZipCode() {
		// addressSearch pronto para uso, com o mockAddressSearchService injetado
	}
}
