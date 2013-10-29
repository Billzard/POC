package com.billzard.vo.input;

public class CustomerVO {

	private String emailId;

	private String mobile;

	public CustomerVO() {
	}

	public CustomerVO(String emailId, String mobile) {
		super();
		this.emailId = emailId;
		this.mobile = mobile;
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
