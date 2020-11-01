package ru.phantomhunter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.phantomhunter.beans.Product;
import ru.phantomhunter.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @RequestMapping(method = RequestMethod.GET)
    public String productsList (Model model) {
        List<Product> products = productService.getAll();
        System.out.println(products);
        model.addAttribute("products",products);
        return "ProductsList";
    }
}
