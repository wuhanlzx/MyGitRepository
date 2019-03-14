package com.tansun;
/**
 * 
* Copyright: Copyright (c) 2019 
* 
* @ClassName: SingleTon.java
* @Description:实现单例模式
* @version: v1.0.0
* @author:lzx
* @date: 2019年3月14日 上午10:32:44 
*
 */
public class SingleTon {
	
	private static volatile SingleTon instance=null;
	
	// volatile 被它修饰的变量的值,将不会被本地线程缓存,所有对该变量的读写操作都是直接操作共享内存,
	//从而保证多个线程,能正确的处理该变量	
	
	
	
	//恶汉式单例模式 是线程安全的  空间换时间
	//private static SingleTon instance= new SingleTon();

	private SingleTon() {
		
	}
	
	//懒汉式单例模式  //线程不安全 时间换空间
	public static SingleTon getInstance(){
		if(instance==null){
			instance =new SingleTon();
		}
		
		return instance;
	}
	
	
	
	//如何并实现线程安全的懒汉式呢  在单例模式getInstance上加锁  ......这样的话会降低访问速度  
	
	
	//双重检查加锁来实现 既可以实现线程安全有能使性能不受很大影响
	//getInstance方法进入之后先检查实例对象是否存在,如果不存在才进入下面的同步代码块    第一步检查
	//进入同步代码块之后再次检查实例是否存在如果不存在那么就在同步的情况下创建一个实例        第二步检查
	
	
	//线程安全的懒汉是单例模式  //双重检查机制
	
	public static SingleTon getInstance2(){
		
		//先检查对象是否存在 ,不存在进入下面的同步代码快
		if(instance ==null){
			//再次检查对象是否存在,如果不存在那么就真的创建实例
			//同步代码块只会走一次
			synchronized (SingleTon.class) {
				if(instance==null){
					instance=new SingleTon();
				}
			}
			
		}
		return instance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
