package hmw5_1.google;


import hmw5_1.entities.concretes.User;

public class GoogleAcManager implements GoogleAcService {
	
	
	@Override
	public void addViaAccount(User user) {
		// ToDo: email validation control before account org.
		System.out.println("Google hesabi ile kayit basarili, "+user.getFirstName());
		
	}

	@Override
	public void loginViaAccount(User user) {
		 System.out.println(user.getFirstName()+" , Google hesabi ile giris yapildi.");
		
	}
	
	

}
