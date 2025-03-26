public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread threadVerifyCustomer = new Thread(()->{
            System.out.println("User verifying...");
            try {
                Thread.sleep(900);
                System.out.println("User verified successfully");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread threadDecreaseCustomerBalance = new Thread(()->{
            try {
                System.out.println("User's balance decreasing...");
                Thread.sleep(1700);
                System.out.println("User's balance decreased");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread threadIncreaseSellerBalance = new Thread(()->{
            try {
                System.out.println("Seller's balance increasing...");
                Thread.sleep(2000);
                System.out.println("Seller's balance decreased");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread threadDecreaseStockCount = new Thread(()->{
            try {
                System.out.println("Product's stock count increasing...");
                Thread.sleep(3000);
                System.out.println("Product's stock count increased");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread threadSendEmail = new Thread(()->{
            try {
                System.out.println("Email sending...");
                Thread.sleep(1500);
                System.out.println("Email accepted by seller");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        threadVerifyCustomer.start();
        threadVerifyCustomer.join();

        threadDecreaseCustomerBalance.start();
        threadDecreaseCustomerBalance.join();

        threadIncreaseSellerBalance.start();
        threadDecreaseStockCount.start();
        threadIncreaseSellerBalance.join();
        threadDecreaseStockCount.join();
        threadSendEmail.start();

        System.err.println("Order processing completed successfully");
    }
}