package creationaldesignPattern.SingletonPattern;

public class LeaderBoardDemo {
public static void main(String args[]) {
	
	LeaderBoard lb=LeaderBoard.getLeaderboard();
	lb.showLeaderBoard();
	
}
}
