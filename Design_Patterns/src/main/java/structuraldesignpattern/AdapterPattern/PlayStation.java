package structuraldesignpattern.AdapterPattern;

public class PlayStation implements Controller{

	public void keybindings() {
		System.out.println("Playstation controller keybindings have been configured\n");		

	}

	public void aimAssist() {
   System.out.println("AimAssist is enabled\n");
	}

}
