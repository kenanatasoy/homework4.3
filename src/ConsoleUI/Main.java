package ConsoleUI;

import Entities.Player;
import Managers.MernisManager;
import Managers.PlayerManager;
import Services.PlayerService;

import java.time.LocalDate;


public class Main {

	public static void main(String[] args) {
		
		Player player = new Player(1, 34453423, LocalDate.of(1997, 07, 10), "Kenan", "Atasoy");
		
		MernisManager mernisManager = new MernisManager();
		
		PlayerManager playerManager = new PlayerManager(mernisManager);
		
		playerManager.add(player);
		
	}

}
