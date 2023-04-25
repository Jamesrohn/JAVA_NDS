package Day04.Class;

public class Pikachu {
		//클래스		:객체를 정의 하는 설계도
		//멤버		:변수, 메소드
	
		//변수
		public int energy;
		public String type;
		public int level;
		
		
		//기본생성자
		public Pikachu() {
			this(100,"전기");
			//this.energy = 100;
			//this.type = "전기";
			//this.level = 1;
		}
		
		//생성자 자동완성
		//alt + shift + S -> O
		//매개변수가 있는 생성자
		//메소드(생성자) 오버로딩 - "메소드 중복 정의"
		public Pikachu(int energy, String type) {
			//this : 객체 자기 자신을 가리키는 레퍼런스
			this (energy,type,1);
			//this.energy = energy;
			//this.type = type;
		}

		public Pikachu(int energy, String type, int level) {
			this.energy = energy;
			this.type = type;
			this.level = level;
		}

		//메소드
		//접근지정자 반환 타입 메소드명(매개변수) {  }
		public String aAttak() {
			return "십만볼트";
		}
	
		public String bAttak() {
			return "전광석화";
		}

		@Override
		public String toString() {
			return "Pikachu [energy=" + energy + ", type=" + type + ", level=" + level + "]";
		}
		
	
}
