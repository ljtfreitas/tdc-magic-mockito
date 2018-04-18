package com.github.ljtfreitas.tdc.mockito.address;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Sample14 {

	// mock configuration - answers (deep stubs)

	@Mock
    private RestClient mockRestClient;

    @InjectMocks
    private ApiAddressSearchService webServiceAddressSearchService;

	@Test
	public void test() {
		String zipCode = "12345678";

        AddressSearchResult expected = new AddressSearchResult("Rua Beira Rio", "São Paulo", "SP", "12345678");

        when(mockRestClient.target("http://my.service")
            .path("postal_code")
            .path(zipCode)
            .request()
            .get())
        .thenReturn(expected);

        AddressSearchResult result = webServiceAddressSearchService.searchByZipCode(zipCode);

        assertEquals(expected.toString(), result.toString());
	}
}
