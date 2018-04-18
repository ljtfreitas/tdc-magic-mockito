package com.github.ljtfreitas.tdc.mockito.user;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Sample23 {

	// verify (argument captor)

	@Mock
	private UserRepository mockUserRepository;

	@Mock
	private EmailSender mockEmailSender;

	@InjectMocks
	private UserPasswordService userPasswordService;

	@Captor
	private ArgumentCaptor<Email> emailCaptor;

	@Test
	public void shouldSaveNewPasswordAndSendEmailToUser() {
		User user = new User();
		user.setEmail("ljtfreitas@gmail.com");

		userPasswordService.changePassword(user, "newPassword");

		verify(mockEmailSender).send(emailCaptor.capture());

		Email email = emailCaptor.getValue();

		assertEquals(user.getEmail(), email.getReceiverAddress());
		assertEquals("Alteração de senha", email.getSubject());
		assertEquals("Sua senha foi alterada com sucesso", email.getBody());
	}
}
