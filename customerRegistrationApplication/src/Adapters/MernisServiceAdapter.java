package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisServiceReferance.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		KPSPublicSoapProxy client= new KPSPublicSoapProxy();
		boolean result = false;
		
		try {return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase()
				,customer.getLastName().toLowerCase(),customer.getDateOfBirth().getYear());
		}
		catch (Exception e) 
		{
			System.out.println("Not a valid person");
		}
		
		return result;
				
	
	}

}
