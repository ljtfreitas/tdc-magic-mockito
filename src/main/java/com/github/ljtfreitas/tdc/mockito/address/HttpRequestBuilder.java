package com.github.ljtfreitas.tdc.mockito.address;

public interface HttpRequestBuilder {

	HttpRequestBuilder path(String path);

	HttpRequestBuilder method(String method);

	String execute();
}
