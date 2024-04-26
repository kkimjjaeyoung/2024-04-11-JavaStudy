// 알파벳 10개 난수 후 DESC 버블정령
// 중복없는 알파벳 

import java.util.*;
public class 배열_for_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alp=new char[10];						//배열 생성
		for(int i=0; i<alp.length; i++){				
			alp[i]=(char)((Math.random()*26)+65);		//난수생성
			for(int j=0; j<i; j++) {					//중복 제거
				if(alp[i]==alp[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(alp));
		
		for(int i=0; i<alp.length; i++) {
			for(int j=0; j<alp.length-1-i; j++) {
				if(alp[j]>alp[j+1]) {
					char temp=alp[j];
					alp[j]=alp[j+1];
					alp[j+1]=temp;
				}
			}
			System.out.println("과정ASC"+Arrays.toString(alp));
		}
		for(int i=0; i<alp.length; i++) {
			for(int j=0; j<alp.length-1-i; j++) {
				if(alp[j]<alp[j+1]) {
					char temp=alp[j];
					alp[j]=alp[j+1];
					alp[j+1]=temp;
				}
			}
			System.out.println("과정DESC"+Arrays.toString(alp));
		}
		System.out.println(Arrays.toString(alp));	
		}
	}
