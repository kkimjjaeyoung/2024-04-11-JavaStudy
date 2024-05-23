/*
 * 제네릭
 *  classnmae(클래스명	)			//object->클래스명으로 간주
 *  
 *  A<interger>
 *  	//데이터형 통일화: 리턴형/매개변수를 한번에 변경해 프로그램에 맞게 변경
 *  	//arraylist는 이미 만들어진 상태. 프로그래머가 어떤 데이터를 사용할지 모른다(아무 데이터나 관리:object)
 *  	//리턴형/매개변수 -> object(데이터사용시 형변환 후 사용)
 *  
 *  데이터형을 변경할수 있는 제네릭
 *  <T> type : c;ass
 *  <E> element : class
 *  <K> <V> : value
 */

package com.sist.util;

class Box<E>{
	E e;
	public void setE(E e) {
		this.e=e;
	}
	public E getE() {
		return e;
	}
}

public class 컬랙션_제네릭_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box=new Box<String>();
		box.
	}

}
