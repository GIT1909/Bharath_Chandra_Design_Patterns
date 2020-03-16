package creationaldesignPattern.FactoryPattern;

public class AppFactory {

	public App useApp(String Appname) {
		   if(Appname == null){
		         return null;
		      }		
		      if(Appname.equalsIgnoreCase("Twitter")){
		         return new Twitter();
		         
		      } else if(Appname.equalsIgnoreCase("Reddit")){
		         return new Reddit();
		         
		      } 
		      
		      return null;
	}
	
}
