package Services;

import java.rmi.RemoteException;

import Entities.Player;

public interface MernisService {
	boolean validate(Player player) throws RemoteException;
}
