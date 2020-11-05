package ru.phantomhunter.beans;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static int idP = 0;
    private Integer id;
    private String nameClient;
    private List<Sell> cartClient = new ArrayList<>();

    public Client() {
        id = idP++;
    }

    public Client(String nameClient) {
        id = idP++;
        this.nameClient = nameClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public List<Sell> getCart() {
        return cartClient;
    }
    public void addSells(Sell sell){
        cartClient.add(sell);
    }
}
