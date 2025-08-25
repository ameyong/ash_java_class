package Day4;

public class LiteralsDemo {
    static void main(String[] args) {
        //Literals: a source code representation of fixed value
        //Literals: fixed value + data type
        //1.Integer Literal type 436 8798 8797987987 98089080 (int)
        byte b = 127;
        short s = 32767;
        int i = 2147483647 ;
        long l = 2147483647;
        long l2 = 2147483648L;
        long l3 = 9223372036854775807L;

        //2.floating literal 23.45.67.89 (double)
        float f = 32.45F;
        double d = 32.45;

        //3. boolean literals true false
        boolean bl1 = true;
        boolean bl2 = false;

        //4. Character Literals '1' 'a' '@'
        char ch1 ='a';
        char ch2 ='1';
        char ch3 ='@';
        char ch4 = '\u0000';


        //5.String literals: "fsd"  //anything inside "" is string.
        String s1 ="hello";
        String s2 = "abc@123#";
        String s3 = "123";
        String s4 = "43.24";
        String s5 = "ture";
        String s6 = "Helo, my name is Ashim";

        //6.Null Literals
        String s10 = null;

        //this is an object in java
        LiteralsDemo ob = new LiteralsDemo();
        LiteralsDemo obj = null;

    }
}
