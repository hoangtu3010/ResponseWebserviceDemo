package com.example.Demo3.repository;

import com.example.Demo3.entity.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    public static List<Product> productList = new ArrayList<>();

    public ProductRepository() {
        productList.add(new Product(1, "Product 1", new BigDecimal(10)));
        productList.add(new Product(2, "Product 2", new BigDecimal(18)));
        productList.add(new Product(3, "Product 3", new BigDecimal(12)));
        productList.add(new Product(4, "Product 4", new BigDecimal(20)));
        productList.add(new Product(5, "Product 5", new BigDecimal(28)));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public Product save(Product product) {
        productList.add(product);
        return product;
    }

    @Override
    public Product update(Integer id, Product updateProduct) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                product.setName(updateProduct.getName());
                product.setPrice(updateProduct.getPrice());
                return updateProduct;
            }
        }

        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)){
                productList.remove(productList.get(i));
                return true;
            }
        }

        return false;
    }

    @Override
    public Product findById(Integer id) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
