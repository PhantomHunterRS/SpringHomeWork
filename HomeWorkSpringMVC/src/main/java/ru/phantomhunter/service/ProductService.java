package ru.phantomhunter.service;

import org.springframework.stereotype.Service;
import ru.phantomhunter.beans.Product;
import ru.phantomhunter.beans.ProductRepository;

import java.util.Comparator;
import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRep;

    public ProductService (ProductRepository productRep){
        this.productRep = productRep;
    }
    public Product getId(int id){
        return productRep.getById(id);
    }
    public List<Product> getAll(){
        List<Product> products = productRep.getProducts();
        products.sort(Comparator.comparing(Product::getId));
        return products;
    }
    public Product save(Product product){
        return productRep.save(product);
    }
}
