package structuraldesignpattern.FacadePattern;

public class AddCharacter {
private NPCharacter neutral;
private NPCharacter enemy;
private NPCharacter friendly;


public AddCharacter() {
	neutral=new NeutralCharacter();
	enemy=new EnemyCharacter();
	friendly=new FriendyCharacter();
}

public void deployNeutral() {
neutral.behavior();	
}

public void deployEnemy() {
	enemy.behavior();
}
public void deployFriendly() {
	friendly.behavior();
}
	
	
}
