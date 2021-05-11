package core;

import java.rmi.RemoteException;

import business.abstracts.UserValidationService;
import entities.Player;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisManagerAdapter implements UserValidationService{

	@Override
	public boolean validate(Player player) throws RemoteException{
		
		KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();
		
		return kpsPublicSoap.TCKimlikNoDogrula(player.getIdentityNumber(), player.getFirstName().toUpperCase(), 
				player.getLastName(), player.getBirthYear());
	}
	
}
