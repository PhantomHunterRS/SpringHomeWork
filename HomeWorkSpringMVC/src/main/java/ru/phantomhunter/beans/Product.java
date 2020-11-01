package ru.phantomhunter.beans;

public class Product {
    private static long idP = 0;
    private Long id;
    private String title;
    private Double cost;

    public Product() {
        id = ++idP;
    }
    public Product(String title, Double cost) {
        id = ++idP;
        this.title = title;
        this.cost = cost;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return title;
    }
    public void setName(String title) {
        this.title = title;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
}
