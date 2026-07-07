package br.com.taigoti.powerpixel.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/hello")
public class HelloWorldController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String helloWorldGET() {
        return "getting the Hello World!";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String helloWorldPOST() {
        return "posting the Hello World!";
    }
}
