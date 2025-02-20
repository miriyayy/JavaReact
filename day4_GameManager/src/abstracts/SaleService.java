package abstracts;

import entities.Game;
import entities.GameCampaign;
import entities.Player;

public interface SaleService {

	void sale(Game Game);

	void sellGame(Player Player, GameCampaign GameCampaign);
}
