package pricelistapp.pricelist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pricelistapp.pricelist.model.Product1Dto;
import pricelistapp.pricelist.model.Product2Dto;
import pricelistapp.pricelist.service.Product1Service;
import pricelistapp.pricelist.service.Product2Service;

import java.util.List;

@Controller
public class ProductsController {

    @Autowired
    private Product1Service product1Service;

    @Autowired
    private Product2Service product2Service;

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

        model.addAttribute("addProduct1", new Product1Dto());

        return "addProduct1";
    }

    @RequestMapping(value = "/index/products/product1/add", method = RequestMethod.POST)
    public String createProduct1(@ModelAttribute("addProduct1") Product1Dto product1Dto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "addProduct1";
        }
        product1Service.add(product1Dto);

        return "redirect:/index/products/product1";

    }

    @RequestMapping(value = "/index/products/product1/modify", method = RequestMethod.POST)
    public String updateProduct1(@PathVariable("id") long id, Model model, BindingResult result) {

        if (result.hasErrors()) {
            return "index";
        }
        Product1Dto byId = product1Service.getById(id);
        model.addAttribute("product1", id);


        return "redirect:/index/products/product1";
    }

    @GetMapping(value = "/index/products/product1/all")
    public String findAllProductsType1(Model model) {
        List<Product1Dto> allProduct1 = product1Service.findAll();
        model.addAttribute("product1all", allProduct1);
        return "product1all";
    }

    @GetMapping(value = "/index/products/product2")
    public String showProductType2() {
        return "product2";
    }

    @GetMapping(value = "/index/products/product2/all")
    public String findAllProductsType2(Model model) {
        List<Product2Dto> allProduct2 = product2Service.findAll();
        model.addAttribute("product2all", allProduct2);
        return "product2all";

    }

    @RequestMapping(value = "/index/products/product2/add", method = RequestMethod.GET)
    public String addProduct2(Model model) {

        model.addAttribute("addProduct2", new Product2Dto());

        return "addProduct2";
    }

    @RequestMapping(value = "/index/products/product2/add", method = RequestMethod.POST)
    public String createProduct2(@ModelAttribute("addProduct2") Product2Dto product2Dto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "addProduct2";
        }
        product2Service.add(product2Dto);

        return "redirect:/index/products/product2";

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
