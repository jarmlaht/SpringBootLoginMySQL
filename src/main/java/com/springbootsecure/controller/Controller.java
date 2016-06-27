/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootsecure.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author bearadmin
 */
@org.springframework.stereotype.Controller
@ComponentScan
public class Controller {
    
    @RequestMapping("/")
    public String root() {
        System.out.println("home");
        return "home";
    }   
    
    @RequestMapping("/home")
    public String home() {
        System.out.println("home");
        return "home";
    }   

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "hello";
    }

    @RequestMapping("/admin")
    public String helloAdmin() {
        System.out.println("admin");
        return "admin";
    }
    
    @RequestMapping("/login")
    public String login() {
        System.out.println("login");
        return "login";
    }      
    
}
