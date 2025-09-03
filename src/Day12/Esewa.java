package Day12;

public class Esewa implements PaymentGateWay{

    @Override
    public void authorize(String request){
        System.out.println("Payment authorized successfully by ESEWA");
    }
}
