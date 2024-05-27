/*
 * java.io : 데이터 이동 통로를 만들어서 데이터를 입출력한다
 * 		스트림 : 단방향이라 읽기/쓰기를 따로 만들어야한다
 * IO : InputStream/OutputStream
 * 		송신/수신 : 자바에서는 각국의 언어를 사용가능하게 2byte를 사용가능하게 제작
 * 			1byte : 바이트스트림(~InputStream, OutputStream)
 * 			2byte : 문자스트림(~Reader, Writer)
 * 
 * 	상속도
 * 		InputStream->FileInputStream->bufferedInputStream
 * 		outputStream->FileOutputStream->BufferedOutputSteram
 * 
 * 		Reader->FileReader->BufferedReader
 * 		Writer->FileWriter->BufferedWriter
 * 
 * 		ObjectInputStream/ObjectOutputStream : 객체단위 저장. (직렬화/역직렬화)
 * 
 * 	메모리 입출력 : Scanner
 * 	파일 입출력 : IO
 *  네트워크 입출력 : IO
 *  	IO 사용시 반드시 예외처리(CheckedExeption)
 *  
 *  입출력
 *   바이트스트림
 *  	입력메소드 : read() -> 한글자 읽기 : read(), read(byte[])
 *  	출력메소드 : write() -> 한글자 출력 : write(byte[]) write(int)
 *  		파일닫기 : close()
 *  문자스트림
 *  	읽기 메소드 : read(), read(char[])
 *  	쓰기 메소드 : write(char), write(char[]), write(String)
 *  필터스트림 : 파일에 있는 데이터를 메모리에 한번에 이동후 사용 (속도 빠름. Buffered~)
 *  	읽기 메소드 : readLine() -> 한줄씩 읽어오기
 *  	쓰기 메토드 : write(string)
 *  		BufferedReader/BufferedWriter ; 한번에 데이터를 한줄씩 읽는 경우 주로 사용
 *  	
 *  	명사/조사 : 파일을 이용. 형태소 분석 : 라이브러리. R/Korean-text
 *  
 *  	FileReader -> r(읽기모드)
 *  	FileWriter -> w(쓰기모드) : create(덮어쓰기), a(쓰기모드) : append(기존데이터 결합)
 *  		
 *  		new FileWiter("파일명") -> w
 *  		생성자 new FileWriter("파일명", true) -> a
 *  
 *  파일읽기->ArrayList에 저장후 데이터 활용
 *  Properties 	
 *  	파일의 확장자 : .properties
 *  	구분자 있으므로 사용이 편리(사용자정의)
 *  	외부 라이브러리에서 주로 사용 : 보안
 *  		데이터베이스관련(MyBatis, JPA, Spring)
 *  			필수적으로 사용 : 스프링 부트(환경설정) : properties파일/yml파일 주로 이용
 *  
 *  컬랙션+IO
 *  	1. 데이터수집 : 파일에 저장->List로 저장 후 사용
 *  	2. 데이터 수집시 중복된 데이터->제거. Set
 *  	3. 관리하는 클래스가 많은 경우 : new 메모리 누수현상(한개의 메모리만 사용가능하게 만든다)
 * 
 * 컬랙션(Collection)
 * 	List->ArrayList : 데이터 저장
 * 		1) add()
 * 		2) size()
 * 		3) get()	
 * 		4) isEmpty()
 * 		5) clear()
 * 	Set->Hashset : 중복 제거
 * 		1) add()
 * 		2) size()
 * 		3) isEmpty()
 * 		4) clear()
 * 	Map->HashMap : 클래스 관리
 * 		1) put
 * 		2) isEmpty
 * 		3) size()
 * 		4) get()
 * 		5) keySet
 * 		6) values()
 * 
 *  	
 */

package com.sist.io;

public class 라이브러리_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
