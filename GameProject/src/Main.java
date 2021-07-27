import java.rmi.RemoteException;

import Adapter.MernisAdapter;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		User user = new User(1, "Lezgin", "Tekay", "12345678901", 1968, "tekay.lezgin@yandex.com");

		Game game = new Game(1, "Witcher 3 ", "RYO ", 18.0);

		Campaign campaign = new Campaign(1, "Summer Campaign", 20, "25/10/2021");

		UserManager userManager = new UserManager(new MernisAdapter());
		userManager.add(user);

		System.out.println("---------------------------------------");

	}
}