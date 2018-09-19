package com.zxw.ruiw.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String Home(){
        return  "redirect:/swagger-ui.html";
    }
}

