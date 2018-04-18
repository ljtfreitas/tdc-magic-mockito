package com.github.ljtfreitas.tdc.mockito.user;

public class UserPasswordService {

	private UserRepository userRepository;
	private EmailSender emailSender;

	public UserPasswordService(UserRepository userRepository, EmailSender emailSender) {
		this.userRepository = userRepository;
		this.emailSender = emailSender;
	}

	public void changePassword(User user, String newPassword) {
		String encryptNewPassword = Crypto.encrypt(newPassword);

		user.setPassword(encryptNewPassword);

		userRepository.save(user);

		Email email = new Email();
		email.setReceiverAddress(user.getEmail());
		email.setSubject("Alteração de senha");
		email.setBody("Sua senha foi alterada com sucesso");

		emailSender.send(email);
	}
}
