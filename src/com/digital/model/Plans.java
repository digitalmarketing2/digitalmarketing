package com.digital.model;

public class Plans {
	
	private String plan_name;
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public String getPlan_price() {
		return plan_price;
	}
	public void setPlan_price(String plan_price) {
		this.plan_price = plan_price;
	}
	public String getPlan_gateway() {
		return plan_gateway;
	}
	public void setPlan_gateway(String plan_gateway) {
		this.plan_gateway = plan_gateway;
	}
	public String getNo_of_task() {
		return no_of_task;
	}
	public void setNo_of_task(String no_of_task) {
		this.no_of_task = no_of_task;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	private String plan_price;
	private String plan_gateway;
	private String no_of_task;
	private String amount;
	private String currency;
	private String validity;
	

}
