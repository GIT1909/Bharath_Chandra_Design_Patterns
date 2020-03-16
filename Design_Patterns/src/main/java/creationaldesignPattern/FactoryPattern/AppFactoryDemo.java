package creationaldesignPattern.FactoryPattern;

public class AppFactoryDemo {

	public static void main(String args[]) {
		AppFactory app=new AppFactory();
		App app1=app.useApp("Reddit");
		App app2=app.useApp("Twitter");
		
		app1.Action();
		app1.Reuse();
		app2.Action();
		app2.Reuse();
		
	}
	
}
