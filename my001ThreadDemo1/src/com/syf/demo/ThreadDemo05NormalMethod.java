package com.syf.demo;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
  * 线程常用方法
  * @author Jane
  *
  */
public class ThreadDemo05NormalMethod {
	public static void main(String[] args) {
		System.out.println("【主线程】-"+Thread.currentThread());
		
//		//常用方法1:
		CreateThread5 c=new CreateThread5(3);
		c.start();
		c.checkAccess();
		//控制台输出
	/*	【主线程】-Thread[main,5,main]
		【CreateThread5线程】-Thread[Thread-0,5,main]
		Thread-0
		DestroyJavaVM
		Thread-1
		空对象
		【CreateThread6线程】-Thread[Thread-1,5,main]
		空对象
		空对象*/
		
		
		//常用方法2:
		CreateThread7 c1=new CreateThread7();
		c1.start();
		//控制台输出
/*		【主线程】-Thread[main,5,main]
		【CreateThread7线程】-Thread[Thread-0,5,main]
		7==={"Thread[Thread-0,5,main]":[{"fileName":"Thread.java","nativeMethod":true,"methodName":"dumpThreads","className":"java.lang.Thread","lineNumber":-2},{"fileName":"Thread.java","nativeMethod":false,"methodName":"getAllStackTraces","className":"java.lang.Thread","lineNumber":1610},{"fileName":"ThreadDemo5.java","nativeMethod":false,"methodName":"run","className":"com.syf.demo.CreateThread7","lineNumber":79}],"Thread[Finalizer,8,system]":[{"fileName":"Object.java","nativeMethod":true,"methodName":"wait","className":"java.lang.Object","lineNumber":-2},{"fileName":"ReferenceQueue.java","nativeMethod":false,"methodName":"remove","className":"java.lang.ref.ReferenceQueue","lineNumber":143},{"fileName":"ReferenceQueue.java","nativeMethod":false,"methodName":"remove","className":"java.lang.ref.ReferenceQueue","lineNumber":164},{"fileName":"Finalizer.java","nativeMethod":false,"methodName":"run","className":"java.lang.ref.Finalizer$FinalizerThread","lineNumber":209}],"Thread[DestroyJavaVM,5,main]":[],"Thread[Signal Dispatcher,9,system]":[],"Thread[Attach Listener,5,system]":[],"Thread[Reference Handler,10,system]":[{"fileName":"Object.java","nativeMethod":true,"methodName":"wait","className":"java.lang.Object","lineNumber":-2},{"fileName":"Object.java","nativeMethod":false,"methodName":"wait","className":"java.lang.Object","lineNumber":502},{"fileName":"Reference.java","nativeMethod":false,"methodName":"tryHandlePending","className":"java.lang.ref.Reference","lineNumber":191},{"fileName":"Reference.java","nativeMethod":false,"methodName":"run","className":"java.lang.ref.Reference$ReferenceHandler","lineNumber":153}]}
		【CreateThread8线程】-Thread[Thread-1,5,main]
		8==={"Thread[Finalizer,8,system]":[{"fileName":"Object.java","nativeMethod":true,"methodName":"wait","className":"java.lang.Object","lineNumber":-2},{"fileName":"ReferenceQueue.java","nativeMethod":false,"methodName":"remove","className":"java.lang.ref.ReferenceQueue","lineNumber":143},{"fileName":"ReferenceQueue.java","nativeMethod":false,"methodName":"remove","className":"java.lang.ref.ReferenceQueue","lineNumber":164},{"fileName":"Finalizer.java","nativeMethod":false,"methodName":"run","className":"java.lang.ref.Finalizer$FinalizerThread","lineNumber":209}],"Thread[DestroyJavaVM,5,main]":[],"Thread[Signal Dispatcher,9,system]":[],"Thread[Thread-1,5,main]":[{"fileName":"Thread.java","nativeMethod":true,"methodName":"dumpThreads","className":"java.lang.Thread","lineNumber":-2},{"fileName":"Thread.java","nativeMethod":false,"methodName":"getAllStackTraces","className":"java.lang.Thread","lineNumber":1610},{"fileName":"ThreadDemo5.java","nativeMethod":false,"methodName":"run","className":"com.syf.demo.CreateThread8","lineNumber":90}],"Thread[Attach Listener,5,system]":[],"Thread[Reference Handler,10,system]":[{"fileName":"Object.java","nativeMethod":true,"methodName":"wait","className":"java.lang.Object","lineNumber":-2},{"fileName":"Object.java","nativeMethod":false,"methodName":"wait","className":"java.lang.Object","lineNumber":502},{"fileName":"Reference.java","nativeMethod":false,"methodName":"tryHandlePending","className":"java.lang.ref.Reference","lineNumber":191},{"fileName":"Reference.java","nativeMethod":false,"methodName":"run","className":"java.lang.ref.Reference$ReferenceHandler","lineNumber":153}]}
*/

		//常用方法3:
		CreateThread9 c2=new CreateThread9();
		c2.start();
		ClassLoader cl=c2.getContextClassLoader();
		System.out.println("【main线程】-"+JSONObject.toJSON(cl));
		//控制台输出
		/*【主线程】-Thread[main,5,main]
		【CreateThread9线程】-Thread[Thread-0,5,main]
		【CreateThread10线程】-Thread[Thread-1,5,main]
		【main线程】-{"uRLs":["file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/resources.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/rt.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/jsse.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/jce.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/charsets.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/jfr.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/access-bridge-64.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/cldrdata.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/dnsns.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/jaccess.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/jfxrt.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/localedata.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/nashorn.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/sunec.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/sunjce_provider.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/sunmscapi.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/sunpkcs11.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/zipfs.jar","file:/E:/software/eclipse/runTime/work/runtime_my/my001ThreadDemo1/bin/","file:/D:/apache-maven-3.3.9/repository/com/alibaba/fastjson/1.2.28/fastjson-1.2.28.jar"]}
		【CreateThread9线程】-{"uRLs":["file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/resources.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/rt.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/jsse.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/jce.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/charsets.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/jfr.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/access-bridge-64.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/cldrdata.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/dnsns.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/jaccess.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/jfxrt.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/localedata.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/nashorn.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/sunec.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/sunjce_provider.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/sunmscapi.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/sunpkcs11.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/zipfs.jar","file:/E:/software/eclipse/runTime/work/runtime_my/my001ThreadDemo1/bin/","file:/D:/apache-maven-3.3.9/repository/com/alibaba/fastjson/1.2.28/fastjson-1.2.28.jar"]}
		【CreateThread9线程】-{"uRLs":["file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/resources.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/rt.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/jsse.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/jce.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/charsets.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/jfr.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/access-bridge-64.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/cldrdata.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/dnsns.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/jaccess.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/jfxrt.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/localedata.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/nashorn.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/sunec.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/sunjce_provider.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/sunmscapi.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/sunpkcs11.jar","file:/C:/Program%20Files/Java/jdk1.8.0_131/jre/lib/ext/zipfs.jar","file:/E:/software/eclipse/runTime/work/runtime_my/my001ThreadDemo1/bin/","file:/D:/apache-maven-3.3.9/repository/com/alibaba/fastjson/1.2.28/fastjson-1.2.28.jar"]}
*/
		
		//常用方法4-返回此线程的优先级。
		CreateThread11 c3=new CreateThread11();
		c3.start();
		System.out.println(c3.getPriority()+"【main线程】-"+JSONObject.toJSON(c3));
		//控制台输出
		/*【主线程】-Thread[main,5,main]
		【CreateThread12线程】-Thread[Thread-1,5,main]
		【CreateThread12线程】-Thread[Thread-4,5,main]
		【CreateThread12线程】-Thread[Thread-5,5,main]
		5【main线程】-{"alive":false,"name":"Thread-0","id":11,"interrupted":false,"stackTrace":[],"state":"TERMINATED","priority":5,"daemon":false}
		【CreateThread12线程】-Thread[Thread-6,5,main]
		【CreateThread12线程】-Thread[Thread-2,5,main]
		【CreateThread12线程】-Thread[Thread-3,5,main]
		【CreateThread12线程】-Thread[Thread-8,5,main]
		【CreateThread12线程】-Thread[Thread-7,5,main]
		【CreateThread12线程】-Thread[Thread-9,5,main]
		【CreateThread12线程】-Thread[Thread-10,5,main]*/

		//常用方法5-返回此线程所属的线程组。 
		CreateThread13 c4=new CreateThread13();
		c4.start();
		System.out.println("【主线程】-"+JSONObject.toJSONString(c4));
	}
}



class CreateThread13 extends Thread{
	public void run() {
		CreateThread14 c=new CreateThread14();
		c.start();
		System.out.println(Thread.currentThread()+"【CreateThread13线程】-"+JSONObject.toJSONString(c));
		System.out.println(Thread.currentThread()+"【CreateThread13线程】this-"+JSONObject.toJSONString(this));
	}
}

class CreateThread14 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread()+"【CreateThread14线程】-"+JSONObject.toJSONString(this));
	}
}


/**常用方法1
 *  在当前线程的线程组和它的子组中的每一个活动线程中复制到指定的数组中。
 * @author Jane
 *
 */
class CreateThread5 extends Thread{
	private Integer num;
	public CreateThread5(Integer num) {
		this.num=num;
	}
	public void run() {
		System.out.println("【CreateThread5线程】-"+Thread.currentThread());
		CreateThread6 c=new CreateThread6();
		c.start();
		Thread [] tt= new Thread[6]  ;
		Thread.enumerate(tt);//获取当前正在运行的所有线程
		if(tt==null || tt.length==0) {
			System.out.println("空数组");
		}else {
			for(int i=0;i<tt.length;i++) {
				System.out.println(tt[i]==null?"空对象":"**"+tt[i].getName());
			}
		}
	}
	
}
class CreateThread6 extends Thread{
	public void run() {
		System.out.println("【CreateThread6线程】-"+Thread.currentThread());
	}
	
}
/**
 *  常用方法2
 *  返回所有活线程的堆栈跟踪Map。 
 * @author Jane
 *
 */
class CreateThread7 extends Thread{
	public void run() {
		System.out.println("【CreateThread7线程】-"+Thread.currentThread());
		Map<Thread, StackTraceElement[]> map=Thread.getAllStackTraces();
		System.out.println("7==="+JSONObject.toJSON(map));
		CreateThread8 c1=new CreateThread8();
		c1.start();
	}
}


class CreateThread8 extends Thread{
	public void run() {
		System.out.println("【CreateThread8线程】-"+Thread.currentThread());
		Map<Thread, StackTraceElement[]> map=Thread.getAllStackTraces();

		System.out.println("8==="+JSONObject.toJSON(map));
	}
}


/**
 * 返回该线程的上下文类加载器。 
 * @author Jane
 *
 */
class CreateThread9 extends Thread{
	public void run() {
		System.out.println("【CreateThread9线程】-"+Thread.currentThread());
		CreateThread10 c2=new CreateThread10();
		c2.start();
		ClassLoader cl=c2.getContextClassLoader();
		System.out.println("【CreateThread9线程】-"+JSONObject.toJSON(cl));
	}
}

class CreateThread10 extends Thread{
	public void run() {
		System.out.println("【CreateThread10线程】-"+Thread.currentThread());
		ClassLoader cl=this.getContextClassLoader();
		System.out.println("【CreateThread9线程】-"+JSONObject.toJSON(cl));
	}
}

class CreateThread11 extends Thread{
	public void run() {
		for(int i=0;i<1;i++) {
			CreateThread12 c2=new CreateThread12();
			c2.start();
		}
	}
}

class CreateThread12 extends Thread{
	public void run() {
		System.out.println("【CreateThread12线程】-"+Thread.currentThread());
	}
}



