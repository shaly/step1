package com.syf.demo;

import com.alibaba.fastjson.JSONObject;

public class ThreadDemo06Sleep {
	public static void main(String[] args) {
		new SleepDemo().start();
	}
}


class SleepDemo extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("开始："+i);
			//在run方法中不能抛出异常throw，只能捕获异常try
			try {
				//sleep作用让当前线程从运行状态变为休眠状态，如果时间到期又会回到运行状态
				//sleep不能释放锁，多线程之间实现同步，wait可以释放锁
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("线程捕获异常："+JSONObject.toJSONString(e));
				e.printStackTrace();
			}
			System.out.println(i);
		}
		super.run();
	}
}