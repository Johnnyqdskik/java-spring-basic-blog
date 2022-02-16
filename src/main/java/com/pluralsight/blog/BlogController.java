package com.pluralsight.blog;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class BlogController {

    @GetMapping("thyme")
    public String listPosts(Map<String, Object>model) {
        model.put ("title", "Blog Post 1");
        return "home";
    }



}
