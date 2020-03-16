package behavioraldesignpattern.TemplatePattern;

public abstract class Application{
   

   abstract void initialize();
   abstract void startApp();
   abstract void closeApp();

   
   public final void run(){

     
      initialize();

     
      startApp();

     
      closeApp();
   }
}