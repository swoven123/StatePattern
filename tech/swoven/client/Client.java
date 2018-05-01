package tech.swoven.client;

import tech.swoven.context.PhoneStateContext;
import tech.swoven.state.PhoneState;
import tech.swoven.state.VibrationState;

public class Client {
	
	public static void main(String[] args) {
		
		PhoneState pState = new VibrationState();
		
		PhoneStateContext context = new PhoneStateContext(pState);
		context.checkSound();
	
	}
}
