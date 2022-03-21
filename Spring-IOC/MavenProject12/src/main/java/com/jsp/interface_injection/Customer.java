package com.jsp.interface_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@Value("123")
	private int customerId;
	@Value("Ravi")
	private String customerName;
	@Value("987654321")
	private long phNum;
	
	@Autowired
	@Qualifier("savings")
	private Account account;
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public long getPhNum() {
		return phNum;
	}
	public void setPhNum(long phNum) {
		this.phNum = phNum;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phNum=" + phNum
				+ ", account=" + account + "]";
	}
	
	
	
	

}
