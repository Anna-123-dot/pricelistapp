package pricelistapp.pricelist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pricelistapp.pricelist.model.RegisterUserDto;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/index")
public class UserController {

    @RequestMapping(value = "/index/signup", method = RequestMethod.GET)
    public String register(Model model) {
        model.addAttribute("user", new RegisterUserDto());

        return "signup";
    }

    public String register(@ModelAttribute("user") @Valid Object user, BindingResult bindingResult) {
        return "redirect:/index/login";
    }


}
