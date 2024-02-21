package lk.gdse.aad.springprojectdemo.teory.controller;

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
