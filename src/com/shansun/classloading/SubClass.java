package com.shansun.classloading;

/**
 * ����ʹ�����ֶ�case01��<br>
 * ͨ���������ø���ľ�̬�ֶΣ����ᵼ�������ʼ��
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-7-2
 */
public class SubClass extends SuperClass {
	static {
		System.out.println("SubClass init!");
	}
}
