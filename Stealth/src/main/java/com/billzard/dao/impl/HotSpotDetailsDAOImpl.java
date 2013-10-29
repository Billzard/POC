package com.billzard.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.billzard.dao.CustomerDAO;
import com.billzard.dao.HotSpotDetailsDAO;
import com.billzard.domain.Customer;
import com.billzard.domain.HotSpotDetails;
import com.billzard.vo.input.CustomerVO;
import com.billzard.vo.input.HotSpotDetailsVO;

@Transactional
@Repository("hotSpotDao")
public class HotSpotDetailsDAOImpl implements HotSpotDetailsDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	CustomerDAO customerDAO;

	@Override
	public void save(HotSpotDetailsVO detailsVO) {
		HotSpotDetails hotSpotDetails = new HotSpotDetails();
		hotSpotDetails.setCoordinates(detailsVO.getCoordinates());
		hotSpotDetails.setHotspotName(detailsVO.getHotspotName());
		hotSpotDetails.setIsPublic(detailsVO.getIsPublic());
		hotSpotDetails.setStrength(detailsVO.getStrength());
		Customer customer = customerDAO.getCustomer(detailsVO.getMobile());
		if (customer == null) {
			CustomerVO customerVO = new CustomerVO(detailsVO.getEmailId(),
					detailsVO.getMobile());
			customer = customerDAO.save(customerVO);
		}
		hotSpotDetails.setCustomer(customer);
		sessionFactory.getCurrentSession().save(hotSpotDetails);

	}

}
