
public enum State {
	gas, solid, liq, artificial;
	
	public static State stateFactory(String state) {
		switch (state) {
		case "gas" :
			return State.gas;
		case "solid" :
			return State.solid;
		case "liq" :
			return State.liq;
		case "artificial" :
			return State.artificial;
			default :
				return null;
		}
	}
}
