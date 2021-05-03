package InterfaceAbstractDemo;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Veritabananýna  kaydedildi : " + customer.getFirstName() +" "+ customer.getLastName().toUpperCase());
		
	}

}
