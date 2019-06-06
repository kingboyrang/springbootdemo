package com.exam.demo.mapper;

import java.util.List;
import com.exam.demo.entity.Account;

//@Mapper 或者 RestspringdemoApplication 中配置 @MapperScan(value = "com.example.demo.mapper")  
//@Mapper  
public interface AccountMapper {
	
	List<Account> selectAll();

	Account getMessById(Integer id);

}
