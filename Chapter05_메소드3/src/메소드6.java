/*
 * 5개 정수->넘겨주면->정렬	(asc[올림차순], desc[내림차순])
 * 		선택정렬 : 1개를 선택해서 변경
 * 		버블정렬 : 인접한 데이터끼리 변경
 * 	1.2차 for문
 * 		for(초기값; 조건식; 증가식) {
 * 			for(초기값; 조건식; 증가식) {			//true일 경우 1차의 증가식으로 이동, false일때 종료
 * 			반복 출력 문장
 * 			}
 * 		}
 */
public class 메소드6 {
	static int[] sort(int type, int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(type==1) {
					bCheck=arr[i]<arr[j]
				}
				else bCheck=arr[i]
				
					int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
				}
			}
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("변경전");
		for(int i:arr) {					//for-each 구문 (출력 전용) : front-end에 사용
			System.out.print(i+" ");
		}
		System.out.println("변경후");
		arr=sort(arr);
		for(int i:arr) {					//for-each 구문 (출력 전용) : front-end에 사용
			System.out.print(i+" ");
		}
	}

}
