package com.shansun.classloading;

/**
 * ������������һ<br>
 * -XX:+TraceClassLoading
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-7-2
 */
public class NotInitialization_case01 {

	public static void main(String[] args) {
		/*
		 * �������õ�SubClass.value��ʵ����SuperClass�У�����ֻ���ʼ��SuperClass�������ʼ��SubClass;
		 * ���ǻ����SubClass
		 */
		System.out.println(SubClass.value);
	}

}
