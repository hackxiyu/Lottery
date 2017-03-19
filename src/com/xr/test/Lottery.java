package com.xr.test;

import java.util.Scanner;

import com.xr.bean.SetNum;
import com.xr.view.LotteryMenu;
import com.xr.dao.JudgeWin;

public class Lottery {
	//彩票生成系统
	public static void main(String[] args) {
		
		//界面显示
		LotteryMenu menu = new LotteryMenu();
		menu.show();
		
		//定义数组存放
		int[] num = new int[6];
		
		//选择
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		if(choice == 0){
			System.out.println("谢谢使用！");
		}else if(choice == 1){
				
			//实例化生成彩票对象
			SetNum stm = new SetNum();
			num = stm.set();
			System.out.println(java.util.Arrays.toString(num));
			
			//判断中奖
			JudgeWin jw = new JudgeWin();
			int count = jw.judge(num);
			menu.showWin(count);
				
		}else{
				System.out.println("没有此选项");
			}
		
		
	}
}
