package com.fsk.generateproject.javacontroller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java-controller")
@RequiredArgsConstructor
public class JavaController {

    @GetMapping("/")
    public String hello() {
        return "Hello Project";
    }

}
