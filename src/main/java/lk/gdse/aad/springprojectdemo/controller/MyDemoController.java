package lk.gdse.aad.springprojectdemo.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mycontroller")
public class MyDemoController {
    @GetMapping
    public void getData(){
        System.out.println("Get Data");
    }
}
