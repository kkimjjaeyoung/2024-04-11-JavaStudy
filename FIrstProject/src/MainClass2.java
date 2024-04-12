//출력
/*
 * =Sysyem.out.println()	:	ln(new Line) 라인을 변경해 출력
 * =Sysyem.out.print()		:	옆으로 이어서 출력
 * =Sysyem.out.printf()		:	서식이 있는 출력을 할 때
 		%d	: 정수				10진법(0~9),	8진법(0~7),	16진법(색상),	2진법
 								10, 20		010, 		0x10		0b10(10:10L=32bit:64bit)
 		%f	: 실수				10.5, 10.5F 저장하는 메모리 크기(32bit=4byte, 64bit)
 		%c	: 문자			''	한글자만 사용 가능
 		%s	: 문자열			""	여러 문자 사용 가능
 */
public class MainClass2 {

	public static void main(String[] args) {		//자바에서는 괄호는 옆에만
		// TODO Auto-generated method stub
		System.out.println("\"따움표 추가\"");		//	\"()\"
		System.out.println("c:\\javaDev\\moive.txt");		//경로에는 역슬레쉬 2개씩	
		System.out.println("띄어\t쓰기"); 					//일정간격 띄우기
		System.out.println("내려\n쓰기");	 				//줄 바꾸기
		System.out.print("홍길동\t");						//print 같은 줄에 입력
		System.out.print("남자\t");
		System.out.print("26");							
		System.out.println("10 20 30 40 50");
		System.out.printf("%-3d%-3d%-3d%-3d%-3d%-3d",10,20,30,40,50);		// ooo, ()10=+, 10=-
	}

}
