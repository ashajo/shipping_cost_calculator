package se.lexicon.shipping_cost_calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShippingController {
    @GetMapping("/form")
    public String addBoxForm() {
        return "BoxForm";
    }
        @GetMapping("/showlist")
    public String showBoxList(){
        return "ShowBoxList";


    }
}
