package com.shansun.memory;

/**
 * VM args: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-6-12
 */
public class MinorGC_case01 {

	private static final int	_1MB	= 1024 * 1024;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte[] allocation1, allocation2, allocation3, allocation4;

		allocation1 = new byte[2 * _1MB];
		allocation2 = new byte[2 * _1MB];
		allocation3 = new byte[2 * _1MB];
		
		// ��������һ��Minor GC����Ϊ�����ֻ��8M���ÿռ�
		allocation4 = new byte[4 * _1MB];
	}

}
