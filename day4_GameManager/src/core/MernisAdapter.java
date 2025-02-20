package core;

import abstracts.PlayerService;
import entities.Player;

public class MernisAdapter implements PlayerService {

	public boolean checkIfRealPerson(Player Player) {

		return true;// simulation
	}

	@Override
	public void add(Player Player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Player Player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Player Player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Player Player) {
		// TODO Auto-generated method stub
		
	}
}