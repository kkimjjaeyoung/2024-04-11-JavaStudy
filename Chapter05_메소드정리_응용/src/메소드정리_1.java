/*
 *  메소드 : 기능처리(사용자요청 처리), 한 개의 기능만 수행 가능하게 만드는 명령문의 집합
 *  	1. 변수 선언
 *  	2. 연산 처리
 *  	3. 제어문 처리
 *   1)메소드 구조
 *   [접근지정어][옵션] 리턴형 메소드명{
 *   구현....
 *   return 값;							//return에서 종료. 중간에 올 수도 있다. 생략 불가능(void 이용시 예외)
 *   }					
 *   		//접근지정어 : 다른 클래스에서 접근하는 범위 (public, protected, private, default[같은 폴어데엇만 접근 가능]
 *   		//옵션 : default(없는 경우), static(자동메모리 할당, 공유), abstract(추상메소드, 선언), final(종단메소드, 수정불가메소드)
 *  		//리턴형 : 사용자 요청에 대한 결과값(반드시 1개만 전송)
 *  		//메소드명 : 변수식별자와 동일
 *  		//매개변수 : 여러개 사용 가능(사용자가 보내주는 값)
 *  			매개변수 전송법
 *  			1. 값 전송 : 메모리를 따로 만들어 처리(원본 유지)
 *  			2. 주소 전송 : 
 *  		//메소드 호출 : 메소드 호출시 메소드는 처음부터 끝까지 사용(이후 원래 호출한 위치로 복귀)
 *  			1-반복적인  문장이 있는 경우(반복제거)
 *  			2-구조적인 프로그램(단락-수정, 오류처리)
 *  			3-재사용(main은 다른 클래스에서 호출 불가능. 있는 그대로 호출)
 *  			4-객체 지향 프로그램은 클래스와 클래스의 상호 연결
 *  			
 */	
public class 메소드정리_1 {
	//call by value : 실제 값만 전송(다른 메모리 생성. 기본형, string)
	//call by reference : 메모리 주소를 넘겨준다(같은 메모리 제어. 배열, 클래스)
	static void rand(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[5];
		rand(nums);
		for(int i:nums) {
			System.out.print(i+" ");
		}
		
		/*int[] arr= {10,20,30,40,50};
		int[] temp=arr;
		temp[1]=200;
		System.out.println(temp[1]);
		System.out.println(arr[1]);
		*/
	}

}
