package io.pontoon.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @GetMapping(value = "/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("home");

        Map<String, Object> map = new HashMap<>();
        map.put("name", "Bamdule");
        map.put("date", LocalDateTime.now());

        modelAndView.addObject("data", map);

        return modelAndView;
    }
}