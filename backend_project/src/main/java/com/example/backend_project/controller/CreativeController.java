package com.example.backend_project.controller;

import com.example.backend_project.pojo.Creative;
import com.example.backend_project.service.CreativeService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@Controller
//public class CreativeController {
//    @Resource
//    CreativeService creativeService;
//    @PostMapping("/submit")
//    public String submit(@RequestParam("creativeId") String creativeId, Model model){
//        Creative creative = creativeService.getCreativeById(Integer.valueOf(creativeId));
//        model.addAttribute("creative",creative);
//        return "index";
//    }
//    @GetMapping("/")
//    public String index(){
//        return "index";
//    }
//}
@RestController
public class CreativeController {
    @Resource
    CreativeService creativeService;
    @PostMapping("/submit")
    public Creative submit(@RequestParam("creativeId") String creativeId, Model model){
        //model.addAttribute("creative",creative);
        return creativeService.getCreativeById(creativeId);
    }
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @PostMapping("/add")
    public ResponseEntity<Creative> add(@RequestBody Creative creative){
        creativeService.setCreative(creative);
        return ResponseEntity.ok(creative);
    }
}
