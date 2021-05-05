package Services;

import java.rmi.RemoteException;

import Entities.Player;

public interface PlayerService {
	
	void add(Player player) throws RemoteException;
	void delete(Player player);
	void update(Player player);
	Player get();
	Player[] getAll();
	
}
