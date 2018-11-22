package praveen.dao;

import praveen.model.Customer;
import praveen.model.User;

public interface CustomerDao {
	 
	void registerCustomer(Customer customer);
	boolean isEmailValid(String email);
	boolean isUsernameValid(String username);
	User getUser(String username);
	
}

