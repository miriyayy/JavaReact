
import concretes.GameManager;
import concretes.PlayerManager;
import concretes.SaleManager;
import core.MernisAdapter;
import entities.Game;
import entities.GameCampaign;
import entities.Player;
import concretes.GameCampaignManager;

public class Main {

	public static void main(String[] args) {

		Player player1 = new Player(1, "Miray", "Mutlu", "18.07.2002", "1111111");
		Player player2 = new Player(2, "Gizem", "Ak", "23.03.2003", "2222222");
		PlayerManager playerManager = new PlayerManager(new MernisAdapter());

		playerManager.add(player1);
		playerManager.delete(player2);

		Game game1 = new Game(1,"LOL","10000");
		GameManager gameManager = new GameManager();
		gameManager.add(game1);

		GameCampaign campaign1 = new GameCampaign(1, "Winter Campaign", "500");
		GameCampaignManager campaignManager = new GameCampaignManager();
		campaignManager.add(campaign1);

		SaleManager saleManager = new SaleManager();
		saleManager.sellGame(player2, campaign1);
	}

}
