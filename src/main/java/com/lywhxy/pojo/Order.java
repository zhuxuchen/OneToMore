package com.lywhxy.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable{
	private static final long serialVersionUID = 1L;
	
	String id;
	double money;
	String receiverAddress;
	String receiverName;
	String receiverPhone;
	Date ordertime;
	User user;
	
	List<Product> products;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverPhone() {
		return receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "\nOrder [id=" + id + ", money=" + money + ", receiverAddress=" + receiverAddress + ", receiverName="
				+ receiverName + ", receiverPhone=" + receiverPhone + ", ordertime=" + ordertime + ", user=" + user
				+ ", products=" + products + "]";
	}
	
	

}
