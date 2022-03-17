package com.example.micro2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posty")
public class Controller {

    private static int staticId =0;

    @PostMapping("/post")
    public String post(@RequestBody Dto dto) {
        System.err.println(dto);
        return "ID: "  + staticId++ + ", NAME: " + dto.getName();
    }
}
