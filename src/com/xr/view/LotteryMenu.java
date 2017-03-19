/**
 * 
 * 彩票界面
 * 
 */
package com.xr.view;

public class LotteryMenu {
	//显示界面设计
	public void show(){
		//界面显示
		System.out.println("=====彩票生成系统=====");
		System.out.println("===0---退出===");
		System.out.println("===1---生成===");
		System.out.println("=================");
	}
	
	//中奖显示 
	public void showWin(int count){
		
		switch(count){
			case 0:
			case 1:
			case 2:
			case 4:{
				System.out.println("未中奖");
				break;
			}
			case 5:{
				System.out.println("二等奖，现金10元");
				break;
			}
			case 6:{
				System.out.println("二等奖，现金100元");
				break;
			}
		}
	}
}
