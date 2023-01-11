package Rewiew2;

public class Casting {
    public static void main(String[] args) {

        /*
        Casting is a convert between one type of
        data type into another
        1.Widening/implicit/automatic
        (Byte-> short->int-> long-> float -> double)
        2.Narrowing/explicit/manual
        (Double -> float-> long ->int -> short-> byte)
         */
        //Widening
        double d = 5;
        System.out.println(d); //5.0
        //narrowing
        int i=(int)5.0;
        System.out.println(i); //5

        byte b =(byte)128;
        System.out.println(b);
    }
}
