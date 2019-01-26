package annotationlearing.zhangll.transaction.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        System.out.println("hee");
        return "aaa";
    }
}