package ru.levelup.l3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calc")
public class MyMathController {

    @Autowired
    MathService mathService;


    @GetMapping("/sum/{arg1}/{arg2}")
    public int sum(@PathVariable("arg1") int arg1,
                   @PathVariable("arg2") int arg2) {

        return mathService.sumM(arg1, arg2);
    }

    @GetMapping("/multiply/{arg1}/{arg2}")
    public int multiply(@PathVariable("arg1") int arg1,
                   @PathVariable("arg2") int arg2) {
        return mathService.multiplyM(arg1, arg2);
    }

    @GetMapping("/devide/{arg1}/{arg2}")
    public int devide(@PathVariable("arg1") int arg1,
                   @PathVariable("arg2") int arg2) {
        return mathService.devideM(arg1, arg2);
    }

    @GetMapping("/minus/{arg1}/{arg2}")
    public int minus(@PathVariable("arg1") int arg1,
                   @PathVariable("arg2") int arg2) {
        return mathService.minusM(arg1, arg2);
    }

}
