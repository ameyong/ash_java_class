package Day12;

public class PaymentGatewayTest {
    static void main(String[] args) {
        PaymentGateWay paymentGateWay;

        paymentGateWay = new Esewa();
        paymentGateWay.authorize("esewa");
        paymentGateWay = new Khalti();
        paymentGateWay.authorize("khalti");


            }
        }

