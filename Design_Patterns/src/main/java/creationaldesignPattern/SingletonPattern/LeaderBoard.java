package creationaldesignPattern.SingletonPattern;

public class LeaderBoard {

	private static LeaderBoard leaderboard=new LeaderBoard();
	
	private LeaderBoard() {
		
	}
	
	public static LeaderBoard getLeaderboard() {
		return leaderboard;
	}
	
	public void showLeaderBoard() {
		System.out.println("Showing LeaderBoard Stats\n");
	}
	
	
	
}
