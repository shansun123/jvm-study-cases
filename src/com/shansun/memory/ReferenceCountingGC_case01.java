package com.shansun.memory;

/**
 * ���ü����㷨��ȱ�ݣ�Python��ʹ�����ü����㷨��
 * 
 * VM args: -XX:+PrintGCDetails
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-6-12
 */
public class ReferenceCountingGC_case01 {

	private ReferenceCountingGC_case01	instance	= null;

	private byte[]				bigSize		= new byte[2 * 1024 * 1024];

	public static void main(String[] args) {
		ReferenceCountingGC_case01 instA = new ReferenceCountingGC_case01();
		ReferenceCountingGC_case01 instB = new ReferenceCountingGC_case01();
		instA.instance = instB;
		instB.instance = instA;

		instA = null;
		instB = null;

		// ����instA��instB���ǻᱻ���յģ������ü����㷨������������Java����ʹ�����ü����㷨��
		System.gc();
	}

	public ReferenceCountingGC_case01 getInstance() {
		return instance;
	}

	public byte[] getBigSize() {
		return bigSize;
	}
}
