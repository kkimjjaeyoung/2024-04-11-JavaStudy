//초기화 블록 사용법

import javax.lang.model.element.Element;
import javax.swing.text.Document;

import org.jsoup.Jsoup;

class Recipe2{
	String title;
	String chef;
	String hit;
}
class RecipeSystem{
	Recipe2[] recipes=new Recipe2[40];		//선언만 가능		//Recipe의 배열
	
			{								// 초기화 블록			//구
				//배열에 데이터 초기화
				try {
					Document doc=Jsoup.connect("https://www.10000recipe.com/recipe/list.html").get(); 		//문서 저장(HTML 저장) 클래스, doc안에 모든 데이터 저장
					Element title =doc.select("");
					Element chef =doc.select("");
					Element hit =doc.select("");
					
					for(int i=0; i<title.size(); i++) {
						recipes[i] =new Recipe2();
						recipes[i].title=title.get(i).text();
						recipes[i].chef=chef.get(i).text();
						recipes[i].hit=hit.get(i).text();
					}
				}
				catch(Exception ex) {}
			}
}

public class 클래스_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecipeSystem rs=new RecipeSystem();
		int i=1;
		for(Recipe2 r:rs.recipes) {
			System.out.println("레시피명:"+r.title);
			System.out.println("쉐프명:"+r.chef);
			System.out.println(r.hit);
			System.out.println("==");
		}
		
	}

}
