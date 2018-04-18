package com.github.ljtfreitas.tdc.mockito.address;

public class ApiAddressSearchService implements AddressSearchService {

    private final RestClient restClient;

    public ApiAddressSearchService(RestClient restClient) {
        this.restClient = restClient;
    }

    public AddressSearchResult searchByZipCode(String zipCode) {
        return restClient.target("http://my.service")
            .path("postal_code")
            .path(zipCode)
            .request()
            .get();
    }

	public String searchZipCodeByAddress(String street, String city, String state) {
		return null;
	}

}
