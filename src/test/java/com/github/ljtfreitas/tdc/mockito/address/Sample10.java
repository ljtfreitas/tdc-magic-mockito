package com.github.ljtfreitas.tdc.mockito.address;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.github.ljtfreitas.tdc.mockito.address.Address;
import com.github.ljtfreitas.tdc.mockito.address.AddressSearch;
import com.github.ljtfreitas.tdc.mockito.address.AddressSearchService;
import com.github.ljtfreitas.tdc.mockito.address.ZipCode;

@RunWith(MockitoJUnitRunner.class)
public class Sample10 {

	// mock configuration - matchers

	@Mock
	private AddressSearchService mockAddressSearchService;

	@InjectMocks
	private AddressSearch addressSearch;

	@Before
	public void setup() {
		AddressSearchResult addressResult = new AddressSearchResult("Rua Beira Rio", "São Paulo", "SP", "12345678");

		when(mockAddressSearchService.searchByZipCode(anyString()))
			.thenReturn(addressResult);
	}

	@Test
	public void shouldFindAddressByZipCode() {
		Address address = addressSearch.findBy(new ZipCode("12345678"));

        assertEquals("Rua Beira Rio", address.getStreet());
        assertEquals("São Paulo", address.getCity());
        assertEquals("SP", address.getState());
        assertEquals(new ZipCode("12345678"), address.getZipCode());

	}
}
