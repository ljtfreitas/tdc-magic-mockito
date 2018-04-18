package com.github.ljtfreitas.tdc.mockito.address;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

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
public class Sample7 {

	// mock configuration (including wrong argument)

	@Mock
	private AddressSearchService mockAddressSearchService;

	@InjectMocks
	private AddressSearch addressSearch;

	@Test
	public void shouldFindAddressByZipCode() {
        String zipCode = "12345678";

        AddressSearchResult addressResult = new AddressSearchResult("Rua Beira Rio", "São Paulo", "SP", "12345678");

        when(mockAddressSearchService.searchByZipCode(zipCode))
        	.thenReturn(addressResult);

        Address address = addressSearch.findBy(new ZipCode("12345678"));

		assertEquals("Rua Beira Rio", address.getStreet());
		assertEquals("São Paulo", address.getCity());
		assertEquals("SP", address.getState());
		assertEquals(new ZipCode("12345678"), address.getZipCode());
	}
}
