package com.example.Demo3.resource;


import com.example.Demo3.entity.Product;
import com.example.Demo3.repository.ProductRepository;

import javax.ws.rs.*;
import java.util.List;

@Path("/products")
@Produces("application/json")
@Consumes("application/json")
public class ProductResource {
    private final ProductRepository productRepository;

    public ProductResource() {
        productRepository = new ProductRepository();
    }

    @GET
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @GET
    @Path("{id}")
    public Product findById(@PathParam("id") Integer id){
        return productRepository.findById(id);
    }

    @POST
    public Product save(Product product){
        return productRepository.save(product);
    }

    @PUT
    @Path("{id}")
    public Boolean update(@PathParam("id") Integer id, Product product){
        return productRepository.update(id, product);
    }

    @DELETE
    @Path("{id}")
    public Boolean update(@PathParam("id") Integer id){
        return productRepository.delete(id);
    }
}
