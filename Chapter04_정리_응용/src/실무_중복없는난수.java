
import java.util.*;
public class 실무_중복없는난수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto=new int[6];
		int su=0;
		boolean bCheck=false;
		for(int i=0; i<lotto.length; i++) {
			bCheck=true;
			while(bCheck) {					//중복이면 다시 수행, 중복이 없을시 종료 후 저장
				su=(int)(Math.random()*45)+1;		//난수발생
				bCheck=false;						
				for(int j=0; j<i; j++) {			//중복숫자가 저장되었는지 비교
					if(lotto[j]==su) {
						bCheck=true;
						break;
					}
				}
			}
			lotto[i]=su;
		}
		System.out.println(Arrays.toString(lotto));
	}

}
