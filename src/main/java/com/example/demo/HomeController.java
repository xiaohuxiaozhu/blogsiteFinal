package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/BlogSite")
    public String blogSitePage(){
        return "BlogSite";
    }

    @RequestMapping("/About")
    public String aboutPage(){
        return "About";
    }

    @RequestMapping("/ApplyNow")
    public String applyNowPage(){
        return "ApplyNow";
    }

    @RequestMapping("/Profile")
    public String profilePage(){
        return "Profile";
    }

    @RequestMapping("/CoreJava")
    public String coreJavaPage(){
        return "CoreJava";
    }

    @RequestMapping("/Github")
    public String githubPage(){
        return "Github";
    }

    @RequestMapping("/Object-orientedJava")
    public String objectPage(){
        return "Object-orientedJava";
    }

    @RequestMapping("/HTML-CSS-Bootstrap")
    public String htmlPage(){
        return "HTML-CSS-Bootstrap";
    }



}
