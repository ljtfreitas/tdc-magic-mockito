package com.github.ljtfreitas.tdc.mockito.user;

import static org.mockito.Mockito.inOrder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Sample21 {

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

		InOrder inOrder = inOrder(mockUserRepository, mockEmailSender);

		inOrder.verify(mockUserRepository).save(user);
		inOrder.verify(mockEmailSender).send(ArgumentMatchers.<Email> notNull());
	}
}
