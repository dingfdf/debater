package indi.df.debater.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
    @RequestMapping("")
    public String hello(){
        return "hello";
    }
}
