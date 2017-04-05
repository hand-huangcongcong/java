package service.lmpl;

import java.util.List;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bean.Address;
import bean.Customer;
import bean.Staff;
import dao.AddressDao;
import dao.CustomerDao;
import dao.StaffDao;
import service.ManageContentService;


@Service("ManageContentService")
public class ManageContentServiceImpl implements ManageContentService {
	@Resource
	private StaffDao staffDao;
	@Resource
	private CustomerDao customerDao;
	@Resource
	private AddressDao addressDao;
	public Staff findCustomer(String first_name) {
		return staffDao.findStaff(first_name);
	}
	public int login(String first_name, String password) {
		 System.out.println(staffDao.login(first_name, password));
		return staffDao.login(first_name, password);
	}
	
	public List<Customer> queryCustomer() {
		return customerDao.queryCustomer();
	}
	
	public void saveUser(Customer customer) {
		
	}
	public List<Address> queryAdr(String id) {
		return customerDao.queryAdr(id);
	}
	@Transactional
	public int delCustomer(int customer_id) {
		return customerDao.delCustomer(customer_id);
	}
	@Transactional
	public int updateCustomer( String first_name, String last_name, String email,int address_id,int customer_id) {
		return customerDao.updateCustomer( first_name, last_name, email, address_id,customer_id);
	}
	@Transactional
	public int create(String first_name, String last_name, String email, int address_id) {
		
		return customerDao.create(first_name, last_name, email, address_id);
	}
	public List<Address> queryAddress() {
		return addressDao.queryAddress();
	}
	public Customer queryCustomerByid(int customer_id) {
		// TODO Auto-generated method stub
		return customerDao.queryCustomerByid(customer_id);
	}

}
