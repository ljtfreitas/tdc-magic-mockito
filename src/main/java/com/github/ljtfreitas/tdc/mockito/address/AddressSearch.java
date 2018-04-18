package com.github.ljtfreitas.tdc.mockito.address;

public class AddressSearch {

	private final AddressSearchService addressSearchService;

	public AddressSearch(AddressSearchService addressSearchService) {
		this.addressSearchService = addressSearchService;
	}

	public Address findBy(ZipCode zipCode) {
		AddressSearchResult result = addressSearchService.searchByZipCode(zipCode.get());

		Address address = new Address();
		address.setStreet(result.getStreet());
		address.setCity(result.getCity());
		address.setState(result.getState());
		address.setZipCode(new ZipCode(result.getZipCode()));

		return address;
	}
}
