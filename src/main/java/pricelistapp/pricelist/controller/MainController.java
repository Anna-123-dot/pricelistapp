package pricelistapp.pricelist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String goToSPersons() {
        return "redirect:/index";
    }

    @GetMapping(value = "/index")
    public String showIndex() {
        return "index";
    }

    @GetMapping(value = "/index/login")
    public String showLogin() {
        return "login";
    }


    @GetMapping(value = "/index/products")
    public String showProducts() {
        return "products";
    }


    @GetMapping(value = "/index/contact")
    public String showContact() {
        return "contact";
    }


}
