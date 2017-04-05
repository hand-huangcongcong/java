package dao;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import bean.Address;
@Repository
public interface AddressDao {
	@Select("select * from address")
	public List<Address> queryAddress();
}
