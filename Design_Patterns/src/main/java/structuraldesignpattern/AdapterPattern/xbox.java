package structuraldesignpattern.AdapterPattern;

public class xbox implements Controller{

	public void keybindings() {
		System.out.println("Xbox controller keybindings have been configured\n");		

	}

	public void aimAssist() {
   System.out.println("AimAssist is enabled\n");
	}

}
