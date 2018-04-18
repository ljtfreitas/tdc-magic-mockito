package com.github.ljtfreitas.tdc.mockito.address;

public interface AddressSearchService {

	AddressSearchResult searchByZipCode(String string);

	String searchZipCodeByAddress(String street, String city, String state);
}
