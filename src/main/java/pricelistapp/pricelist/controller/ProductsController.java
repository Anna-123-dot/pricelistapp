package pricelistapp.pricelist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductsController {

    @GetMapping(value = "/index/products")
    public String showProducts() {
        return "products";
    }

    @GetMapping(value = "/index/products/product1")
    public String showProductNo1() {
        return "product1";
    }

    @GetMapping(value = "/index/products/product2")
    public String showProductNo2() {
        return "product2";
    }

    @GetMapping(value = "/index/products/product3")
    public String showProductNo3() {
        return "product3";
    }

    @GetMapping(value = "/index/products/product4")
    public String showProductNo4() {
        return "product4";
    }

    @GetMapping(value = "/index/products/product5")
    public String showProductNo5() {
        return "product5";
    }

    @GetMapping(value = "/index/products/product6")
    public String showProductNo6() {
        return "product6";
    }

}
