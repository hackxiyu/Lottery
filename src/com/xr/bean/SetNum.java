/**
 * 
 * 单注彩票生成
 * 
 */
package com.xr.bean;
import java.util.Random;

public class SetNum{
	
	//实现生成方法
	public int[] set(){
		//实例化随机数生成类
		Random r = new Random();
		
		//新建数组保存数字
		int[] num = new int[6];
		
		//去0
		for(int i=0; i<num.length; i++){
			
			int temp = r.nextInt(33);
			if(temp != 0){
				num[i] = temp;
			}
//			//===================测试输出===========================
//			System.out.println("第一次随机输出");
//			System.out.println(java.util.Arrays.toString(num));
//			//====================================================
		}
		
		//判断有无重复,去0
		boolean flag = false;
		for(int j=0; j<num.length; j++){
			for(int k=1; k<num.length; k++){
				if((num[j] != 0)&&(num[k] != 0)&&
					(num[j]== num[k])){
					flag = true;
				} 
			}
//			//===================测试输出===========================
//			System.out.println("判断数组重复输出");
//			System.out.println(flag);
//			System.out.println(java.util.Arrays.toString(num));
//			//====================================================
		}
		
		//去重复
		while(!flag){
			//去0
			for(int i=0; i<num.length; i++){
				
				int temp = r.nextInt(33);
				if(temp != 0){
					num[i] = temp;
				}
			}
		}
//		//===================测试输出===========================
//		System.out.println("最后实际输出");
//		System.out.println(flag);
//		System.out.println(java.util.Arrays.toString(num));
//		//====================================================
		
		//返回数组
		return num;
		
	}
}
