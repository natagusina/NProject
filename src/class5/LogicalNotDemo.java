package class5;

public class LogicalNotDemo {
    public static void main(String[] args) {
        String password="Pass123";
        if(!password.equals("Pass12")){
            System.out.println("Wrong password");

            boolean isRaining=true;

            if (isRaining) {
                System.out.println("Let's go for a walk");
            }else{
                System.out.println("Let's take the umbrella");
            }
        }
    }
}
