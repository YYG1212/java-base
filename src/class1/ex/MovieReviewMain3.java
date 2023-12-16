package class1.ex;

public class MovieReviewMain3 {
    public static void main(String[] args) {
       ProductOrder[] productOrders = new ProductOrder[3];

       ProductOrder order1 = new ProductOrder();
       order1.productName = "두부";
       order1.price = 2000;
       order1.quantity = 1;
       productOrders[0] = order1;

       ProductOrder order2 = new ProductOrder();
       order2.productName = "김치";
       order2.price = 5000;
       order2.quantity = 2;
       productOrders[1] = order2;

       ProductOrder order3 = new ProductOrder();
       order3.productName = "콜라";
       order3.price = 1500;
       order3.quantity = 2;
       productOrders[2] = order3;


       int totalAmount = 0;
        for (ProductOrder productOrder : productOrders) {
            totalAmount += productOrder.price * productOrder.quantity;
            System.out.println("상품명 : " + productOrder.productName + " 가격 : " + productOrder.price + " 수량 : " + productOrder.quantity);
        }
        System.out.println("총 가격 : " + totalAmount);
    }
}
