package Rewiew2;

public class IfElse {
    public static void main(String[] args) {

        /*
        if|(boolean condition){code A
        }else {
        code B
        }
        */
        int num=12;
        if(num>100){
            System.out.println(num+" is greater than 100");

        }else{
            System.out.println(num+" is less than 100");
        }
        String expectedButton="Enroll Today";
        if(expectedButton.equals("Enroll Today")){
            System.out.println("Test case Pass");
        }else{
            System.out.println("Test Case Failed");
        }
    }
}
