package com.sist.main2;

class AA{
	int a=10;
	int b=20;
	public void aaa() {
		System.out.println("A:aaa() call...");
	}
}
class BB extends AA{
	int c=30;
	public void aaa() {
		System.out.println("B:aaa() call..");
	}
	public void bbb() {
		System.out.println("B:bbb() call");
	}
}

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ㅁㅁ영역");
		AA aa=new AA();				//AA에 설정된변수만 호출 가능
		System.out.println(aa.a);
		System.out.println(aa.b);
		aa.aaa();
		System.out.println("ㅠㅠ영역");
		BB bb=new BB();
		System.out.println(bb.c);
		bb.aaa();
		bb.bbb();
		System.out.println(bb.a);
		System.out.println(bb.b);
		System.out.println("AA:new BB()");
		AA cc=new BB();
		System.out.println(cc.a);
		System.out.println(cc.b);
		cc.aaa();
	}

}
