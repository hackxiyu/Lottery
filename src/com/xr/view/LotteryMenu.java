/**
 * 
 * ��Ʊ����
 * 
 */
package com.xr.view;

public class LotteryMenu {
	//��ʾ�������
	public void show(){
		//������ʾ
		System.out.println("=====��Ʊ����ϵͳ=====");
		System.out.println("===0---�˳�===");
		System.out.println("===1---����===");
		System.out.println("=================");
	}
	
	//�н���ʾ 
	public void showWin(int count){
		
		switch(count){
			case 0:
			case 1:
			case 2:
			case 4:{
				System.out.println("δ�н�");
				break;
			}
			case 5:{
				System.out.println("���Ƚ����ֽ�10Ԫ");
				break;
			}
			case 6:{
				System.out.println("���Ƚ����ֽ�100Ԫ");
				break;
			}
		}
	}
}
