package Managers;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import Entities.Sale;

import Services.SaleService;

public class SaleManager implements SaleService{

	@Override
	public void add(Sale sale, Player player, Game game, Campaign campaign) {
		System.out.println(player.getFirstName() + " isimli oyuncuya" +
				campaign.getName() + " kampanyasıyla " +
				game.getName() + " isimli oyun satıldı");
	}

	@Override
	public void add(Sale sale, Player player, Game game) {
		System.out.println(player.getFirstName() + " isimli oyuncuya" + game.getName() + " isimli oyun satıldı");
	}

	@Override
	public void delete(Sale sale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Sale sale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Sale get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sale[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

	

}
