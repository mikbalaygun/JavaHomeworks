package hmw5_1.dataAccess.concretes;

import java.util.List;

import hmw5_1.dataAccess.abstracts.UserDao;
import hmw5_1.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	private User user;
	
	@Override
	public void add(User user) {
		
		System.out.println("Kullanici eklendi. "+user.getFirstName());
		
	}

	@Override
	public List<User> getAll(List<User> userDb) {
		return userDb;
	}
	

	@Override
	public User get(int id, List<User> userDb) {
		
		userDb.forEach((user) -> {
			if(user.getId()==id){
				this.user = user;
			}else {
				this.user = null;
			}
			
		});
		
		return this.user;
		
		
	}

	

}
