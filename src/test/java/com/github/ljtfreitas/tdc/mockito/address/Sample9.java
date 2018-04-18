package com.github.ljtfreitas.tdc.mockito.address;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.github.ljtfreitas.tdc.mockito.address.AddressSearch;
import com.github.ljtfreitas.tdc.mockito.address.AddressSearchService;
import com.github.ljtfreitas.tdc.mockito.address.ZipCodeNotFoundException;

@RunWith(MockitoJUnitRunner.class)
public class Sample9 {

	// mock configuration - exception

	@Mock
	private AddressSearchService mockAddressSearchService;

	@InjectMocks
	private AddressSearch addressSearch;

	@Test
	public void shouldFindAddressByZipCode() {
        String zipCode = "12345678";

        when(mockAddressSearchService.searchByZipCode(zipCode))
        	.thenThrow(ZipCodeNotFoundException.class);

        //ou

        when(mockAddressSearchService.searchByZipCode(zipCode))
        	.thenThrow(new ZipCodeNotFoundException("zipcode not found"));

	}
}
