package order;

import lombok.Data;
import product.Product;

import java.util.List;

/**
 * 주문 데이터를 관리하기 위한 VO
 */
@Data
public class Order {
    List<Product> cart;
    OrderState orderState;
}
