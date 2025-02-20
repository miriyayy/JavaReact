package concretes;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService  {

	@Override
	public void add(Game Game) {
		System.out.println("Game added: " + Game.getGameName());
		
	}

	@Override
	public void save(Game Game) {
		System.out.println("Game saved: " + Game.getGameName());
		
	}

	@Override
	public void delete(Game Game) {
		System.out.println("Game deleted: " + Game.getGameName());
		
	}

	@Override
	public void update(Game Game) {
		System.out.println("Game updated: " + Game.getGameName());
		
	}

}
