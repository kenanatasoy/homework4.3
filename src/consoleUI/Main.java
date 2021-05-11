package consoleUI;

import java.rmi.RemoteException;

import business.concretes.PlayerManager;
import core.MernisManagerAdapter;
import entities.Player;


public class Main {

	public static void main(String[] args) throws RemoteException {
		
		Player player = new Player(1, 5654664643L, 1997, "Kenan", "Atasoy");
		
		PlayerManager playerManager = new PlayerManager(new MernisManagerAdapter());
		
		playerManager.add(player);
		
	}

}
