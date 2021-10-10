package ru.levelup.l3;


import org.springframework.web.bind.annotation.*;

import static java.util.Optional.ofNullable;

@RestController
@RequestMapping("/greeting")
public class MyRestController {

    class Student {
        String firstName;
        String lastName;
        String group;
    }

    @GetMapping("/{name}")
    public String sayHello(@PathVariable(value = "name", required = false) String name) {
        return "Hello, " + ofNullable(name).orElse("world");
    }

    @GetMapping("/{arg1}/{arg2}")
    public String test(@PathVariable("arg1") String arg1,
                       @PathVariable("arg2") String arg2) {
        return "";
    }

    @PostMapping("/update")
    public String update(@RequestParam Student student) {
        return "";
    }

    @PostMapping("/update2")
    public String update2(@RequestBody Student student) {
        return "";
    }
}
