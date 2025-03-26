package business;

public interface OrderService {
    void getOrderById();
    void verifyCustomer();
    void decreaseUserBalance();
    void increaseSellerBalance();
    void decreaseStockCount();
    void sendEmailToSeller();
}
