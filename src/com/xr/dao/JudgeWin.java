/**

 * ���ݿ��ƣ���Ʊ�н��ж�
 * 
 */
package com.xr.dao;

public class JudgeWin {
	//�����н�����
	int[] win = {1,2,3,4,5,6};
	//�����жϷ���
	public int judge(int[] num){
		//һ������
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
