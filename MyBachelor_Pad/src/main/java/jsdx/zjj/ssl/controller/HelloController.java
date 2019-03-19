package jsdx.zjj.ssl.controller;

import jsdx.zjj.ssl.service.TRoomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private TRoomerService roomerService;

    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("newroom")
    public String newRoom() {
        return "newroom";
    }

    @RequestMapping("roomdetail")
    public String roomDetail() {
        return "roomdetail";
    }


}
