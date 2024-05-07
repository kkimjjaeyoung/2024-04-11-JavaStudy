	class Student{
		String name;
		int age;						//인스턴스 변수(객체변수) : 메모리 공간을 따로 생성
		static String school_name;		//공유변수 : 한개 공간에서 사용
	}

public class 클래스_1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student();
		
		Student shim=new Student();
		Student park=new Student();
	}

}
