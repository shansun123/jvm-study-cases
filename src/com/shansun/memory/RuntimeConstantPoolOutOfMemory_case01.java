package com.shansun.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * VM args: -XX:PermSize=10M -XX:MaxPermSize=10M
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-6-9
 */
public class RuntimeConstantPoolOutOfMemory_case01 {

	public static void main(String[] args) {
		// ʹ��List�����ų����ص����ã�����FullGC���ճ�������Ϊ
		List<String> list = new ArrayList<String>();

		// 10MB�����ô���Integer��Χ���㹻����OOM��
		int i = 0;
		while (true) {
			list.add(String.valueOf(i++).intern());
		}
	}

}
