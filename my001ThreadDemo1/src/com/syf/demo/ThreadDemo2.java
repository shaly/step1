package com.syf.demo;

import java.util.Iterator;

/**
 * 
 * @author Jane
 *
 *
 1.继承Thread类
 */
class CreateThread extends Thread{
	/**
	 * run方法执行  需要线程执行的任务  代码
	 */
	public void run() {
		for (int i=0;i<500;i++) {
			System.out.print("【run() 】i="+i);
			
		}
	}
	
}

public class ThreadDemo2 {
	public static void main(String[] args) {
		System.out.println("创建线程开始");
		//1.定义一个类，继承Thread类 重写run方法
		//2.如何启动线程？
		CreateThread c=new CreateThread();
		//启动一个线程是调用start方法 不是run方法。调用run方法相当于在主线程调用一个普通的方法。
		//注意 使用多线程情况，代码不会重写往下执行，会同时并行执行。
		c.start();
		for (int i=0;i<200;i++) {
			System.out.print("{main }i="+i);
		}
		System.out.println("线程已经启动完毕");
		//3.控制台输出
//		创建线程开始
//		{main }i=0{main }i=1{main }i=2【run() 】i=0{main }i=3【run() 】i=1【run() 】i=2【run() 】i=3【run() 】i=4【run() 】i=5【run() 】i=6【run() 】i=7【run() 】i=8【run() 】i=9【run() 】i=10【run() 】i=11【run() 】i=12【run() 】i=13【run() 】i=14{main }i=4【run() 】i=15{main }i=5{main }i=6{main }i=7{main }i=8{main }i=9{main }i=10{main }i=11{main }i=12{main }i=13{main }i=14{main }i=15{main }i=16{main }i=17{main }i=18{main }i=19{main }i=20{main }i=21{main }i=22{main }i=23【run() 】i=16【run() 】i=17【run() 】i=18{main }i=24{main }i=25{main }i=26{main }i=27{main }i=28{main }i=29{main }i=30{main }i=31{main }i=32{main }i=33{main }i=34{main }i=35{main }i=36{main }i=37{main }i=38{main }i=39{main }i=40{main }i=41{main }i=42{main }i=43{main }i=44{main }i=45{main }i=46{main }i=47{main }i=48{main }i=49{main }i=50{main }i=51{main }i=52{main }i=53{main }i=54{main }i=55{main }i=56{main }i=57{main }i=58{main }i=59{main }i=60{main }i=61{main }i=62{main }i=63{main }i=64{main }i=65{main }i=66{main }i=67{main }i=68{main }i=69{main }i=70{main }i=71{main }i=72{main }i=73{main }i=74{main }i=75{main }i=76{main }i=77{main }i=78{main }i=79{main }i=80{main }i=81{main }i=82【run() 】i=19{main }i=83【run() 】i=20{main }i=84【run() 】i=21【run() 】i=22【run() 】i=23【run() 】i=24【run() 】i=25【run() 】i=26{main }i=85【run() 】i=27{main }i=86{main }i=87【run() 】i=28【run() 】i=29【run() 】i=30【run() 】i=31【run() 】i=32【run() 】i=33【run() 】i=34【run() 】i=35【run() 】i=36{main }i=88{main }i=89{main }i=90{main }i=91{main }i=92{main }i=93{main }i=94{main }i=95{main }i=96{main }i=97{main }i=98{main }i=99{main }i=100{main }i=101{main }i=102{main }i=103{main }i=104{main }i=105{main }i=106{main }i=107{main }i=108{main }i=109{main }i=110{main }i=111{main }i=112{main }i=113{main }i=114{main }i=115{main }i=116{main }i=117{main }i=118{main }i=119{main }i=120{main }i=121{main }i=122{main }i=123{main }i=124{main }i=125{main }i=126{main }i=127{main }i=128{main }i=129{main }i=130{main }i=131{main }i=132{main }i=133{main }i=134{main }i=135{main }i=136{main }i=137{main }i=138{main }i=139{main }i=140{main }i=141{main }i=142{main }i=143{main }i=144{main }i=145{main }i=146{main }i=147{main }i=148{main }i=149{main }i=150{main }i=151{main }i=152{main }i=153{main }i=154{main }i=155{main }i=156{main }i=157{main }i=158{main }i=159{main }i=160{main }i=161{main }i=162{main }i=163{main }i=164{main }i=165{main }i=166{main }i=167{main }i=168{main }i=169{main }i=170{main }i=171{main }i=172{main }i=173{main }i=174{main }i=175{main }i=176{main }i=177{main }i=178{main }i=179{main }i=180{main }i=181{main }i=182{main }i=183{main }i=184{main }i=185{main }i=186{main }i=187{main }i=188{main }i=189{main }i=190{main }i=191{main }i=192{main }i=193{main }i=194{main }i=195{main }i=196{main }i=197{main }i=198{main }i=199线程已经启动完毕
//		【run() 】i=37【run() 】i=38【run() 】i=39【run() 】i=40【run() 】i=41【run() 】i=42【run() 】i=43【run() 】i=44【run() 】i=45【run() 】i=46【run() 】i=47【run() 】i=48【run() 】i=49【run() 】i=50【run() 】i=51【run() 】i=52【run() 】i=53【run() 】i=54【run() 】i=55【run() 】i=56【run() 】i=57【run() 】i=58【run() 】i=59【run() 】i=60【run() 】i=61【run() 】i=62【run() 】i=63【run() 】i=64【run() 】i=65【run() 】i=66【run() 】i=67【run() 】i=68【run() 】i=69【run() 】i=70【run() 】i=71【run() 】i=72【run() 】i=73【run() 】i=74【run() 】i=75【run() 】i=76【run() 】i=77【run() 】i=78【run() 】i=79【run() 】i=80【run() 】i=81【run() 】i=82【run() 】i=83【run() 】i=84【run() 】i=85【run() 】i=86【run() 】i=87【run() 】i=88【run() 】i=89【run() 】i=90【run() 】i=91【run() 】i=92【run() 】i=93【run() 】i=94【run() 】i=95【run() 】i=96【run() 】i=97【run() 】i=98【run() 】i=99【run() 】i=100【run() 】i=101【run() 】i=102【run() 】i=103【run() 】i=104【run() 】i=105【run() 】i=106【run() 】i=107【run() 】i=108【run() 】i=109【run() 】i=110【run() 】i=111【run() 】i=112【run() 】i=113【run() 】i=114【run() 】i=115【run() 】i=116【run() 】i=117【run() 】i=118【run() 】i=119【run() 】i=120【run() 】i=121【run() 】i=122【run() 】i=123【run() 】i=124【run() 】i=125【run() 】i=126【run() 】i=127【run() 】i=128【run() 】i=129【run() 】i=130【run() 】i=131【run() 】i=132【run() 】i=133【run() 】i=134【run() 】i=135【run() 】i=136【run() 】i=137【run() 】i=138【run() 】i=139【run() 】i=140【run() 】i=141【run() 】i=142【run() 】i=143【run() 】i=144【run() 】i=145【run() 】i=146【run() 】i=147【run() 】i=148【run() 】i=149【run() 】i=150【run() 】i=151【run() 】i=152【run() 】i=153【run() 】i=154【run() 】i=155【run() 】i=156【run() 】i=157【run() 】i=158【run() 】i=159【run() 】i=160【run() 】i=161【run() 】i=162【run() 】i=163【run() 】i=164【run() 】i=165【run() 】i=166【run() 】i=167【run() 】i=168【run() 】i=169【run() 】i=170【run() 】i=171【run() 】i=172【run() 】i=173【run() 】i=174【run() 】i=175【run() 】i=176【run() 】i=177【run() 】i=178【run() 】i=179【run() 】i=180【run() 】i=181【run() 】i=182【run() 】i=183【run() 】i=184【run() 】i=185【run() 】i=186【run() 】i=187【run() 】i=188【run() 】i=189【run() 】i=190【run() 】i=191【run() 】i=192【run() 】i=193【run() 】i=194【run() 】i=195【run() 】i=196【run() 】i=197【run() 】i=198【run() 】i=199【run() 】i=200【run() 】i=201【run() 】i=202【run() 】i=203【run() 】i=204【run() 】i=205【run() 】i=206【run() 】i=207【run() 】i=208【run() 】i=209【run() 】i=210【run() 】i=211【run() 】i=212【run() 】i=213【run() 】i=214【run() 】i=215【run() 】i=216【run() 】i=217【run() 】i=218【run() 】i=219【run() 】i=220【run() 】i=221【run() 】i=222【run() 】i=223【run() 】i=224【run() 】i=225【run() 】i=226【run() 】i=227【run() 】i=228【run() 】i=229【run() 】i=230【run() 】i=231【run() 】i=232【run() 】i=233【run() 】i=234【run() 】i=235【run() 】i=236【run() 】i=237【run() 】i=238【run() 】i=239【run() 】i=240【run() 】i=241【run() 】i=242【run() 】i=243【run() 】i=244【run() 】i=245【run() 】i=246【run() 】i=247【run() 】i=248【run() 】i=249【run() 】i=250【run() 】i=251【run() 】i=252【run() 】i=253【run() 】i=254【run() 】i=255【run() 】i=256【run() 】i=257【run() 】i=258【run() 】i=259【run() 】i=260【run() 】i=261【run() 】i=262【run() 】i=263【run() 】i=264【run() 】i=265【run() 】i=266【run() 】i=267【run() 】i=268【run() 】i=269【run() 】i=270【run() 】i=271【run() 】i=272【run() 】i=273【run() 】i=274【run() 】i=275【run() 】i=276【run() 】i=277【run() 】i=278【run() 】i=279【run() 】i=280【run() 】i=281【run() 】i=282【run() 】i=283【run() 】i=284【run() 】i=285【run() 】i=286【run() 】i=287【run() 】i=288【run() 】i=289【run() 】i=290【run() 】i=291【run() 】i=292【run() 】i=293【run() 】i=294【run() 】i=295【run() 】i=296【run() 】i=297【run() 】i=298【run() 】i=299【run() 】i=300【run() 】i=301【run() 】i=302【run() 】i=303【run() 】i=304【run() 】i=305【run() 】i=306【run() 】i=307【run() 】i=308【run() 】i=309【run() 】i=310【run() 】i=311【run() 】i=312【run() 】i=313【run() 】i=314【run() 】i=315【run() 】i=316【run() 】i=317【run() 】i=318【run() 】i=319【run() 】i=320【run() 】i=321【run() 】i=322【run() 】i=323【run() 】i=324【run() 】i=325【run() 】i=326【run() 】i=327【run() 】i=328【run() 】i=329【run() 】i=330【run() 】i=331【run() 】i=332【run() 】i=333【run() 】i=334【run() 】i=335【run() 】i=336【run() 】i=337【run() 】i=338【run() 】i=339【run() 】i=340【run() 】i=341【run() 】i=342【run() 】i=343【run() 】i=344【run() 】i=345【run() 】i=346【run() 】i=347【run() 】i=348【run() 】i=349【run() 】i=350【run() 】i=351【run() 】i=352【run() 】i=353【run() 】i=354【run() 】i=355【run() 】i=356【run() 】i=357【run() 】i=358【run() 】i=359【run() 】i=360【run() 】i=361【run() 】i=362【run() 】i=363【run() 】i=364【run() 】i=365【run() 】i=366【run() 】i=367【run() 】i=368【run() 】i=369【run() 】i=370【run() 】i=371【run() 】i=372【run() 】i=373【run() 】i=374【run() 】i=375【run() 】i=376【run() 】i=377【run() 】i=378【run() 】i=379【run() 】i=380【run() 】i=381【run() 】i=382【run() 】i=383【run() 】i=384【run() 】i=385【run() 】i=386【run() 】i=387【run() 】i=388【run() 】i=389【run() 】i=390【run() 】i=391【run() 】i=392【run() 】i=393【run() 】i=394【run() 】i=395【run() 】i=396【run() 】i=397【run() 】i=398【run() 】i=399【run() 】i=400【run() 】i=401【run() 】i=402【run() 】i=403【run() 】i=404【run() 】i=405【run() 】i=406【run() 】i=407【run() 】i=408【run() 】i=409【run() 】i=410【run() 】i=411【run() 】i=412【run() 】i=413【run() 】i=414【run() 】i=415【run() 】i=416【run() 】i=417【run() 】i=418【run() 】i=419【run() 】i=420【run() 】i=421【run() 】i=422【run() 】i=423【run() 】i=424【run() 】i=425【run() 】i=426【run() 】i=427【run() 】i=428【run() 】i=429【run() 】i=430【run() 】i=431【run() 】i=432【run() 】i=433【run() 】i=434【run() 】i=435【run() 】i=436【run() 】i=437【run() 】i=438【run() 】i=439【run() 】i=440【run() 】i=441【run() 】i=442【run() 】i=443【run() 】i=444【run() 】i=445【run() 】i=446【run() 】i=447【run() 】i=448【run() 】i=449【run() 】i=450【run() 】i=451【run() 】i=452【run() 】i=453【run() 】i=454【run() 】i=455【run() 】i=456【run() 】i=457【run() 】i=458【run() 】i=459【run() 】i=460【run() 】i=461【run() 】i=462【run() 】i=463【run() 】i=464【run() 】i=465【run() 】i=466【run() 】i=467【run() 】i=468【run() 】i=469【run() 】i=470【run() 】i=471【run() 】i=472【run() 】i=473【run() 】i=474【run() 】i=475【run() 】i=476【run() 】i=477【run() 】i=478【run() 】i=479【run() 】i=480【run() 】i=481【run() 】i=482【run() 】i=483【run() 】i=484【run() 】i=485【run() 】i=486【run() 】i=487【run() 】i=488【run() 】i=489【run() 】i=490【run() 】i=491【run() 】i=492【run() 】i=493【run() 】i=494【run() 】i=495【run() 】i=496【run() 】i=497【run() 】i=498【run() 】i=499
	}
}
