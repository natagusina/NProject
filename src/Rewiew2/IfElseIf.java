package Rewiew2;

public class IfElseIf {
    public static void main(String[] args) {

        /*
        When we have more condition to test
        if(boolean condition){
        code A} else if{
        Code  B} else if{Code C
        }
         */
         int homework=25;
         if(homework>25){
             System.out.println("Great job");
         }else if(homework>20){
             System.out.println("Good job");
         }else if(homework>10){
             System.out.println("Ok job");
         }else{
             System.out.println("Not good job");
         }

         String browser = "chrome";
         if(browser.equals("chrome")){
             System.out.println("Test case will be executed in chhrome");
             }else if (browser.equals("safari")){
             System.out.println("Test case will be executed in safari");

         }

    }
}
