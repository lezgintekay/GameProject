package Abstract;

	import java.rmi.RemoteException;

	import Entities.User;

	public interface UserCheckService {
		
		boolean checkIfRealPlayer(User user) throws NumberFormatException, RemoteException;
	}
	
