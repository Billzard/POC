package com.billzard.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long custId;

	@Column(name = "email")
	private String emailId;

	@Column(name = "mobile")
	private String mobile;

	@OneToMany(mappedBy = "customer")
	private List<HotSpotDetails> hotSpotDetailsList = new ArrayList<HotSpotDetails>();

	public List<HotSpotDetails> getHotSpotDetailsList() {
		return hotSpotDetailsList;
	}

	public void setHotSpotDetailsList(List<HotSpotDetails> hotSpotDetailsList) {
		this.hotSpotDetailsList = hotSpotDetailsList;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
