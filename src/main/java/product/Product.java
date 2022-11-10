package product;

import lombok.Data;

/**
 * 상품의 데이터를 관리하기 위한 VO
 */
@Data
public class Product {
    long id;
    String name;
    int price;
    // add else
}
