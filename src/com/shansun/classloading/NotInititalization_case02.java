package com.shansun.classloading;

/**
 * ������������2: <br>
 * ͨ�����鶨���������࣬���ᴥ������ĳ�ʼ��
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-7-2
 */
public class NotInititalization_case02 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		SuperClass[] sca = new SuperClass[20];
	}
}
