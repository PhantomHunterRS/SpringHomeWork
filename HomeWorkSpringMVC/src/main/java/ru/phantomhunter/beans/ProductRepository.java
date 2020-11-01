package ru.phantomhunter.beans;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    {
        products.add(new Product("Milk.House in the village",90.00));
        products.add(new Product("Dragee.M&M's Peanut",100.00));
        products.add(new Product("Buckwheat groats",75.00));
        products.add(new Product("Mineral water Edelweiss carbonated",33.00));
        products.add(new Product("Condensed whole milk with sugar",123.00));
        products.add(new Product("Hercules Flakes",50.00));
    }
    public List<Product> getProducts() {
        return products;
    }
    public void getListProduct(){
        for (Product one:products) {
            System.out.println(one.getId()+ " "+ one.getName() + " "+ one.getCost());
        }
    }

    public Product getById(int id) {
        return products.get(id);
    }

}
