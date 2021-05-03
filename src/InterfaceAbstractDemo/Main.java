package InterfaceAbstractDemo;



public class Main {

	public static void main(String[] args) {
		//BaseCustomerManager baseCustomerManager =  new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("yusuf");
		customer.setLastName("mehmetoðlu");
		customer.setNationalityId("28505434168");
		customer.setDateOfBirth(2000);
		
		baseCustomerManager.save(customer);

	}

}
