package Services;

import Entities.Game;
import Entities.Player;
import Entities.Sale;

public interface SaleService {
	
	void add(Sale sale, Player player, Game game);
	void delete(Sale sale);
	void update(Sale sale);
	Sale get();
	Sale[] getAll();

}
