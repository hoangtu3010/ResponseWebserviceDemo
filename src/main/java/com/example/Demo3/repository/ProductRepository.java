package com.example.Demo3.repository;

import com.example.Demo3.entity.Product;
import com.example.Demo3.model.GenericModel;

import java.math.BigDecimal;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private final GenericModel<Product> productModel = new GenericModel<>(Product.class);

    public ProductRepository() {
        if (productModel.getAll().size() <= 0){
            productModel.save(new Product(1, "Product 1", new BigDecimal(10)));
            productModel.save(new Product(2, "Product 2", new BigDecimal(18)));
            productModel.save(new Product(3, "Product 3", new BigDecimal(12)));
            productModel.save(new Product(4, "Product 4", new BigDecimal(20)));
            productModel.save(new Product(5, "Product 5", new BigDecimal(28)));
        }
    }

    @Override
    public List<Product> findAll() {
        return productModel.getAll();
    }

    @Override
    public Product save(Product product) {
        productModel.save(product);
        return product;
    }

    @Override
    public Boolean update(Integer id, Product updateProduct) {
        Product existProduct = productModel.findById(id);

        existProduct.setName(updateProduct.getName());
        existProduct.setPrice(updateProduct.getPrice());

        return productModel.update(id, existProduct);
    }

    @Override
    public Boolean delete(Integer id) {
        return productModel.delete(id);
    }

    @Override
    public Product findById(Integer id) {
        return productModel.findById(id);
    }
}
