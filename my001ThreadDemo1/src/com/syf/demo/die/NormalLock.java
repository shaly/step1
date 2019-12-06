package com.syf.demo.die;

public class NormalLock {
	public static void main(String[] args) throws InterruptedException {
		DieLockDemo runnable=new DieLockDemo();
		runnable.userModle=new UserModle("Jane");
		Thread t1=new Thread(runnable);
		t1.start();
		Thread.sleep(40);
		new Thread(runnable).start();
		new Thread(new DieLockDemo1(runnable.userModle)).start();
	}
}

class DieLockDemo1 implements Runnable{
	private UserModle userModle;
	public DieLockDemo1(UserModle userModle) {
		this.userModle=userModle;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("hihi");
			buy() ;
		}
	}

	public synchronized void buy()  {
		synchronized(userModle) {
			if(DieLockDemo.num>0) {
				System.out.println(Thread.currentThread().getName()+userModle.getUserName()+"成功买票:::"+(100-DieLockDemo.num+1));
				DieLockDemo.num--;
			}
		}
	}
	
}
class DieLockDemo implements Runnable{
	
	public UserModle userModle;
	public static int num=100;
	
	@Override
	public void run() {
		while (true) {
			System.out.println("ooo");
			System.out.println(Thread.currentThread().getName()+userModle.getUserName() + "想买" + (100 - num + 1));
			synchronized (this) {
				if (num > 0) {
					try {
						buy();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void buy() throws InterruptedException {
		synchronized(userModle) {
			Thread.sleep(40);
			System.out.println(Thread.currentThread().getName()+userModle.getUserName()+"::成功买票"+(100-num+1));
			num--;
		}	
	}
}
