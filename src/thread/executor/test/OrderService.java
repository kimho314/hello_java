package thread.executor.test;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class OrderService {

    public void order(String orderNo) {
        try (ExecutorService executorService = Executors.newFixedThreadPool(3);) {
            InventoryWork inventoryWork = new InventoryWork(orderNo);
            ShippingWork shippingWork = new ShippingWork(orderNo);
            AccountingWork accountingWork = new AccountingWork(orderNo);

            Future<Boolean> future1 = executorService.submit(inventoryWork);
            Future<Boolean> future2 = executorService.submit(shippingWork);
            Future<Boolean> future3 = executorService.submit(accountingWork);

            Boolean result1 = null;
            Boolean result2 = null;
            Boolean result3 = null;
            try {
                result1 = future1.get();
                result2 = future2.get();
                result3 = future3.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }

            // 결과 확인
            if (result1 && result2 && result3) {
                log("모든 주문 처리가 성공적으로 완료되었습니다.");
            } else {
                log("일부 작업이 실패했습니다.");
            }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }

    }

    private static class InventoryWork implements Callable<Boolean> {

        private final String orderNo;

        public InventoryWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() {
            log("재고 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    private static class ShippingWork implements Callable<Boolean> {

        private final String orderNo;

        public ShippingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() {
            log("배송 시스템 알림: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    private static class AccountingWork implements Callable<Boolean> {

        private final String orderNo;

        public AccountingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() {
            log("회계 시스템 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }
}
