package com.billzard.dao;

import com.billzard.domain.Customer;
import com.billzard.vo.input.CustomerVO;

public interface CustomerDAO {

	public Customer save(CustomerVO customerVO);
	
	public Customer getCustomer(String mobileNo);
}
