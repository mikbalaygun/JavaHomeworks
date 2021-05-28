package hmw5_1.core;

import hmw5_1.entities.concretes.User;

public interface AcService {
	void addViaAccount(User user);
	void loginViaAccount(User user);
}
