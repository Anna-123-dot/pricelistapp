package pricelistapp.pricelist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pricelistapp.pricelist.model.RegisterUserDto;
import pricelistapp.pricelist.service.UserService;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index/signup", method = RequestMethod.GET)
    public String register(Model model) {

        model.addAttribute("user", new RegisterUserDto());

        return "signup";
    }

    @RequestMapping(value = "/index/signup", method = RequestMethod.POST)
    public String register(@ModelAttribute("user") @Valid RegisterUserDto user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "/signup";
        }

        userService.registerUser(user);

        return "redirect:/index/login";
    }


}
