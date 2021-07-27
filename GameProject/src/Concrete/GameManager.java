package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " game has been added to the system");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " game was deleted from the system");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " game information updated");
	}


}
