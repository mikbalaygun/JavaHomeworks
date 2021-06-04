package hmw5_1.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import hmw5_1.business.abstracts.UserCheckService;
import hmw5_1.entities.concretes.User;

public class UserCheckManager implements UserCheckService {

	private Boolean confirm;
	
	@Override
	public boolean checkEmail(User user) {
		
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		return matcher.matches();
		
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length() < 6) {
			System.out.println(user.getFirstName()+" , Sifre en az 6 karakterden olusmalidir.");
			return false;
		}else {
			return true;
		}
	}
	

	@Override
	public boolean checkName(User user) {
		if(user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Ad veya soyad en az 2 karakterden olusmalidir.");
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public boolean checkEmails(User user, List<User> userDb) {
		
		userDb.forEach((usr) -> {
			if(user.getEmail() == usr.getEmail()) {
				System.out.println("Bu email daha onceden alinmis.Baska bir tane dene!");
				this.confirm = false;
				;
			}else {
				this.confirm = true;
			}
		});
		return confirm;
	}

	@Override
	public boolean checkAllOfThem(User user,List<User> userDb) {
		
		if(this.checkEmail(user) && this.checkName(user) && this.checkPassword(user) && this.checkEmails(user, userDb)){
			user.setIsValid(true);
			System.out.println("-----------------");
			System.out.println("Kullanici bilgileri gecerli.");
			return true;
			
		}else {
			user.setIsValid(false);
			return false;
		}

		}
	
	

}
