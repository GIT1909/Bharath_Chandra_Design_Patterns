package structuraldesignpattern.FacadePattern;

public class NPCDeployDemo {
public static void main(String args[]) {
	AddCharacter addNPC=new AddCharacter();
	
	addNPC.deployEnemy();
	addNPC.deployEnemy();
	addNPC.deployFriendly();
	addNPC.deployNeutral();
}
}
