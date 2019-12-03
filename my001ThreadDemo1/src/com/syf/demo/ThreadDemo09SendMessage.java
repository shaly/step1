package com.syf.demo;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.syf.demo.msg.ListUtil;
import com.syf.demo.msg.MessageDemo;
import com.syf.demo.msg.UserDemo;

/**
 * 
 * @author Jane
 *
 *
需求：目前有10万个用户，现在需要做活动给每个用户发送一条祝福短信。
为了提高成俗的效率，请使用多线程技术分批发送数据。
但多线程可以减少短信发送时间，每开一个线程，都会占用CPU资源，所以并不是开的线程越多越好。
线程的数量根据，服务器（电脑）配置CPU核数来决定（与硬盘大小关系无关）。
 */
public class ThreadDemo09SendMessage {
	public static void main(String[] args) {
		System.out.println("这是主线程");
		//1.初始化数据
		List<UserDemo> list=initUser();
		//2.定义每个线程跑多少数据
		int count=10;
		//3.计算每个线程数，并计算每个线程跑哪些数据
		List<List<UserDemo>> sendList=ListUtil.splitList(list, count);
		//4.让子线程分批一步处理数据
		for (int i = 0; i < sendList.size(); i++) {
//			System.out.println("i="+i+sendList.get(i).toString());
			new MessageDemo(sendList.get(i)).start();
		}
	}
	
	
	
	
	
	public static List<UserDemo> initUser(){
		List<UserDemo> list=new ArrayList<UserDemo>();
		for (int i = 0; i < 101; i++) {
			list.add(new UserDemo("id"+i,"name"+i));
		}
		return list;
	}
}
