package guru.springframework.sfgpetclinic.controllers;

/*
    Created by tylermckenney on 9/30/23.
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"","/", "/index", "/index.html"})
    public String listVets(){

        return "vets/index";
    }
}