package ConsoleUI;

import java.rmi.RemoteException;

import Entities.Player;
import Managers.MernisManager;
import Managers.PlayerManager;





public class Main {

	public static void main(String[] args) throws RemoteException {
		
		Player player = new Player(1, 56345455345L, 1997, "Kenan", "Atasoy");
		
		MernisManager mernisManager = new MernisManager();
		
		PlayerManager playerManager = new PlayerManager(mernisManager);
		
		playerManager.add(player);
		
	}

}
