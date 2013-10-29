package com.billzard.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.billzard.dao.CustomerDAO;
import com.billzard.domain.Customer;
import com.billzard.vo.input.CustomerVO;

@Repository(value = "customerDao")
@Transactional
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Customer save(CustomerVO customerVO) {
		Customer customer = new Customer();
		customer.setEmailId(customerVO.getEmailId());
		customer.setMobile(customerVO.getMobile());
		sessionFactory.getCurrentSession().save(customer);
		return customer;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Customer getCustomer(String mobileNo) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(
				Customer.class);
		criteria.add(Restrictions.eq("mobile", mobileNo));
		List<Customer> custList = (List<Customer>) criteria.list();
		if (!custList.isEmpty()) {
			return custList.get(0);
		}
		return null;
	}

}
