package ru.phantomhunter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public String getById(Model model, @PathVariable("id") Integer id){
        Product byId = productService.getId(id);
        model.addAttribute("product", byId == null ? new Product():byId);
        return "Products";
    }
    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String getFormNewProduct(Model model){
        //model.addAttribute("product",new Product());
        return "NewProduct";
    }
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String addNewProduct(Product product){
        Product savedProduct = productService.save(product);
        System.out.println("Saved Product");
        return "redirect:/products/";
    }
}
