package com.syf.demo.safe;

import com.syf.demo.msg.UserDemo;

/**
 * 
 * @Description: 什么是线程安全？
 *               当多个线程同时共享，同一个全局变量或静态变量，做写的操作是可能会发生数据冲突问题，也就是线程安全问题。做读操作是不会发生数据冲突问题。
 * @author Jane
 * @date: 2019-12-04
 */
public class Thread01Tickit {
	public static void main(String[] args) throws InterruptedException {
		/*1.不安全线程示例1*/
//		new Thread(new TickitUnsafe("*Jane*")).start();
//		new Thread(new TickitUnsafe("【Tome】")).start();
//		new Thread(new TickitUnsafe("#Anny#")).start();
//		new Thread(new TickitUnsafe("$Lily$")).start();
////		【Tome】成功买票，还剩：-2
////		【Tome】开始买票：-2
////		#Anny#成功买票，还剩：-1
////		$Lily$开始买票：28
////		#Anny#开始买票：-2
////		*Jane*共买了：43张票
////		#Anny#共买了：25张票
////		$Lily$共买了：20张票
////		【Tome】共买了：14张票
////		
////		由于共同读写num票数，线程不安全，总售卖票数 14+23+25+20=102张
//
		 /*2.不安全线程示例2*/
//		TickitUnsafe1 tickit1 = new TickitUnsafe1();
//		new Thread(tickit1).start();
//		new Thread(tickit1).start();
//		new Thread(tickit1).start();
////		Thread-1开始售卖第997张票
////		Thread-2开始售卖第997张票
////		Thread-0开始售卖第999张票
////		Thread-2开始售卖第1000张票
////		Thread-1开始售卖第1000张票
////		最后票数为：0
////		最后票数为：-1
////		Thread-0开始售卖第1002张票
////		最后票数为：-2
////		由于共同读写num票数，线程不安全，总售卖票数 1002

		
		/*3.安全线程之synchronized代码块*/
//		TickitSafe ts = new TickitSafe();
//		new Thread(ts).start();
//		new Thread(ts).start();
//		new Thread(ts).start();
////		Thread-1开始售卖第87张票
////		想买票：88
////		Thread-0开始售卖第88张票
////		想买票：88
////		Thread-2开始售卖第89张票
////		想买票：90
////		Thread-1开始售卖第90张票
////		想买票：91
////		想买票：91
////		Thread-0开始售卖第91张票
////		Thread-2开始售卖第92张票
////		想买票：93
////		Thread-1开始售卖第93张票
////		想买票：94
////		Thread-0开始售卖第94张票
////		想买票：94
////		Thread-2开始售卖第95张票
////		想买票：96
////		Thread-1开始售卖第96张票
////		想买票：97
////		Thread-0开始售卖第97张票
////		想买票：97
////		Thread-2开始售卖第98张票
////		想买票：99
////		Thread-1开始售卖第99张票
////		想买票：100
////		想买票：100
////		Thread-0开始售卖第100张票
////	想买票：101
////		最后票数为：0
////		最后票数为：0
////		想买票：102
////		最后票数为：0
////		多线程想买票的时候有102张，但实际只有100买票成功，体现了数据的准确性


////		/*4.安全线程之synchronized同步函数*/
////		TickitSafe1 ts1 = new TickitSafe1();
////		new Thread(ts1).start();
////		new Thread(ts1).start();
////		new Thread(ts1).start();
//		想买票：97
//		Thread-2开始售卖第97张票
//		想买票：97
//		Thread-1开始售卖第98张票
//		想买票：99
//		Thread-0开始售卖第99张票
//		想买票：100
//		想买票：100
//		Thread-2开始售卖第100张票
//		最后票数为：0
//		最后票数为：0
//		想买票：101
//		最后票数为：0
////	多线程想“想买票：”有102次，但实际只有100个“开始售卖第”买票成功，体现了数据的准确性
		
		
		
		/*5.安全线程之synchronized同步函数与明锁synchronized(this)讲解*/
////		TickitExample te = new TickitExample();
////		new Thread(te).start();
////		new Thread(te).start();
//		/*6.案例说明安全线程之static synchronized 静态同步函数使用该函数所属字节码文件*/
//		TickitSafe2 ts2 = new TickitSafe2();
//		new Thread(ts2).start();
//		Thread.sleep(40);
//		ts2.flag=false;
//		new Thread(ts2).start();
//		Thread.sleep(40);
//		ts2.flag=true;
//		new Thread(ts2).start();
////		Thread-0想买：1
////		Thread-0开始售卖第1张票
////		Thread-0想买：2
////		Thread-0开始售卖第2张票
////		Thread-1想买：2
////		Thread-0想买：3
////		Thread-1开始售卖第3张票
////		Thread-2想买：3
////		Thread-2开始售卖第4张票
////		Thread-1想买：4
////		Thread-2想买：5
////		Thread-0开始售卖第5张票
////		Thread-0想买：6
////		Thread-2开始售卖第6张票
////		Thread-2想买：7
////		Thread-1开始售卖第7张票
////		Thread-1想买：8
////		Thread-2开始售卖第8张票
////	多线程想“想买票：”有102次，但实际只有100个“开始售卖第”买票成功，体现了数据的准确性
		
		
		/*7.案例说明安全线程之static synchronized 静态同步函数 与 同步函数不是用的同一把锁*/
//		TickitExample1 te1 = new TickitExample1();
//		new Thread(te1).start();
//		Thread.sleep(40);
//		te1.flag=false;
//		new Thread(te1).start();
//		new Thread(te1).start();
////		Thread-0开始售卖第86张票
////		Thread-1开始售卖第86张票
////		Thread-0开始售卖第88张票
////		Thread-0开始售卖第89张票
////		Thread-2开始售卖第89张票
////		Thread-0开始售卖第90张票
////		Thread-2开始售卖第90张票
////		Thread-0开始售卖第92张票
////		Thread-2开始售卖第92张票
////		Thread-2开始售卖第94张票
////		Thread-0开始售卖第94张票
////		Thread-0开始售卖第96张票
////		Thread-1开始售卖第96张票
////		Thread-0开始售卖第98张票
////		Thread-2开始售卖第98张票
////		Thread-2开始售卖第100张票
////		Thread-1开始售卖第100张票
////	多线程执行完毕后“开始售卖第”显示共有106个购买记录，所以说明static不是用的this锁
	}
}

/**
 * 
 * @Description:解决线程不安全问题 线程安全问题怎么解决？ 
 * 1.使用synchronized
 *    1.1同步代码块：将可能发生线程安全问题的代码给包括起来 ，只允许一个线程执行代码块中的东西，需要用同一个锁才有效，只适合单个jvm。
 *    	（注意：不要用synchronized块将整个run方法代码全包了，因为这样就相当于是单线程在执行了）
 *    1.2同步函数 ：也叫做同步方法，在方法上修饰synchronized成为同步函数,实际上同步函数其实就是将整个方法放到一个代码块中，锁使用的锁就是“this”当前这个对象
 * 		(此类为证明同步函数用的就是"this"锁)
 *    1.3【静态同步函数】：法上加上static关键字，使用synchronized 关键字修饰 或者使用类.class文件。静态的同步函数使用的锁是  该函数所属字节码文件 ，可以用 getClass方法获取，也可以用当前  类名.class 表示。
 *    	(此类为证明静态同步函数用的就是"该函数所属字节码文件"锁，而不是“this”锁)
 * 2.jdk1.5并发包lock
 * @author Jane
 * @date: 2019-12-04
 */
class TickitExample1 implements Runnable {
	static int trainCount = 100;
	private Object obj = new Object();
	public boolean flag = true;

	@Override
	public void run() {
		if (flag) {
			while (trainCount > 0) {
				synchronized (this) {// this锁
					if (trainCount > 0) {
						System.out.println(Thread.currentThread().getName() + "开始售卖第" + (100 - trainCount + 1) + "张票");
						try {
							Thread.sleep(40);
						} catch (InterruptedException e) {
							System.out.println(Thread.currentThread().getName() + "线程报错");
							e.printStackTrace();
						}
						trainCount--;
					}
				}
			}
		} else {
			while (trainCount > 0) {
				buyfunction();
			}
		}
	}

	public static synchronized void buyfunction() {
		if (trainCount > 0) {
			System.out.println(Thread.currentThread().getName() + "开始售卖第" + (100 - trainCount + 1) + "张票");
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + "线程报错");
				e.printStackTrace();
			}
			trainCount--;
		}
	}
}
/**
 * 
 * @Description:解决线程不安全问题 线程安全问题怎么解决？ 
 * 1.使用synchronized
 *    1.1同步代码块：将可能发生线程安全问题的代码给包括起来 ，只允许一个线程执行代码块中的东西，需要用同一个锁才有效，只适合单个jvm。
 *    	（注意：不要用synchronized块将整个run方法代码全包了，因为这样就相当于是单线程在执行了）
 *    1.2同步函数 ：也叫做同步方法，在方法上修饰synchronized成为同步函数,实际上同步函数其实就是将整个方法放到一个代码块中，锁使用的锁就是“this”当前这个对象
 * 		(此类为证明同步函数用的就是"this"锁)
 *    1.3【静态同步函数】：法上加上static关键字，使用synchronized 关键字修饰 或者使用类.class文件。静态的同步函数使用的锁是  该函数所属字节码文件 ，可以用 getClass方法获取，也可以用当前  类名.class 表示。
 * 2.jdk1.5并发包lock
 * @author Jane
 * @date: 2019-12-04
 */
class TickitSafe2 implements Runnable {
	static int trainCount=100;
	private Object obj=new Object();
	public boolean flag=true;
	@Override
	public void run() {
		while (trainCount > 0) {
			System.out.println(Thread.currentThread().getName()+"想买："+ (100 - trainCount + 1));
			if (flag) {
				synchronized (TickitSafe2.class) {//该函数所属字节码文件锁
					if (trainCount > 0) {
						System.out.println(Thread.currentThread().getName() + "开始售卖第" + (100 - trainCount + 1) + "张票");
						try {
							Thread.sleep(40);
						} catch (InterruptedException e) {
							System.out.println(Thread.currentThread().getName() + "线程报错");
							e.printStackTrace();
						}
						trainCount--;
					}
				}
				flag = !flag;
			} else {
				buyfunction();
			}
		}
	}
	public static synchronized void buyfunction() {
		if(trainCount>0) {
			System.out.println(Thread.currentThread().getName() + "开始售卖第" + (100 - trainCount + 1) + "张票");
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + "线程报错");
				e.printStackTrace();
			}
			trainCount--;
		}
	}
}

/**
 * 
 * @Description:解决线程不安全问题 线程安全问题怎么解决？ 
 * 1.使用synchronized
 *    1.1同步代码块：将可能发生线程安全问题的代码给包括起来 ，只允许一个线程执行代码块中的东西，需要用同一个锁才有效，只适合单个jvm。
 *    	（注意：不要用synchronized块将整个run方法代码全包了，因为这样就相当于是单线程在执行了）
 *    1.2【同步函数 】：也叫做同步方法，在方法上修饰synchronized成为同步函数,实际上同步函数其实就是将整个方法放到一个代码块中，锁使用的锁就是“this”当前这个对象
 * 		(此类为证明同步函数用的就是"this"锁)
 *    1.3静态同步函数
 * 2.jdk1.5并发包lock
 * @author Jane
 * @date: 2019-12-04
 */
class TickitExample implements Runnable {

	int trainCount=100;
	private Object obj=new Object();
	public boolean flag=true;
	
	
	@Override
	public void run() {
		while (trainCount > 0) {
			if (flag) {
				synchronized (this) {//此情况下永远最多只会卖100张票
//				synchronized (obj) {//此情况下出现了卖101张票的状况，图片在当前文件路径下名为“反校验.png”
					if (trainCount > 0) {
						System.out.println(Thread.currentThread().getName() + "开始售卖第" + (100 - trainCount + 1) + "张票");
						try {
							Thread.sleep(40);
						} catch (InterruptedException e) {
							System.out.println(Thread.currentThread().getName() + "线程报错");
							e.printStackTrace();
						}
						trainCount--;
					}
				}
				flag = !flag;
			} else {
				buyfunction();
			}
		}
	}
	
	
	public synchronized void buyfunction() {
		if(trainCount>0) {
			System.out.println(Thread.currentThread().getName() + "开始售卖第" + (100 - trainCount + 1) + "张票");
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + "线程报错");
				e.printStackTrace();
			}
			trainCount--;
		}
	}
	
}

/**
 * 
 * @Description:解决线程不安全问题 线程安全问题怎么解决？ 
 * 1.使用synchronized
 *    1.1同步代码块：将可能发生线程安全问题的代码给包括起来 ，只允许一个线程执行代码块中的东西，需要用同一个锁才有效，只适合单个jvm。
 *    	（注意：不要用synchronized块将整个run方法代码全包了，因为这样就相当于是单线程在执行了）
 *    1.2【同步函数 】：也叫做同步方法，在方法上修饰synchronized成为同步函数,实际上同步函数其实就是将整个方法放到一个代码块中，锁使用的锁就是“this”当前这个对象
 *    1.3静态同步函数
 * 2.jdk1.5并发包lock
 * @author Jane
 * @date: 2019-12-04
 */
class TickitSafe1 implements Runnable {
	private Integer num = 100;
	private Object obj = new Object();//锁
	private boolean f=true;

	@Override
	public void run() {
		while (num > 0) { 
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + "线程报错");
				e.printStackTrace();
			}
			System.out.println("想买票："+ (100 - num + 1));
			buyfunction();
		}
		System.out.println("最后票数为：" + num);
	}
	//实际上同步函数其实就是将整个方法放到一个代码块中，锁使用的锁就是“this”当前这个对象
	public synchronized void buyfunction() {
		if(num>0) {
			System.out.println(Thread.currentThread().getName() + "开始售卖第" + (100 - num + 1) + "张票");
			num--;
		}
	}
}


/**
 * 
 * @Description:解决线程不安全问题 线程安全问题怎么解决？ 
 * 1.使用synchronized
 *    1.1【同步代码块】：将可能发生线程安全问题的代码给包括起来 ，只允许一个线程执行代码块中的东西，需要用同一个锁才有效，只适合单个jvm。
 *    	（注意：不要用synchronized块将整个run方法代码全包了，因为这样就相当于是单线程在执行了）
 *    1.2同步函数 
 *    1.3静态同步函数
 * 2.jdk1.5并发包lock
 * @author Jane
 * @date: 2019-12-04
 */
class TickitSafe implements Runnable {

	private Integer num = 100;
	private Object obj = new Object();//锁

	@Override
	public void run() {
		while (num > 0) {
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + "线程报错");
				e.printStackTrace();
			}
			System.out.println("想买票："+ (100 - num + 1));
			synchronized (obj) {//在执行代码块的线程拿到了obj这把锁，只有代码执行完毕后，此锁才会被放开
				if(num>0) {
					System.out.println(Thread.currentThread().getName() + "开始售卖第" + (100 - num + 1) + "张票");
					num--;
				}
			}
		}
		System.out.println("最后票数为：" + num);
	}

}

/**
 * 
 * @Description: 线程不安全的卖票1
 * @author Jane
 * @date: 2019-12-04
 */
class TickitUnsafe1 implements Runnable {

	private Integer num = 100;

	@Override
	public void run() {
		while (num > 0) {
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + "线程报错");
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "开始售卖第" + (100 - num + 1) + "张票");
			num--;
		}
		System.out.println("最后票数为：" + num);
	}
}

/**
 * 
 * @Description: 线程不安全的卖票
 * @author Jane
 * @date: 2019-12-04
 */
class TickitUnsafe implements Runnable {
	private String name;
	private static Integer num = 100;

	public TickitUnsafe(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		Integer j = 0;
		for (int i = 0; i < 100; i++) {
			j = num;
			System.out.println(name + "开始买票：" + j);
			if (num > 0) {
				System.out.println(name + "开始买票：" + j);
				num--;
				System.out.println(name + "成功买票，还剩：" + num);
			} else {
				System.out.println(name + "共买了：" + i + "张票");
				break;
			}
		}
	}
}