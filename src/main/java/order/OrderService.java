package order;

import product.Product;

import java.util.List;

/**
 * 상품 구매 등 주문에 대한 기능을 수행한다.
 */
public interface OrderService {
    /**
     * 장바구니에 상품을 저장한다.
     * @param product 장바구니에 넣을 상품
     * @return 현재 장바구니에 담겨있는 상품들
     */
    List<Product> addProductInCard(Product product);
    /*
       Product 때문에 결합도가 강해지진 않을까?
       그렇다고 id만 가지고 있기에도 결국 다시 request를 보내야 하는건데?
       데이터 때문에 결합도가 높아지는 것이 문제가 될 수 있을 것 같은데
     */



}
