package com.github.ljtfreitas.tdc.mockito.address;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Sample12 {

	// mock configuration - answers (smart nulls)

	@Mock
	private AddressSearchService mockAddressSearchService;

	@InjectMocks
	private AddressSearch addressSearch;

	@Test
	public void test() {
		Address address = addressSearch.findBy(new ZipCode("12345678"));

		//...
	}
}
