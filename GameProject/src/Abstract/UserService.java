 package Abstract;

import java.rmi.RemoteException;
import Entities.User;

	public interface UserService {
	
	
	void delete(User user);
	void update(User user);
	void add(User user) throws NumberFormatException, RemoteException;
	
	
}
