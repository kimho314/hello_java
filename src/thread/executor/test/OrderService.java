package thread.executor.test;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class OrderService {

    public void order(String orderNo) {
        InventoryWork inventoryWork = new InventoryWork(orderNo);
        ShippingWork shippingWork = new ShippingWork(orderNo);
        AccountingWork accountingWork = new AccountingWork(orderNo);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Future<Boolean>> futures = null;
        try {
            futures = executorService.invokeAll(List.of(inventoryWork, shippingWork, accountingWork));
            // 작업 요청
            boolean result = true;
            for (Future<Boolean> future : futures) {
                try {
                    Boolean tmpResult = future.get();
                    if (!tmpResult) {
                        result = false;
                        break;
                    }
                } catch (ExecutionException e) {
                    e.printStackTrace();
                    result = false;
                    break;
                }
            }

            // 결과 확인
            if (result) {
                log("모든 주문 처리가 성공적으로 완료되었습니다.");
            } else {
                log("일부 작업이 실패했습니다.");
            }
        } catch (InterruptedException e) {
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
