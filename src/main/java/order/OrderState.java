package order;

public enum OrderState {
    ORDER_RECEIVED("주문접수"),
    PAYMENT_COMPLETED("결제완료"),
    PRODUCT_PREPARATION("상품준비중"),
    SHIPPING("배송중"),
    COMPLETED("배송완료"),
    CANCELLATION("취소"),
    CANCELLATION_DONE("취소완료"),
    EXCHANGE("교환"),
    EXCHANGE_DONE("교환완료"),
    RETURN("반품"),
    RETURN_DONE("반품완료"),
    FAIL("주문실패");

    private final String state;

    OrderState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
