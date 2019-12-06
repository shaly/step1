package com.syf.demo.die;

public class UserModle {
	private String userId;
	private String userName;
	private String address;
	
	public UserModle(String name) {
		this.userName=name;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserModle [userId=" + userId + ", userName=" + userName + ", address=" + address + "]";
	}
	
}
