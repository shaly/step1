package com.syf.demo;
/**
 * 
 * @author Jane
 *
 *
 什么是进程？
 进程是一个应用的程序
 什么是线程？
 线程其实就是一条执行路径。main是主线程，如果自己创建了线程就是子线程
 gc线程是专门监听回收垃圾的 （垃圾回收机制）
 */
public class ThreadDemo01 {
	public static void main(String[] args) {
		System.out.println("这是主线程");
	}
}
