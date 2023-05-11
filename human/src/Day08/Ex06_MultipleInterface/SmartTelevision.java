package Day08.Ex06_MultipleInterface;

//다중 구현
//public class 클래스명 implements 인터페이스A, 인터페이스B... {}
public class SmartTelevision implements SmartRemoteControl, Searchable{

	int volume;		//볼륨
	int channel;	//채널번호
	String keyword;	//검색어
	int x,y;		//터치패드 좌표

	
	@Override
	public void turnOn() {
		System.out.println("전원 ON");
	}

	@Override
	public void turnOff() {
		System.out.println("전원 OFF");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("volume: " + volume);
	}

	@Override
	public String receiveVoice(String voice) {
		System.out.println("음성 입력: " + voice);
		return "voice: " + voice;
	}

	@Override
	public int channelSearch(String keyword) {
		int channel = 0;
		
		switch (keyword) {
			case "Mnet": channel = 27;
						break;
			case "SBS":  channel = 6;
						break;
			case "KBS":  channel = 7;
						break;
			case "MBC":  channel = 11;
						break;

		}
		return channel;
	}

	@Override
	public String[] contentSearch(String keyword) {
		String[] movieContents = {"넷플릭스", "디즈니플러스", "길복순", "카지노"};
		String[] idolContents = {"BTS 콘서트", "뉴진스 뮤비", "아이브 공연"};
		String[] choiceContents;
		switch (keyword) {
		case "영화": choiceContents = movieContents;
			break;
		case "아이돌": choiceContents = idolContents;
			break;

		default: 
			String[] recommendContents 
				= {"추천 컨텐츠","메타코미디 클럽", "히밥 먹방", "2023 월드컵 개막식"};
				choiceContents = recommendContents;	
				break;
		}
		
		return choiceContents;
	}

	@Override
	public void touch(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("(x,y): " + x + "," + y);
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println("channel: " + channel);
	}

	
	
}
