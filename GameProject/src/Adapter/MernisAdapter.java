package Adapter;

import java.rmi.RemoteException;

	import Abstract.UserCheckService;
	import Entities.User;
	import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

	public class MernisAdapter implements UserCheckService{

		@Override
		public boolean checkIfRealPlayer(User user) throws NumberFormatException, RemoteException {
			KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
			return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName().toUpperCase(), 
					user.getLastName().toUpperCase(), user.getBirthYear());
		}

	}

