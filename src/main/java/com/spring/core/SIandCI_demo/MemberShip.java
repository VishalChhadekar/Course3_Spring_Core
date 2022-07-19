package com.spring.core.SIandCI_demo;

public class MemberShip {

	private int memberShipId;
	private String memberShipType;
	private int visitsPerYear;

	public MemberShip(int memberShipId, String memberShipType, int visitsPerYear) {
		super();
		this.memberShipId = memberShipId;
		this.memberShipType = memberShipType;
		this.visitsPerYear = visitsPerYear;
	}

	public int getMemberShipId() {
		return memberShipId;
	}

	public void setMemberShipId(int memberShipId) {
		this.memberShipId = memberShipId;
	}

	public String getMemberShipType() {
		return memberShipType;
	}

	public void setMemberShipType(String memberShipType) {
		this.memberShipType = memberShipType;
	}

	public int getVisitsPerYear() {
		return visitsPerYear;
	}

	public void setVisitsPerYear(int visitsPerYear) {
		this.visitsPerYear = visitsPerYear;
	}

}
