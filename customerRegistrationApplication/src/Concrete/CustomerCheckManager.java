package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisServiceReferance.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		

		return true;
	}

}
