package abstracts;

import entities.Player;

public interface PlayerService {
	
	void add(Player Player);

	void save(Player Player);

	void delete(Player Player);

	void update(Player Player);

	boolean checkIfRealPerson(Player Player);

}
