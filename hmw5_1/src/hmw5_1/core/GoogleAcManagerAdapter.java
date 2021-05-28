package hmw5_1.core;

import hmw5_1.entities.concretes.User;
import hmw5_1.google.GoogleAcManager;
import hmw5_1.google.GoogleAcService;

public class GoogleAcManagerAdapter implements AcService{

	GoogleAcService acService = new GoogleAcManager();
	
	@Override
	public void addViaAccount(User user) {
		
		acService.addViaAccount(user);
		
	}

	@Override
	public void loginViaAccount(User user) {
		
		acService.loginViaAccount(user);
		
	}

}
