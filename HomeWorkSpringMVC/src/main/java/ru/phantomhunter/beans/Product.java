package ru.phantomhunter.beans;

public class Product {
    private static int idP = 0;
    private Integer id;
    private String title;
    private double cost;

    public Product() {
        id = idP++;
    }
    public Product(String title, Double cost) {
        id = idP++;
        this.title = title;
        this.cost = cost;
    }
    public Integer getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toString(){
        return id + " - " + title + " - " + cost;
    }
}
