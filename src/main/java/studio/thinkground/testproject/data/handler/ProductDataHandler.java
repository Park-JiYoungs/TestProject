package studio.thinkground.testproject.data.handler;

import studio.thinkground.testproject.data.entity.ProductEntity;

public interface ProductDataHandler {

    ProductEntity saveProductEntity(String productId, String productName, int productPrice, int priceStock);
    ProductEntity getProductEntity(String productId);
}