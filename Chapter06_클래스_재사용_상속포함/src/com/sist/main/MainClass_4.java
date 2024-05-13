/*
 * 
 */

package com.sist.main;

 class Super{		//상속을 내리는 클래스(super/base/부모/상위 클래스)
	 int a;
	 int b;
 }
 class Sub extends Super{			//상속을 받는 클래스(sub/파생/자식/하위 클래스)
	 int c;
 }
/*class 게시판{
 * 		글쓰기()
 * 		상세보기()
 *		검색()
 *		수정()
 *		추가()
 *		삭제()
 *		답하기()
 *}
 *class 갤러리게시판 extend 게시판{
 *		파일업로드()
 *}
 */
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Super su=new Super();
		 System.out.println(su.a);
		 System.out.println(su.b);
		 Sub sub=new Sub();
		 System.out.println(sub.a);
		 System.out.println(sub.b);
		 System.out.println(sub.c);

	}

}
