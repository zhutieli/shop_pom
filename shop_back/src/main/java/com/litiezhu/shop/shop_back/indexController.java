package com.litiezhu.shop.shop_back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping("/")
    public  String welcome(){
        return "index";
    }
}
