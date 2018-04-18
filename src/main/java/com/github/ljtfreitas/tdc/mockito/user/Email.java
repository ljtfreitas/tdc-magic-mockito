package com.github.ljtfreitas.tdc.mockito.user;

public class Email {

	private String receiverAddress;
	private String subject;
	private String body;

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setSubject(String subject) {
		this.subject = subject;

	}

	public String getSubject() {
		return subject;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getBody() {
		return body;
	}
}
