package com.spring.core.CollectiveDataType;

import java.util.List;

public class Customer {
	private int custId;

	@Override
	public String toString() {
		return "Customer [phones=" + phones + "]";
	}

	private String custName;
	private List<Long> phones;

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

	public List<Long> getPhones() {
		return phones;
	}

	public void setPhones(List<Long> phones) {
		this.phones = phones;
	}

}
