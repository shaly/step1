package com.syf.demo;

import com.alibaba.fastjson.JSONObject;

public class ThreadDemo08SleepRunnableIDNAME2 {
	public static void main(String[] args) {
		Thread t=new Thread(new SleepDemo2());
		t.setName("自定义线程名");
		t.start();
	}
}


class SleepDemo2 implements Runnable{
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
			//getId(),getName()仅在继承Thread类的线程中可以使用，实现Runnable无法使用该方法
			//获取当前线程的ID ID是多线程随机进行分配的不重复主键
			//获取当前线程的名字 名字是多线程进行分配的不重复名称,线程名默认从Thread-0,Thread-1,Thread-2依次递增，也可以自定义线程名(会占用一个默认线程名)
			System.out.println(i+"getId="+Thread.currentThread().getId()+"Name="+Thread.currentThread().getName());
		}
	}
}