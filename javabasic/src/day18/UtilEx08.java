package day18;

import java.util.ArrayList;

/*
나라와 수도 맞추기 게임을 만들어 보세요. 
1) 나라이름(country)과 수도(capital)로 구성된 Nation클래스를 작성하고,
	ArrayList<Nation> 컬렉션을 이용하여 아래 실행 예시와 같이 작동되도록 
	프로그램을 작성하세요.
실행예시:
	** 수도 맞추기 게임을 시작합니다 **
	입력:1, 퀴즈:2, 종료:3 >> 1 (사용자가 입력)
	현재 8개의 나라와 수도가 입력되어 있습니다.
	나라와 수도 입력9>> 한국 서울
	나라와 수도 입력10>> 그리스 아테네
	그리스는 이미 있습니다!!
	나라와 수도 입력10>> 호주 시드니
	나라와 수도 입력11>> 이탈리아 로마
	나라와 수도 입력12>> 그만
	입력:1, 퀴즈:2, 종료:3 >> 2
	호수의 수도는? 시드니
	정답!!
	독일의 수도는? 하얼빈
	아닙니다!!
	멕시코의 수도는? 하얼빈
	아닙니다!!
	이탈리아의 수도는? 로마
	정답!!
	한국의 수도는? 서울
	정답!!
	영국의 수도는? 그만
	입력:1, 퀴즈:2, 종료:3 >> 3
	게임을 종료합니다.
*/
class Nation{
	private String country, capital;
	
}
class CapitalGame{
	ArrayList<Nation> nation = new ArrayList<Nation>();
	
	
	
	void run() {}
}
public class UtilEx08 {
	public static void main(String[] args) {
		
		CapitalGame game = new CapitalGame();
		game.run();
	}
}
