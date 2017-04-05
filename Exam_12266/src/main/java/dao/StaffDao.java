package dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import bean.Staff;

@Repository 	
public interface StaffDao {
	@Select("select count(*) from staff where first_name=#{first_name} and password=#{password}")
	public int login(@Param("first_name")String first_name,@Param("password")String password);
	//查询用户
	@Select("select * from staff where first_name=#{first_name}")
	public Staff findStaff(@Param("first_name")String first_name);
	
}
