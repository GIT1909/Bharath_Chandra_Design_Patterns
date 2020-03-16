package behavioraldesignpattern.mediatorPattern;

public class ChatBox {

	public static void showMessage(User u,String Message) {
		System.out.println(u.getName()+": "+Message);
	}
}
