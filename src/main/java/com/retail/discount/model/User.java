package com.retail.discount.model;

public class User {
	private boolean isEmployee;
	private boolean isAffiliate;
	private boolean isLoyalCustomer;

	public User(boolean isEmployee, boolean isAffiliate, boolean isLoyalCustomer) {
		super();
		this.isEmployee = isEmployee;
		this.isAffiliate = isAffiliate;
		this.isLoyalCustomer = isLoyalCustomer;
	}

	public boolean isEmployee() {
		return isEmployee;
	}

	public void setEmployee(boolean isEmployee) {
		this.isEmployee = isEmployee;
	}

	public boolean isAffiliate() {
		return isAffiliate;
	}

	public void setAffiliate(boolean isAffiliate) {
		this.isAffiliate = isAffiliate;
	}

	public boolean isLoyalCustomer() {
		return isLoyalCustomer;
	}

	public void setLoyalCustomer(boolean isLoyalCustomer) {
		this.isLoyalCustomer = isLoyalCustomer;
	}

}
