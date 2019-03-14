package com.tansun;

import java.util.ArrayList;
/**
 * ����ģʽ
 *
 * @author
 *
 */
public class Multipleton {
	// ��������
	private static final int N = 10;
	// ���N��ʵ�����������
	private static ArrayList<Multipleton> list = new ArrayList<Multipleton>(N);
	// ÿ���������� ��ʶ
	private int no;

	// ˽�й��췽�� ��ֹ���Ӧ�ó���ʵ����
	private Multipleton(int no) {
		this.no = no;
		System.out.println("-- Create Multipleton Object[" + no + "]!");
	}

	// ʵ����N������ʵ��
	static {
		// ���Multipleton����ʵ��
		for (int i = 0; i < N; i++) {
			list.add(new Multipleton(i));
		}
	}

	/**
	 * ������ ʵ������
	 */
	public static Multipleton getRandomInstance() {
		// ����������
		int num = (int) (Math.random() * N);
		// ���list�еĶ���ʵ��
		return list.get(num);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
}
