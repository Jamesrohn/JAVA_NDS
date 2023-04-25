package Day04.Class;

//상속
//-키워드 :  자식 클래스 extends 부모클래스{ }
public class Raichu extends Pikachu {

	//생성자 자동 완성
	//alt + shift + S -> C
	public Raichu() {
		super(200, "슈퍼전기",20);
		// TODO Auto-generated constructor stub
	}

	public Raichu(int energy, String type) {
		super(energy, type, 20);
		// TODO Auto-generated constructor stub
	}
	public Raichu(int energy, String type, int level) {
		super(energy, type, level);
		// TODO Auto-generated constructor stub
	}
	
	//메소드 오버라이딩 : 메소드 재 정의
	//오버라이딩 자동 완성 : alt +shift + S -> V
	@Override
	public String aAttak() {
		// TODO Auto-generated method stub
		return "백만볼트";
	}

	@Override
	public String bAttak() {
		// TODO Auto-generated method stub
		return "볼트체인지";
	}
	public String cAttack() {
		if (level >= 40)
			return "아이언테일";
		else
			return "(사용불가)";
	}
	
	
	
	
}
