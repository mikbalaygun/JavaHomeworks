package hmw5_1;

import java.util.ArrayList;
import java.util.List;

import hmw5_1.business.abstracts.UserCheckService;
import hmw5_1.business.abstracts.UserService;
import hmw5_1.business.concretes.UserCheckManager;
import hmw5_1.business.concretes.UserManager;
import hmw5_1.core.AcService;
import hmw5_1.core.GoogleAcManagerAdapter;
import hmw5_1.dataAccess.abstracts.UserDao;
import hmw5_1.dataAccess.concretes.HibernateUserDao;
import hmw5_1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		// db simule edilmistir
		List<User> userDb = new ArrayList<User>();
		
		User user1 = new User(1,"Mehmet","Ince","m@gmail.com","abc123");
		User user2 = new User(2,"A","Atay","a@gmail.com","123456");
		User user3 = new User(3,"Hasan","Yildiz","h@gmail.com","12345");
		User user4 = new User(4,"Hamza","Er","y@gmail.com","678543");
		User user5 = new User(5,"Melisa","Uzun","me@gmail.com","987654");
		User user6 = new User(6,"Nazli","Aygun","n@gmail.com","098765");
		
		userDb.add(user1);
		
		UserDao dao = new HibernateUserDao();
		
		
		
		UserCheckService service = new UserCheckManager();
		
		
		AcService acService = new GoogleAcManagerAdapter();
		
		
		
		UserService userService = new UserManager(service,dao,acService,userDb);
		
		userService.register(user1);
		
		userService.register(user2);
		userDb.add(user2);
		
		userService.register(user3);
		userDb.add(user3);
		
		userService.register(user4);
		userDb.add(user4);
		
		System.out.println("---------------------");
		
		userService.login(user4, userDb);
		userService.login(user5, userDb);
		
		System.out.println("---------------------");
		
		userService.registerViaGoogle(user6);
		
		
		System.out.println("---------------------");
		
		userService.loginViaGoogle(user4, userDb);
		
		
		
		
		
		
	}

}
