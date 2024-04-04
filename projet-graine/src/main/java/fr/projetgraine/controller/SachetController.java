package fr.projetgraine.controller;

import fr.projetgraine.DTO.SachetDTO;
import fr.projetgraine.business.Famille;
import fr.projetgraine.business.Sachet;
import fr.projetgraine.business.TypeDeGraine;
import fr.projetgraine.service.SachetService;
import fr.projetgraine.service.TypeDeGraineService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class SachetController {
    private SachetService sachetService;
    private TypeDeGraineService typeDeGraineService;
    @GetMapping("/listeSachets")
    public String afficherListeSachets(Model model) {
        List<Sachet> sachets = sachetService.findAll();
        List<TypeDeGraine> typeDeGraines = typeDeGraineService.findAll();
        model.addAttribute("sachets", sachets);
        model.addAttribute("typeDeGraines", typeDeGraines);
        return "sachets_fournisseur";
    }
    @PostMapping("/insertSachet")
    public String insertSachet(@RequestParam("poidsEnGrammes") int poidsEnGrammes,
                             @RequestParam("prixEnEuros") float prixEnEuros,
                             @RequestParam("idTypeDeGraine") String idTypeDeGraine, Model model){
        SachetDTO sachetDTO = new SachetDTO(poidsEnGrammes, prixEnEuros, idTypeDeGraine);
        sachetService.insertSachet(sachetDTO);
        return afficherListeSachets(model);
    }
}