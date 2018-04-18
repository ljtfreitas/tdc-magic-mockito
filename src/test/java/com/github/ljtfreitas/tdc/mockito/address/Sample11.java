package com.github.ljtfreitas.tdc.mockito.address;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.github.ljtfreitas.tdc.mockito.address.AddressSearch;
import com.github.ljtfreitas.tdc.mockito.address.AddressSearchService;

@RunWith(MockitoJUnitRunner.class)
public class Sample11 {

	// mock configuration - matchers (multiples arguments)

	@Mock
	private AddressSearchService mockAddressSearchService;

	@InjectMocks
	private AddressSearch addressSearch;

	@Test
	public void test() {
		when(mockAddressSearchService.searchZipCodeByAddress(anyString(), "São Paulo", "SP"))
			.thenReturn("012345678");

		//...
	}
}
