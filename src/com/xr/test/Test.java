package com.xr.test;
import com.xr.bean.SetNum;

public class Test {
	
	public static void main(String[] args) {
		//ʵ�������ɲ�Ʊ����
		SetNum stm = new SetNum();
		System.out.println("��ʼ���С�������");
		int[] num = stm.set();
		System.out.println(java.util.Arrays.toString(num));
	}
}
