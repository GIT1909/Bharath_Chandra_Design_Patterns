package behavioraldesignpattern.TemplatePattern;

public class Twitter extends Application{

	@Override
	void initialize() {
		System.out.println("Twitter Initialized \n");
	}
	@Override
	void startApp() {
		System.out.println("Twitter Started\n");
	}
	@Override
	void closeApp() {
		System.out.println("Twitter ended\n");
	}

}
