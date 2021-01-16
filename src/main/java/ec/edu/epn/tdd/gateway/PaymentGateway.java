package ec.edu.epn.tdd.gateway;

public interface PaymentGateway {

    public PaymentResponse requestPayment(PaymentRequest paymentRequest);

}
