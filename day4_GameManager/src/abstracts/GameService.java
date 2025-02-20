package abstracts;

import entities.Game;

public interface GameService {
	
	void add(Game Game);
	
	void save(Game Game);

	void delete(Game Game);

	void update(Game Game);

}
