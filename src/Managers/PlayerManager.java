package Managers;
import Entities.Player;
import Services.MernisService;
import Services.PlayerService;

public class PlayerManager implements PlayerService {

	private MernisService mernisService;
	
	public PlayerManager(MernisService mernisService) {
		this.mernisService = mernisService;
	}
	
	
	@Override
	public void add(Player player) {
		if(this.mernisService.validate(player)) {
			System.out.println(player.getFirstName() + " is registered");
		}
		else {
			System.out.println(player.getFirstName() + " is not registered");
		}
		
	}

	@Override
	public void delete(Player player) {
		
		
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
