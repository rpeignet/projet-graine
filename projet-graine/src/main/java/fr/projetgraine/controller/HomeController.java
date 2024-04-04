package fr.projetgraine.controller;

import fr.projetgraine.business.Recette;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("home")
public class HomeController {
    @GetMapping("")
    public String findAll(Model model){
        return "home";
    }
}
