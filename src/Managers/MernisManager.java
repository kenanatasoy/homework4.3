package Managers;

import Entities.Player;
import Services.MernisService;

public class MernisManager implements MernisService{

	@Override
	public boolean validate(Player player) {
		System.out.println(player.getFirstName() + " is validated to register");
		return true;
	}
	
}
