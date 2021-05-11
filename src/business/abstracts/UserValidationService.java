package business.abstracts;

import java.rmi.RemoteException;

import entities.Player;

public interface UserValidationService {
	boolean validate(Player player) throws RemoteException;
}
