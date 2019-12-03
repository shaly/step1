package com.syf.demo.msg;

import java.util.List;

public class MessageDemo extends Thread{
	private List<UserDemo> list;
	
	public MessageDemo(List<UserDemo> list) {
		this.list=list;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("开始发送短信："+getName()+"   "+list.get(i).toString());
		}
		super.run();
	}
}
