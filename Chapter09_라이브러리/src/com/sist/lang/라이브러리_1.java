/*
 * 라이브러리 : 자바에서 지원하는 클래스
 * 	java.lang : import 생략 가능. 가장 많이 사용되는 라이브러리
 * 		object
 * 		string
 * 		math
 * 		system
 * 		stringbuffer
 * 		wrapper			//데이터형을 클래스화해 사용을 쉽게
 * 			***integer
 * 			***double
 * 			***boolean
 * 			float
 * 			byte
 * 	java.util : 필수적으로 import 사용
 * 		scanner
 * 		calendar / ***date
 * 		stringtokenizer
 * 		collection
 * 			list : ***arraylist, linkedlist, vector
 * 			set : ***hashset, tableset
 * 			map : hasttable, hashmap
 * 	java.io : 입출력
 * 		***fileinputstream / ***fileoutputstream
 * 		***filereader	/	***filewriter
 * 		inputstream	/	outputstream
 * 		***bufferedreader	/	bufferedwriter
 * 		bufferedinputstream	/	bufferedoutputstream
 * 	java.net
 * 		***urlencoder	/	urldecoder
 * 		socket	/	serversocket
 * 		url
 *  java.sql : 오라클
 *  	***connection
 *  	***statement
 *  	***resultset
 *  
 *  2차 자바(웹) : httpserveletrequest	 / heepservletresponse / heetsession / cookie
 *  			-> 브라우저에서 전송한 값을 받을 때
 *  								   -> 자바에서 브라우저로 결과값 전송
 *  														-> 서버에 정도 저장
 *  																		-> 클라이언트 브라우저에 정보 저장
 *  java.lang
 *  	object : 모든 클래스에 상속을 내리는 최상위 클래스(extends object)
 *  		기능 : toString : 객체를 문자열로 형변환 || clone() : 메모리를 복제 ||finalize : 소멸자(메모리해제) || equals() : 객체비교 || hashCode()		
 *  
 */

package com.sist.lang;

import java.util.*;
import java.lang.*;

public class 라이브러리_1 {
	
	public 라이브러리_1() {
	/*
	int[] arr= {10,20,30};
	int[] temp=arr;
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(temp));
	temp[0]=100;
	temp[1]=200;
	temp[2]=300;
	System.out.println(Arrays.toString(temp));
	System.out.println(Arrays.toString(arr));
	}
	*/
		int[] arr= {10, 20, 30};
		int[] temp=arr.clone();
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
		System.out.println(Arrays.toString(temp));
		System.out.println(temp);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 라이브러리_1();
	}

}
