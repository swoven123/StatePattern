package tech.swoven.context;

import tech.swoven.state.PhoneState;

public class PhoneStateContext {
	
	private PhoneState phoneState;
	
	public PhoneStateContext(PhoneState phoneState) {
		this.phoneState = phoneState;
	}
	
	public void checkSound() {
		this.phoneState.phoneRingSound();
	}
}
