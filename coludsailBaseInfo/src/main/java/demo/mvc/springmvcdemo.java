package demo.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springmvcdemo {

    @RequestMapping("/hello")
    public String index(){
        return "hello";
    }
}
