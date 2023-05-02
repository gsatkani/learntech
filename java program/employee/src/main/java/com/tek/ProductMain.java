package com.tek;

import com.model.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class ProductMain {
    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ProductService service=new ProductService();
        Product product=new Product();
        System.out.println("Product Id");
        product.setProductId(Integer.parseInt(reader.readLine()));
        System.out.println("Product Name");
        product.setProductName(reader.readLine());
        System.out.println("product Price");
        product.setProductPrice(Double.parseDouble(reader.readLine()));

        Product addProduct = service.addProductDetail(product);
        System.out.println(addProduct);
        if(addProduct!=null){
            System.out.println(product.getProductId() + " is added");
        }
        else{
            System.out.println("No product added");
        }

        Map<Integer,Product> productMap = service.getProductMap();
        for( Map.Entry<Integer,Product> map : productMap.entrySet()){
            System.out.println("---"+map.getKey()+"----");
            Product prod = map.getValue();
            System.out.println(prod.getProductId());
            System.out.println(prod.getProductName());
            System.out.println(prod.getProductPrice());
        }
    }
}
