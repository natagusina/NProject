package class6;

public class WhileLoops7 {
    public static void main(String[] args) {
        int number=1;
        boolean flag=true;
        while (flag){
            System.out.println(number);
            if(number>3){
                flag=false;
            }
            number++;
        }
    }
}
