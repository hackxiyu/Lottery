package com.xr.test;

import java.util.Scanner;

import com.xr.bean.SetNum;
import com.xr.view.LotteryMenu;
import com.xr.dao.JudgeWin;

public class Lottery {
	//��Ʊ����ϵͳ
	public static void main(String[] args) {
		
		//������ʾ
		LotteryMenu menu = new LotteryMenu();
		menu.show();
		
		//����������
		int[] num = new int[6];
		
		//ѡ��
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		if(choice == 0){
			System.out.println("ллʹ�ã�");
		}else if(choice == 1){
				
			//ʵ�������ɲ�Ʊ����
			SetNum stm = new SetNum();
			num = stm.set();
			System.out.println(java.util.Arrays.toString(num));
			
			//�ж��н�
			JudgeWin jw = new JudgeWin();
			int count = jw.judge(num);
			menu.showWin(count);
				
		}else{
				System.out.println("û�д�ѡ��");
			}
		
		
	}
}
