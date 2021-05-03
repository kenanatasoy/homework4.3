package ConsoleUI;

import Entities.Player;
import Managers.MernisManager;
import Managers.PlayerManager;

import java.time.LocalDate;


public class Main {

	public static void main(String[] args) {
		Player player = new Player(1, 34453423, LocalDate.now(), "Kenan", "Atasoy");
		
		MernisManager mernisManager = new MernisManager();
		
		PlayerManager playerManager = new PlayerManager(mernisManager);
		
		playerManager.add(player);
		
	}

}
