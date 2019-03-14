package com.tansun;
/**
 * 
* Copyright: Copyright (c) 2019 
* 
* @ClassName: SingleTon.java
* @Description:ʵ�ֵ���ģʽ
* @version: v1.0.0
* @author:lzx
* @date: 2019��3��14�� ����10:32:44 
*
 */
public class SingleTon {
	
	private static volatile SingleTon instance=null;
	
	// volatile �������εı�����ֵ,�����ᱻ�����̻߳���,���жԸñ����Ķ�д��������ֱ�Ӳ��������ڴ�,
	//�Ӷ���֤����߳�,����ȷ�Ĵ���ñ���	
	
	
	
	//��ʽ����ģʽ ���̰߳�ȫ��  �ռ任ʱ��
	//private static SingleTon instance= new SingleTon();

	private SingleTon() {
		
	}
	
	//����ʽ����ģʽ  //�̲߳���ȫ ʱ�任�ռ�
	public static SingleTon getInstance(){
		if(instance==null){
			instance =new SingleTon();
		}
		
		return instance;
	}
	
	
	
	//��β�ʵ���̰߳�ȫ������ʽ��  �ڵ���ģʽgetInstance�ϼ���  ......�����Ļ��ή�ͷ����ٶ�  
	
	
	//˫�ؼ�������ʵ�� �ȿ���ʵ���̰߳�ȫ����ʹ���ܲ��ܴܺ�Ӱ��
	//getInstance��������֮���ȼ��ʵ�������Ƿ����,��������ڲŽ��������ͬ�������    ��һ�����
	//����ͬ�������֮���ٴμ��ʵ���Ƿ���������������ô����ͬ��������´���һ��ʵ��        �ڶ������
	
	
	//�̰߳�ȫ�������ǵ���ģʽ  //˫�ؼ�����
	
	public static SingleTon getInstance2(){
		
		//�ȼ������Ƿ���� ,�����ڽ��������ͬ�������
		if(instance ==null){
			//�ٴμ������Ƿ����,�����������ô����Ĵ���ʵ��
			//ͬ�������ֻ����һ��
			synchronized (SingleTon.class) {
				if(instance==null){
					instance=new SingleTon();
				}
			}
			
		}
		return instance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
