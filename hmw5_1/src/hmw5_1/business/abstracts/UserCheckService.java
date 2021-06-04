package hmw5_1.business.abstracts;

import java.util.List;

import hmw5_1.entities.concretes.User;

public interface UserCheckService {
	boolean checkEmail(User user);
	boolean checkPassword(User user);
	boolean checkName(User user);
	boolean checkEmails(User user, List<User> userDb);
	boolean checkAllOfThem(User user, List<User> userDb);
}
