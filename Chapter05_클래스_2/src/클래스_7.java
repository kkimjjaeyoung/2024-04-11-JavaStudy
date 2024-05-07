

class shiksin{
	double score;
	String title;
	String loc;
	String menu;
}

public class 클래스_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shiksin s1=new shiksin();
		s1.title="새벽집 청담동점";
		s1.loc="청담동";
		s1.menu="꽃등심(150g), 양념갈비(260g), 생고기(150g), 불고기(200g), 샤브샤브(160g), 육회(200g), 국수전골, 간장게장, 한우 갈비탕, 육회비빔밥, 따로국밥, 콩나물 국밥, 멸치김치찌개, 돼지김치찌개, 조랭이만두국, 된장찌개, 냉면";
		String[] menus=s1.menu.split(",");				//문자열 배열
		
		System.out.println("업체명:"+s1.title);
		System.out.println("평점:"+s1.score);
		System.out.println("지역:"+s1.loc);
		System.out.println("메뉴(menu)");
		for(String m:menus) {
			System.out.println("o "+m.trim());
		}
	}

}
