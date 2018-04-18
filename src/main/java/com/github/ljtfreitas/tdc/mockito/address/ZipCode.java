package com.github.ljtfreitas.tdc.mockito.address;

import java.util.Objects;

public class ZipCode {

	private final String value;

	public ZipCode(String value) {
		this.value = value;
	}

	public String get() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ZipCode)) return false;

		return value.equals(((ZipCode) obj).value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
}
