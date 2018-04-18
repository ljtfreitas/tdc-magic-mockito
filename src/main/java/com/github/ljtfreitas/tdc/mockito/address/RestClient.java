package com.github.ljtfreitas.tdc.mockito.address;

public interface RestClient {

	RestClientTarget target(String string);

	public interface RestClientTarget {

		RestClientTarget path(String path);

		RestClientRequest request();

	}

	public interface RestClientRequest {

		<T> T get();

	}

}
