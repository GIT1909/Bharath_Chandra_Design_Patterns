package behavioraldesignpattern.TemplatePattern;

public class RunApplication {

public static void main(String [] args) {
	
	Application app= new Reddit();
	app.run();
	
	
	app=new Twitter();
	app.run();
	
	
}
}
