package com.github.ljtfreitas.tdc.mockito.address;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.github.ljtfreitas.tdc.mockito.address.AddressSearch;
import com.github.ljtfreitas.tdc.mockito.address.AddressSearchService;

@RunWith(MockitoJUnitRunner.class)
public class Sample8 {

	// mock configuration - multiples returns

	@Mock
	private AddressSearchService mockAddressSearchService;

	@InjectMocks
	private AddressSearch addressSearch;

	@Test
	public void shouldFindAddressByZipCode() {
        String zipCode = "12345678";

        when(mockAddressSearchService.searchByZipCode(zipCode))
    		.thenReturn(new AddressSearchResult("Rua Beira Rio", "São Paulo", "SP", "12345678"),
    					new AddressSearchResult("Avenida Paulista", "São Paulo", "SP", "12345678"),
    					new AddressSearchResult("Avenida Faria Lima", "São Paulo", "SP", "876543210"));
        
        //ou

        when(mockAddressSearchService.searchByZipCode(zipCode))
        	.thenReturn(new AddressSearchResult("Rua Beira Rio", "São Paulo", "SP", "12345678"))
        	.thenReturn(new AddressSearchResult("Avenida Paulista", "São Paulo", "SP", "01234567"))
        	.thenReturn(new AddressSearchResult("Avenida Faria Lima", "São Paulo", "SP", "876543210"));

	}
}
