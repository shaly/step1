package com.syf.demo.msg;

public class UserDemo {
	private String userId;
	private String userName;

	public UserDemo() {
	}
	public UserDemo(String userId,String userName) {
		this.userId=userId;
		this.userName=userName;
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
	@Override
	public String toString() {
		return "UserDemo [userId=" + userId + ", userName=" + userName + "]";
	}
	

}
