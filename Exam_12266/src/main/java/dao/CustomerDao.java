package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import bean.Customer;
import bean.Address;
@Repository 	 	
public interface CustomerDao {
		@Insert("insert into customer(store_id, first_name, last_name, email, address_id,active) values(1,#{first_name},#{last_name},#{email},#{address_id},1)")
		public int create(@Param("first_name")String first_name,@Param("last_name")String last_name,@Param("email")String email,@Param("address_id")int address_id);
		@Select("select * from customer")
		public List<Customer> queryCustomer();
		@Select("select customer.*,address.address from customer,address where customer_id=#{customer_id} and customer.address_id = address.address_id")
		public Customer queryCustomerByid(@Param("customer_id")int customer_id);
		public void saveUser(Customer customer);
		@Select("select * from address where address_id=#{address_id}")
		public List<Address> queryAdr(@Param("address_id")String id);
		@Delete("delete from customer where customer_id=#{customer_id}")
		//SET FOREIGN_KEY_CHECKS=0;在Mysql中取消外键约束
		public int delCustomer(@Param("customer_id")int customer_id);
		@Update("update customer set first_name=#{first_name},last_name=#{last_name},email=#{email},address_id=#{address_id}  where customer_id=#{customer_id}")
		public int updateCustomer(@Param("first_name")String first_name,@Param("last_name")String last_name,@Param("email")String email,@Param("address_id")int address_id,@Param("customer_id")int customer_id);
		
}
