package lk.gdse.aad.springprojectdemo.teory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher??")
public class Teacher1 {
    @GetMapping
    void getTeacherData(){
        System.out.println("Get Teacher1 Data");
    }
}
