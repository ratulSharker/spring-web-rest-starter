package com.project.projectstarter.web.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebHelloController {

    @GetMapping(value = "/hello")
    public String helloIndex() {

        return "hello/index";
    }
}
