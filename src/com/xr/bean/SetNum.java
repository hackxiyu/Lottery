/**
 * 
 * ��ע��Ʊ����
 * 
 */
package com.xr.bean;
import java.util.Random;

public class SetNum{
	
	//ʵ�����ɷ���
	public int[] set(){
		//ʵ���������������
		Random r = new Random();
		
		//�½����鱣������
		int[] num = new int[6];
		
		//ȥ0
		for(int i=0; i<num.length; i++){
			
			int temp = r.nextInt(33);
			if(temp != 0){
				num[i] = temp;
			}
//			//===================�������===========================
//			System.out.println("��һ��������");
//			System.out.println(java.util.Arrays.toString(num));
//			//====================================================
		}
		
		//�ж������ظ�,ȥ0
		boolean flag = false;
		for(int j=0; j<num.length; j++){
			for(int k=1; k<num.length; k++){
				if((num[j] != 0)&&(num[k] != 0)&&
					(num[j]== num[k])){
					flag = true;
				} 
			}
//			//===================�������===========================
//			System.out.println("�ж������ظ����");
//			System.out.println(flag);
//			System.out.println(java.util.Arrays.toString(num));
//			//====================================================
		}
		
		//ȥ�ظ�
		while(!flag){
			//ȥ0
			for(int i=0; i<num.length; i++){
				
				int temp = r.nextInt(33);
				if(temp != 0){
					num[i] = temp;
				}
			}
		}
//		//===================�������===========================
//		System.out.println("���ʵ�����");
//		System.out.println(flag);
//		System.out.println(java.util.Arrays.toString(num));
//		//====================================================
		
		//��������
		return num;
		
	}
}
