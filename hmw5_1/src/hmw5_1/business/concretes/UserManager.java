package hmw5_1.business.concretes;

import java.util.List;

import hmw5_1.business.abstracts.UserCheckService;
import hmw5_1.business.abstracts.UserService;
import hmw5_1.core.AcService;
import hmw5_1.dataAccess.abstracts.UserDao;
import hmw5_1.entities.concretes.User;

public class UserManager implements UserService {

	private UserCheckService checkService;
	private UserDao dao;
	private AcService acService;
	private List<User> userDb;
	private User user;
	
	public UserManager(UserCheckService checkService,UserDao dao,AcService acService,List<User> userDb) {
		super();
		this.checkService = checkService;
		this.dao = dao;
		this.acService = acService;
		this.userDb = userDb;
		
	}

	@Override
	public void register(User user) {
		
		if(checkService.checkAllOfThem(user, this.userDb)){
			dao.add(user);
			System.out.println("Hosgeldiniz!!!");
			System.out.println("-----------------");
			
		}
		
		
		
		}

	@Override
	public void login(User user, List<User> userDb) {
		
		this.user = dao.get(user.getId(), userDb);
		if(this.user == null) {
			System.out.println("Once sisteme kayit olmalisin.");
		}else {
			System.out.println(this.user.getFirstName()+" , giris basarili.");
		}
		
		
		
	}

	@Override
	public void registerViaGoogle(User user) {
		
		if(checkService.checkAllOfThem(user, this.userDb)){
			acService.addViaAccount(user);
			System.out.println("Hosgeldiniz!!!");
			
			
			
		}
	}

	@Override
	public void loginViaGoogle(User user, List<User> userDb) {
		
		this.user = dao.get(user.getId(), userDb);
		if(this.user == null) {
			System.out.println("Once sisteme kayit olmalisin.");
		}else {
			acService.loginViaAccount(user);
		}
		
	}

	
	
	
	
	
	
	
	
	
	
}
