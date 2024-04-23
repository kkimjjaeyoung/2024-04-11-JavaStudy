
public class 문자열6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alpha="ABCDEFGHIJ";
		//1->c~j
		//2->efg
		System.out.println(alpha.substring(2));
		System.out.println(alpha.substring(4,7));
		
		String id=" admin ";
		System.out.println(id+"의 문자 갯수:"+id.length());			//공백도 문자 취급
		
		id=id.trim();
		System.out.println(id+"문자 갯수"+id.length()); 			// trim() : 좌우공백제거
		
		String msg="Hello Java";
		System.out.println(msg.indexOf("a"));
		System.out.println(msg.lastIndexOf("a"));
		
		String ext="Hello.java";
		System.out.println(ext.substring(ext.indexOf(".")+1));
	}

}
