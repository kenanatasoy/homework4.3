package Managers;

import java.rmi.RemoteException;

import Entities.Player;
import Services.MernisService;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisManager implements MernisService{

	@Override
	public boolean validate(Player player) throws RemoteException{
		
		KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();
		
		
		return kpsPublicSoap.TCKimlikNoDogrula(player.getIdentityNumber(), player.getFirstName().toUpperCase(), 
				player.getLastName(), player.getBirthYear());
	}
	
}
