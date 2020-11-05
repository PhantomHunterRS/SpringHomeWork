package ru.phantomhunter.beans;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;


public class Sell {
    private Integer id;
    private String sellNameClient;
    private Data data;
    private Product product;
    private long amount;
    private double price;

    ProductRepository productRepository = new ProductRepository();

    public Sell(int idProduct,long amount,String client) {
        sellNameClient = client;
        this.amount = amount;
        for (Product productSell:productRepository.getProducts()) {
          if (productSell.getId() == idProduct){
              product = productSell;
              price = productSell.getCost();
          }
        };

    }

}
