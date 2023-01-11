package class3;

public class IfElse_9 {

    public static void main(String[] args) {


            char c='N';
            if(c=='M'){
                System.out.println("Nata");


            }
            String name="Sam";
//with none primitive data types such as String we can't use== symbol
            if(name.equals("Sam")){
                System.out.println("amazing student");

        }
            //! before means not !not equal
            if(!name.equals("Sam")){
                System.out.println(("Very amazing student"));
            }
    }
}
