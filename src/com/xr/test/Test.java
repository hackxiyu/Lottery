package com.xr.test;
import com.xr.bean.SetNum;

public class Test {
	
	public static void main(String[] args) {
		//实例化生成彩票对象
		SetNum stm = new SetNum();
		System.out.println("开始运行。。。。");
		int[] num = stm.set();
		System.out.println(java.util.Arrays.toString(num));
	}
}
