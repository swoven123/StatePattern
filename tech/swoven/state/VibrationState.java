package tech.swoven.state;

public class VibrationState implements PhoneState{

	@Override
	public void phoneRingSound() {
		System.out.println("Phone is vibrating");
	}

}
