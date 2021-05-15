package customerRegistrationApplication;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager=new NeroCustomerManager();
		
		/*Tc yi vermek istemedi�imden starbucks yapmad�m.
		 Starbuck olsayd� �u �ekil olucakt� : BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		*/
		customerManager.save(new Customer(1, "Taha", "�brahima�ao�lu", LocalDate.of(2000, 2, 25),"1111111111111"));
		
	}

}
