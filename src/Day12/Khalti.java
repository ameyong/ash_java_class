package Day12;

public class Khalti implements PaymentGateWay{
    @Override
    public void authorize(String request){
        System.out.println("Payment successfully authorized by KHALTI");
    }



}
