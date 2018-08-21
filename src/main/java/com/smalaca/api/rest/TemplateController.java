package com.smalaca.api.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/template")
public class TemplateController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
