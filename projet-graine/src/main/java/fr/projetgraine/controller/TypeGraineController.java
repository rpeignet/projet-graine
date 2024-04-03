/*package fr.projetgraine.controller;

import fr.projetgraine.business.TypeDeGraine;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TypeGraineController {
    @GetMapping("/listeTypeGraine")
    public String afficherListeRecettes(Model model) {

        List<TypeDeGraine> typeDeGraines = new ArrayList<>();
        typeDeGraines.add(new TypeDeGraine());
        typeDeGraines.add(new TypeDeGraine());
        typeDeGraines.add(new TypeDeGraine());

        model.addAttribute("typeDeGraines", typeDeGraines);
        return "graines_potagere_liste"; // Nom du fichier HTML Thymeleaf sans l'extension
    }
}
*/