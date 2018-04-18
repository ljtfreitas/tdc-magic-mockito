package com.github.ljtfreitas.tdc.mockito.user;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Sample20 {

	// verify (in order)

	@Mock
	private UserRepository mockUserRepository;

	@Mock
	private EmailSender mockEmailSender;

	@InjectMocks
	private UserPasswordService userPasswordService;

	@Test
	public void shouldSaveNewPasswordAndSendEmailToUser() {
		User user = new User();

		userPasswordService.changePassword(user, "newPassword");

		verify(mockUserRepository).save(user);
		verify(mockEmailSender).send(ArgumentMatchers.<Email> notNull());
	}
}
