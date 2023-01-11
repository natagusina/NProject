package class3;

public class TypeCasting_5 {

    public static void main(String[] args) {
        long number=125;
        byte shorterNumber=(byte)number;
        System.out.println(shorterNumber);

        float eggs=12.5f;
        int wholePart=(int)eggs; //because we cant have in int decimals.
        System.out.println(wholePart);

        byte b=10;
        int number2=b;
        short c=(short)number2;
        System.out.println(b);
        /*
        if we try to store the contents from a smaller box to a larger box java
         doesn't complain because the content can easily fit inside the larger box but if we try the other way
        around we get an error, so we need to type cast it to store the contents.
        */


    }
}
