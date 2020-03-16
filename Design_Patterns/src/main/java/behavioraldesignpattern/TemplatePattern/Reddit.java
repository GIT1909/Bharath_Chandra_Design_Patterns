package behavioraldesignpattern.TemplatePattern;

public class Reddit extends Application{

	@Override
	void initialize() {
		System.out.println("Reddit Initialized \n");
	}

	@Override
	void startApp() {
		System.out.println("Reddit Started\n");
	}

	@Override
	void closeApp() {
		System.out.println("Reddit ended\n");
	}

}
