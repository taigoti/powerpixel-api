package br.com.taigoti.powerpixel.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/hello")
public class HelloWorldController {

    //GET por meio de endpoint '/v1/hello/{id}
    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)  //HTTP 200
    public String getWithId(@PathVariable("id") String id) {
        return "getting the Hello World with " + id + "!";
    }

    //GET por meio de parâmetros
    @GetMapping
    @ResponseStatus(HttpStatus.OK)  //HTTP 200
    public String getDefault(@RequestParam(value = "name", required = false) String name) {
        return "getting the Hello World! without id " + name;
    }

    //POST com conteúdo no body
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)  //HTTP 201
    public String helloWorldPOST(@RequestBody String name) {
        return "posting the Hello World!, " + name;
    }
}
