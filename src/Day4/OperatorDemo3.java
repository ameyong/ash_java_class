package Day4;

public class OperatorDemo3 {
    static void main(String[] args) {
        //3.Increment/Decrement Operators
        //++ --
        //post pre
        //a++ ++a a-- --a

        int a = 10;
        System.out.println(a);
        a++; //a+=1 or a++ (post increment)
        System.out.println(a);

        int x = 5;
        System.out.println(x);//5
        System.out.println(x++);//5
        System.out.println(x);//6
        System.out.println(++x);//7

        int m = 8;
        int n = m++;
        System.out.println(m);//9
        System.out.println(n);//8

        int b = 6;
        int c = b++;
        System.out.println(b);
        b++;
        System.out.println(b);//7
        System.out.println(c);//6

    }

}
