package business.abstracts;

import entities.Game;
import entities.Player;
import entities.Sale;

public interface SaleService {
	
	void add(Sale sale, Player player, Game game);
	void delete(Sale sale);
	void update(Sale sale);
	Sale get();
	Sale[] getAll();

}
