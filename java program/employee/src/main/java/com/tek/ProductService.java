package com.tek;

import java.util.HashMap;
import java.util.Map;

public class ProductService {

    Map<Integer,Product> productMap=new HashMap<Integer, Product>();
    public Product addProductDetail(Product product){
        Product put = productMap.put(product.getProductId(), product);
        return put;
    }

    public Map<Integer, Product> getProductMap(){
        return productMap;
    }
}
