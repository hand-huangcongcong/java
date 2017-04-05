package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import bean.Address;
import bean.Customer;


public interface ManageContentService {
	public int login(String first_name, String password) ;
	public List<Customer> queryCustomer() ;
	public Customer queryCustomerByid(int customer_id);
	public int create(String first_name,String last_name,String email,int address_id);
	public void saveUser(Customer customer);
	public List<Address> queryAdr(String id);
	public int delCustomer(int customer_id);
	public int updateCustomer(String first_name,String last_name,String email,int address_id,int customer_id);
	public List<Address> queryAddress();
	
	}
