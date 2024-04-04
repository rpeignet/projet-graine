package fr.projetgraine.controller;

import fr.projetgraine.business.Recette;
import fr.projetgraine.business.TypeDeGraine;
import fr.projetgraine.service.RecetteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("recette")
public class RecetteController {
    private RecetteService recetteService;

    @GetMapping("")
    public String findAll(Model model){
        List<Recette> recettes = recetteService.findAll();
        model.addAttribute("recettes", recettes);
        return "recette/recette_liste";
    }

    @GetMapping("/findGrainesById")
    public String findGrainesById(@RequestParam(name = "recetteId", required = false) Long recetteId, Model model){
        List<TypeDeGraine> graines = new ArrayList<>();
        if(recetteId != null){
            graines = recetteService.findGrainesById(recetteId);
        }
        model.addAttribute("graines", graines);
        return "recette/recette_details";
    }
}
