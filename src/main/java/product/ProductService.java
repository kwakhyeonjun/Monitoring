package product;

import java.util.List;

/**
 * 서비스에서 제공하는 상품에 대한 기능을 수행한다.
 */
public interface ProductService {
    /**
     * 상품조회<p>
     * 전체 상품 중 특정 조건의 상품을 조회한다.
     * @param product conditions for search
     * @return Product list that meet the conditions
     */
    List<Product> getProduct(Product product);
}
