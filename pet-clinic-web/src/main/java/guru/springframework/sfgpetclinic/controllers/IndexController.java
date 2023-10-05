package guru.springframework.sfgpetclinic.controllers;

/*
    Created by tylermckenney on 9/30/23.
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler() {
        return "notimplemented";
    }
}
