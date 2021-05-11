package business.concretes;
import java.rmi.RemoteException;

import business.abstracts.PlayerService;
import business.abstracts.UserValidationService;
import entities.Player;

public class PlayerManager implements PlayerService {

	private UserValidationService userValidationService;
	
	public PlayerManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}
	
	
	@Override
	public void add(Player player) throws RemoteException {
		if(this.userValidationService.validate(player)) {
			System.out.println(player.getFirstName() + " is registered");
		}
		else {
			System.out.println(player.getFirstName() + " is not registered");
		}
		
	}

	@Override
	public void delete(Player player) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Player get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
