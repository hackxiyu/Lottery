/**

 * 数据控制：彩票中奖判断
 * 
 */
package com.xr.dao;

public class JudgeWin {
	//定义中奖数组
	int[] win = {1,2,3,4,5,6};
	//定义判断方法
	public int judge(int[] num){
		//一样号码
		int count=0;
		for(int j=0; j<num.length; j++){
			for(int k=1; k<num.length; k++){
				if(num[j]== num[k]){
					count++;
				} 
			}
		}
		
		return count;
	}
}
