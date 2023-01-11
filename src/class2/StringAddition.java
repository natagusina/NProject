package class2;

public class StringAddition {
    public static void main(String[] args) {
        String firstName="George";
        String lastName="Michael";
        System.out.println(firstName+lastName);

        /*
        java executes code from top to bottom but if we have multiple operations on the same
        lines it executes them from left to right
         */
        System.out.println("*****"+firstName+" "+lastName+"*****");
        System.out.println(firstName+" "+lastName);
    }
}
