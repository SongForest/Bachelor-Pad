package jsdx.zjj.ssl.controller;

import jsdx.zjj.ssl.service.TLoginService;
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

    @Autowired
    private TLoginService loginService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("indexMap",loginService.MapIndex());
        return "index";
    }

    @RequestMapping("/room/new")
    public String newRoom() {
        return "newroom";
    }

    @RequestMapping("/room/detail")
    public String roomDetail() {
        return "roomdetail";
    }


}
