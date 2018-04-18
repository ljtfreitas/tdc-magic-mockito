package com.github.ljtfreitas.tdc.mockito.address;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Sample17 {

	// verify

	@Mock
	private AddressSearchService mockAddressSearchService;

	@InjectMocks
	private AddressSearch addressSearch;

	@Test
	public void shouldFindAddressByZipCode() {
		when(mockAddressSearchService.searchByZipCode("12345678"))
			.thenReturn(new AddressSearchResult("Rua Beira Rio", "São Paulo", "SP", "12345678"));

		Address address = addressSearch.findBy(new ZipCode("12345678"));

		assertEquals("Rua Beira Rio", address.getStreet());
		assertEquals("São Paulo", address.getCity());
		assertEquals("SP", address.getState());
		assertEquals(new ZipCode("12345678"), address.getZipCode());
	}
}
