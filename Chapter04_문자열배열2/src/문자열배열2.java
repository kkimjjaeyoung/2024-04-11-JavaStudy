//split
public class 문자열배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color="red, blue, black, yellow, white, pink, magenta";
		String[] colors=color.split(",");
		for (String c:colors) {
			System.out.print(c+" ");
		}
		System.out.println();
		String name="홍길동|심청이|춘향이|박문수|이순신|강감찬";
		String[] names=name.split("\\|");			// 기호(?,|,.<+,*,^,$)를 가져올 때는 역슬레쉬 2개(\\)를 주어야 인식	->	자체문자는 반드시 \\
													// ? : 둘 중 하나, | : 여러개중 하나, . : 임의의 1글자, + : 한개이상의 문자, * : 0개 이상의 문자(0포함), ^ : 시작, $ : 끝			
		for (String n:names) {
			System.out.print(n+" ");
		}
		
		
	}

}
