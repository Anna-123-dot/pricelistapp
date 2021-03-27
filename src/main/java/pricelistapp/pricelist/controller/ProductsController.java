package pricelistapp.pricelist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pricelistapp.pricelist.entity.Product1Entity;
import pricelistapp.pricelist.model.Product1Dto;
import pricelistapp.pricelist.service.ProductsService;

@Controller
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @GetMapping(value = "/index/products")
    public String showProducts() {
        return "products";
    }

    @GetMapping(value = "/index/products/product1")
    public String showProductType1() {
        return "product1";
    }


    @RequestMapping(value = "/index/products/product1/add", method = RequestMethod.GET)
    public String addProduct1(Model model) {

        model.addAttribute("addProduct", new Product1Dto());

        return "addProduct";
    }

    @RequestMapping(value = "/index/products/product1/add", method = RequestMethod.POST)
    public String createProduct1(@ModelAttribute("addProduct") Product1Entity product1Entity, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "addProduct";
        }

        productsService.add(product1Entity);

        return "redirect:/index";
    }

    @RequestMapping(value = "/index/products/product1/modify", method = RequestMethod.POST)
    public String updateProduct1(@PathVariable("id") long id, Model model, BindingResult result) {

        if (result.hasErrors()) {
            return "index";
        }
        Product1Entity byId = productsService.getById(id);
        model.addAttribute("product1", id);


        return "redirect:/index/products/product1";
    }


    @GetMapping(value = "/index/products/product2")
    public String showProductType2() {
        return "product2";
    }

    @GetMapping(value = "/index/products/product3")
    public String showProductType3() {
        return "product3";
    }

    @GetMapping(value = "/index/products/product4")
    public String showProductType4() {
        return "product4";
    }

    @GetMapping(value = "/index/products/product5")
    public String showProductType5() {
        return "product5";
    }

    @GetMapping(value = "/index/products/product6")
    public String showProductType6() {
        return "product6";
    }

}
