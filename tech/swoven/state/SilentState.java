package tech.swoven.state;

public class SilentState implements PhoneState {

	@Override
	public void phoneRingSound() {
		System.out.println("No Sound, phone is silent");
	}

}
