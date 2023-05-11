package Day08.Ex03_Interface;

public class RemoteControlEx {

	public static void main(String[] args) {
		// 인터페이스 타입 객체명 = new 구현 클래스();
		RemoteControl tvRc = new Television();
		tvRc.turnOn();
		tvRc.setVolume(5);
		tvRc.setVolume(100);
		tvRc.setMute(true);		//음소거
		tvRc.turnOff();
		System.out.println();
	
		RemoteControl speakerRc = new Speaker();
		speakerRc.turnOn();
		speakerRc.setVolume(5);
		speakerRc.setVolume(-100);
		speakerRc.setMute(true);	 //음소거
		speakerRc.turnOff();
		System.out.println();
		
		RemoteControl.changeBattery();
	}
	
}
