package com.example.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapstoneController
{
    @RequestMapping("/")
    public String hello()
    {
        return "hello";
    }
}