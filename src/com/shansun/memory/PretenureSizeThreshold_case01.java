package com.shansun.memory;

/**
 * VM args: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8
 * -XX:PretenureSizeThreshold=3145728
 * 
 * �����ֱ�ӽ��������
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-6-12
 */
public class PretenureSizeThreshold_case01 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		byte[] allocation = new byte[4 * 1024 * 1024];
	}

}
