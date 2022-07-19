package com.spring.core.SIandCI_demo;

public class Customer {
	private int custId;
	private String custName;
	private String emailId;
	private long contacNo;
	private MemberShip membership;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getContacNo() {
		return contacNo;
	}

	public void setContacNo(long contacNo) {
		this.contacNo = contacNo;
	}

	public MemberShip getMembership() {
		return membership;
	}

	public void setMembership(MemberShip membership) {
		this.membership = membership;
	}

}
