package com.example.mavenproject.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FirstController {
    @GetMapping
    public String helloWorld(){
        return "Приложение запущено!";
    }
    @GetMapping("part/to/info")
    public String page(@RequestParam String info){
        return "Информация:" +
                " имя ученика: Эсмира. " +
                " название проекта: MavenProject. " +
                " дата создания проекта: 03.01.2023. " +
                " Мое первое веб приложение. "+ info;
    }
}