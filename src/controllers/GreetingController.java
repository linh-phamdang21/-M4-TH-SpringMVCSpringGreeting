package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@Controller
//public class GreetingController {
//    @GetMapping("/greeting")
//    public String greeting(){
//        return "index";
//    }
//}

@Controller
public class GreetingController{
    @GetMapping("/greeting")
    public String greeting(@RequestParam String myname, Model model){
        model.addAttribute("name", myname);
        return "index";
    }
}