package sk.tmconsulting.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import sk.tmconsulting.eshop.model.Objednavka;
import sk.tmconsulting.eshop.service.ObjednavkaServiceImpl;

@Controller
public class EshopController {
    @Autowired
    ObjednavkaServiceImpl objednavkaServiceImplObjekt;


    @GetMapping("/") // lomka reprezentuje korenovu /hlavnu/ adresu
    public String uvodnaStranka() {
        return "index";
    }

    @GetMapping("/vytvor-objednavku")
        // Reaguje na URI adresu v internetovom prehliadacipublic
    String vytvorObjednavku(Model model) {
        Objednavka objednavkaObjekt = new Objednavka();// Vytvorime prazdnu objednavku ...
        model.addAttribute("objednavkaObjektThymeleaf", objednavkaObjekt); // ... ktoru odosleme do HTML stranky s podporou Thymeleaf
        return "vytvor-novu-objednavku"; // HTML stranka, v ktorej dany objekt (resp. atribut objednavkaObjektThymeleaf) naplnime}
    }

    @PostMapping("/uloz-zaznam")
    public String ulozZaznam(@ModelAttribute("vydavokObjektThymeleaf") Objednavka objednavkaObjekt) {
        objednavkaServiceImplObjekt.ulozObjednavku(objednavkaObjekt); // Ulozime objednavku a nasledne ...
         return "redirect:/"; // ... sa presmeruje na hlavnú stranku}
    }
}