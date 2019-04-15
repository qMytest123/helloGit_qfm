package com.qfmt.hellogit.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value="/wel", method = RequestMethod.GET)
    public String show(Model model){

        System.out.println("modify");
        model.addAttribute("welcome","hello git");
        return "result";
    }
}
