package tech.swoven.state;

public class SoundState implements PhoneState{

	@Override
	public void phoneRingSound() {
		System.out.println("Phone is ringing");
	}

}
