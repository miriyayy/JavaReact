package concretes;

import abstracts.PlayerService;
import entities.Player;

public class PlayerManager implements PlayerService{
	
	PlayerService userCheckManagementService;
	private PlayerService PlayerService;
	public PlayerManager(PlayerService PlayerService) {
		this.PlayerService= PlayerService;
	}

	@Override
	public void add(Player Player) {
		if(this.PlayerService.checkIfRealPerson(Player)) {
			System.out.println("Player is added: " + Player.getFirtName());
		}
		else {
			System.out.println("Player is not added: " + Player.getFirtName());
		}
		
	}

	@Override
	public void save(Player Player) {
		System.out.println("Player is saved: " + Player.getFirtName());
		
	}

	@Override
	public void delete(Player Player) {
		System.out.println("Player is deleted: " + Player.getFirtName());
	}

	@Override
	public void update(Player Player) {
		System.out.println("Player is updated: " + Player.getFirtName());
		
	}

	@Override
	public boolean checkIfRealPerson(Player Player) {
		// TODO Auto-generated method stub
		return false;
	}

}
