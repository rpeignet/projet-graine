package fr.projetgraine.controller;

import fr.projetgraine.business.Famille;
import fr.projetgraine.business.TypeDeGraine;
import fr.projetgraine.service.FamilleService;
import fr.projetgraine.service.TypeDeGraineService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class TypeGraineController {
    private TypeDeGraineService typeDeGraineService;

    private FamilleService familleService;

    @GetMapping("/listeTypeGraine")
    public String afficherListeRecettes(@RequestParam(name = "familleId", required = false) Long familleId, Model model) {
        List<Famille> familles = familleService.findAll();
        List<TypeDeGraine> typeDeGraines;
        if(familleId != null){
            typeDeGraines = typeDeGraineService.findByIdFamille(familleId);
        }else{
            typeDeGraines = typeDeGraineService.findAll();
        }
        model.addAttribute("familles", familles);
        model.addAttribute("typeDeGraines", typeDeGraines);
        return "graines_potagere_liste";
    }
}