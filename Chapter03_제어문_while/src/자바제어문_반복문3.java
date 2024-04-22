/*
 *  A~Z 까지(for), Z~A까지(while)
 */
public class 자바제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (char al='A'; al<='Z'; al++) {
			System.out.println(al);
		}
		char al='Z';
		while (al<='A') {
			System.out.println(al);
			al++;
		}

	}

}
