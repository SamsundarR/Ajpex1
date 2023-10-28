package com.forms.formshandling.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.forms.formshandling.Model.User;

@Controller
public class Control {
    @RequestMapping("/register")
    public String registerform(Model model)
    {
        User user = new User();
        model.addAttribute("user",user);
        List<String> LocationList = Arrays.asList("Darmapuri","Chennai","Coimbatore");
        model.addAttribute("LocationList", LocationList);
        return "registrationform";
    }

    @PostMapping("/registersucc")
    public String submitForm(@ModelAttribute("user") User usr) {
        System.out.println("Hi");
        return "registartionsucc";
    }
}    


