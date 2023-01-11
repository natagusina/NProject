package class4;

public class NestedIfDemo7 {
    public static void main(String[] args) {
        boolean studyHard=true;

        int salary=90000;
        if(studyHard){

            System.out.println("We get the job");

            if(salary>100000){
                System.out.println("Lets by tesla");
            }else{
                System.out.println("lets by a toyota");
            }



        }else{
            System.out.println("Its will take longer for us to get a job");
        }


    }
}
