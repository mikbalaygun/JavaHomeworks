package hmw5_1.google;


import hmw5_1.entities.concretes.User;

public interface GoogleAcService {
	void addViaAccount(User user);
	void loginViaAccount(User user);
}
