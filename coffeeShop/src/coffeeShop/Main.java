package coffeeShop;



import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager customerManager2=new NeroCustomerManager(new CustomerCheckManager());
		Customer customer=new Customer(1,"Hatice","Karakuş",1999,45678906523l);
		customerManager.save(customer);
		customerManager2.save(customer);

	}

}
