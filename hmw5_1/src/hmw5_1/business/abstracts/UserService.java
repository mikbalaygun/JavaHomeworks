package hmw5_1.business.abstracts;

import java.util.List;

import hmw5_1.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user,List<User> userDb);
	void registerViaGoogle(User user);
	void loginViaGoogle(User user, List<User> userDb);
}
