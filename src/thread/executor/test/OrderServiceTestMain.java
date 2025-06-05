package thread.executor.test;

public class OrderServiceTestMain {

    public static void main(String[] args) {
        String orderNo = "Order#1234"; // 예시 주문 번호
        OrderService orderService = new OrderService();
        orderService.order(orderNo);
    }
}
