package com.interest.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class CustomerController {

 @GetMapping("/Hello")
public String intro(Model model){
  model.addAttribute("message","Welcome to my interest calculator");
 return "index";
}

}
