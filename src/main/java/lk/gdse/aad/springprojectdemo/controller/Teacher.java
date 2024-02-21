package lk.gdse.aad.springprojectdemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class Teacher {
    @GetMapping
    void getTeachersData(){
        System.out.println("Get Teacher Data");
    }

    @PostMapping
    void justPostRequest(){
        System.out.println("Just post req");
    }

    @PostMapping("/{category}")
    void pickVariable(@PathVariable ("category") String category){
        System.out.println("Picked Variable : " +category);
    }

    @PostMapping("/{category}/{level}")
    void pickVariable(@PathVariable ("category") String category, @PathVariable("level") int level){
        System.out.println("Picked Variable : " +category+ " And Level :" +level);
    }

    @PostMapping("/{references:R\\d{4}}")
    void givenReferences(@PathVariable ("references") String references){
        System.out.println("references is : "+references);
    }

    @PostMapping(params = {"id","name"})
    void getParamDetails(@RequestParam("id") String id, @RequestParam("name") String name){
        System.out.println("Get Param Details :"+ "name "+name +  " id "+id);
    }

    @PostMapping(params = {"id"})
    String getParamDetails(@RequestParam("id") String id){
        System.out.println("Get Param Details : id "+id);
        return "Get Param Details : id "+id;
    }
}
