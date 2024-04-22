/*
 *  1~10 출력
 *   for (int i=1; i<=10; i++) { sysout i } 	
 *   int i=1; 	while (i<=10) { sysout i 		i++ }			//같은 출력
 */
public class 자바제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=10; i++) {
		System.out.println(i+" ");
		} 	
		
		int i=1; 	
		while (i<=10) { System.out.println(i+" "); 
		i++;
		}	
	}

}
