package hmw3_2;

public class UserManager {
	
	public void addToSystem(User user) {
		user.setSigned(true);
		System.out.println(+user.getId()+" id'li kullan�c� kaydedildi.");
	}
	
	public void removeToSystem(User user) {
		user.setSigned(false);
		System.out.println(user.getId()+" id'li kullan�c� silindi.");
	}
}
