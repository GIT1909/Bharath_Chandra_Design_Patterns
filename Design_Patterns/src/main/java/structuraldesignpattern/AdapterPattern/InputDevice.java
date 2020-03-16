package structuraldesignpattern.AdapterPattern;

public class InputDevice {

	public static void main(String[] args) {
		PlayStation ps=new PlayStation();
		ps.aimAssist();
		ps.keybindings();
		
		RazerKeyboard rzKeyboard=new RazerKeyboard();
		rzKeyboard.keybindings();
		
		
	}

}
