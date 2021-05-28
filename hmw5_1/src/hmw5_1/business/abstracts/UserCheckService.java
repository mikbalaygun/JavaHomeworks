package hmw5_1.business.abstracts;

import java.util.List;

import hmw5_1.entities.concretes.User;

public interface UserCheckService {
	Boolean checkEmail(User user);
	Boolean checkPassword(User user);
	Boolean checkName(User user);
	Boolean checkEmails(User user, List<User> userDb);
	Boolean checkAllOfThem(User user, List<User> userDb);
}
