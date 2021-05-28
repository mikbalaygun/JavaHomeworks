package hmw5_1.dataAccess.abstracts;

import java.util.List;

import hmw5_1.entities.concretes.User;

public interface UserDao {
	void add(User user);
	List<User> getAll(List<User> userDb);
	User get(int id,List<User> userDb);
}
