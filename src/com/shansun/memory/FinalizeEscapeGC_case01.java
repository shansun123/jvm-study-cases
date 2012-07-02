package com.shansun.memory;

/**
 * GCʱ�������������
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-6-12
 */
public class FinalizeEscapeGC_case01 {

	private static FinalizeEscapeGC_case01	SAVE_HOOK	= null;

	public void isAlive() {
		System.err.println("Yes, I'm still alive!");
	}

	public static void main(String[] args) throws InterruptedException {
		SAVE_HOOK = new FinalizeEscapeGC_case01();

		// �����һ�γɹ���������
		SAVE_HOOK = null;

		System.gc();

		// GC��Ҫʱ��
		Thread.sleep(1000);

		if (SAVE_HOOK != null) {
			SAVE_HOOK.isAlive();
		} else {
			System.err.println("No, I'm dead!");
		}

		// ����ڶ�����������ʧ�ܡ�Finalizeֻ��ִ��һ��
		SAVE_HOOK = null;

		System.gc();

		// GC��Ҫʱ��
		Thread.sleep(1000);

		if (SAVE_HOOK != null) {
			SAVE_HOOK.isAlive();
		} else {
			System.err.println("No, I'm dead!");
		}
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.err.println("Finalize method executed!");
		FinalizeEscapeGC_case01.SAVE_HOOK = this;
	}
}
