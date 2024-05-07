/*static과 instance 변수의 차이
 * 	static : 메모리 공간 1개 생성(모든 객체가 공유)
 * 	instance : new 사용시마다 메모리 공간 따로 생성
*/

class Member{
	String name;
	String address;
	
}

class MemberSystem{
	static Member[] Members=new Member[3];			//배열은 객체생성이 아닌 저장공간만 생성
	static int index=0;
}
public class 클래스_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberSystem ms1=new MemberSystem();
		ms1.Members[ms1.index]=new Member();
		ms1.Members[ms1.index].name="홍길동";
		ms1.Members[ms1.index].address="서울";
		ms1.index++;
		ms1.Members[ms1.index]=new Member();
		ms1.Members[ms1.index].name="심청이";
		ms1.Members[ms1.index].address="경기";
		ms1.index++;
		ms1.Members[ms1.index]=new Member();
		ms1.Members[ms1.index].name="박문수";
		ms1.Members[ms1.index].address="인천";
		ms1.index++;
		
		for(Member m:ms1.Members) {
			System.out.println(m.name+","+m.address);
		}
		
		MemberSystem ms2=new MemberSystem();
		ms2.Members[ms2.index]=new Member();
		ms2.Members[ms2.index].name="홍길동";
		ms2.Members[ms2.index].address="서울";
		ms2.index++;
		ms2.Members[ms2.index]=new Member();
		ms2.Members[ms2.index].name="심청이";
		ms2.Members[ms2.index].address="경기";
		ms2.index++;
		ms2.Members[ms2.index]=new Member();
		ms2.Members[ms2.index].name="박문수";
		ms2.Members[ms2.index].address="인천";
		ms2.index++;
		
		for(Member m:ms2.Members) {
			System.out.println(m.name+","+m.address);
		}
	}
	


}
